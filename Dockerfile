FROM bufbuild/buf:1.0.0-rc8 as buf

FROM ubuntu:20.04

# update
RUN apt update
RUN apt upgrade -y

# protoc
RUN apt install -y protobuf-compiler

# protoc-gen-grpc-java
RUN apt install -y wget
RUN wget https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.42.1/protoc-gen-grpc-java-1.42.1-linux-x86_64.exe \
    -O /usr/bin/protoc-gen-grpc-java
RUN chmod +x /usr/bin/protoc-gen-grpc-java

COPY --from=buf /usr/local/bin/buf /usr/local/bin/buf

ENV PATH="/usr/bin:${PATH}"
ENTRYPOINT ["/usr/local/bin/buf"]