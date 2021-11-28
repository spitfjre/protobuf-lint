# protobuf-lint

## Artifacts

- [HTML Documentation](https://raw.githack.com/spitfjre/protobuf-lint/master/gen/doc/index.html)
- [Java Source Files](https://github.com/spitfjre/protobuf-lint/tree/master/gen/proto/java/api/io/swagger/petstore/v2)

## Prerequisites

### Dockerfile (for formatting protobuf files with clang-format)

```shell
docker build -f fmt.Dockerfile -t spitfjre/clang-format
# or
npm run docker:build:fmt
```

### Dockerfile (bufbuild/buf patched with protoc and protoc-plugins)

```shell
docker build -f gen.Dockerfile -t spitfjre/patched-buf
# or
npm run docker:build:gen
```

## Usage

### Format-Check

```shell
docker run -v "$(pwd):/workspace" --workdir /workspace spitfjre/clang-format
# or
npm run format:check
```

### Build

```shell
docker run -v "$(pwd):/workspace" --workdir /workspace bufbuild/buf build
# or
npm run build
```

### Lint

```shell
docker run -v "$(pwd):/workspace" --workdir /workspace bufbuild/buf lint
# or
npm run lint
```

### Breaking

```shell
docker run -v "$(pwd):/workspace" --workdir /workspace bufbuild/buf breaking --against ".git#branch=master"
# or
npm run breaking
```

### Generate (Java+Doc)

```shell
docker run -v "$(pwd):/workspace" --workdir /workspace spitfjre/buf generate
# or
npm run generate
```
