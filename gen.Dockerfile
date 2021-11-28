FROM bufbuild/buf:1.0.0-rc8 as buf

FROM golang:1.17.3

ARG PROTOC_GEN_GRPC_JAVA_VERSION="1.42.1"

# update
RUN apt-get update
RUN apt-get upgrade -y

# wget
RUN apt-get install -y wget

# git
RUN apt-get install -y git

# protoc
RUN apt-get install -y protobuf-compiler

# protoc-gen-doc
RUN go install github.com/pseudomuto/protoc-gen-doc/cmd/protoc-gen-doc@latest

# protoc-gen-grpc-java
RUN wget https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/${PROTOC_GEN_GRPC_JAVA_VERSION}/protoc-gen-grpc-java-${PROTOC_GEN_GRPC_JAVA_VERSION}-linux-x86_64.exe \
    -O /usr/bin/protoc-gen-grpc-java
RUN chmod +x /usr/bin/protoc-gen-grpc-java

COPY --from=buf /usr/local/bin/buf /usr/local/bin/buf

ENV PATH="/usr/bin:${PATH}"
ENV PATH="/go/bin:${PATH}"
ENTRYPOINT ["/usr/local/bin/buf"]
