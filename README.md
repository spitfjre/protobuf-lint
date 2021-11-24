# protobuf-lint

## Installation

### Buf

For local installation, follow instructions from [here](https://docs.buf.build/installation/).

### Clang

```shell
# Debian/Ubuntu
apt install clang-format
```

### Dockerfile (bufbuild/buf patched with protoc)

```shell
docker build . -t spitfjre/buf
```

## Usage

### Format (Check)

```shell
find . -name \"*.proto\" | sed 's| |\\\\ |g' | xargs clang-format --dry-run --Werror
# or
npm run format:check
```

### Format (Write)

```shell
find . -name \"*.proto\" | sed 's| |\\\\ |g' | xargs clang-format -i
# or
npm run format:write
```

### Build

```shell
docker run --volume "$(pwd):/workspace" --workdir /workspace bufbuild/buf build
# or
npm run build
```

### Lint

```shell
docker run --volume "$(pwd):/workspace" --workdir /workspace bufbuild/buf lint
# or
npm run lint
```

### Breaking

```shell
docker run --volume "$(pwd):/workspace" --workdir /workspace bufbuild/buf breaking --against ".git#branch=master"
# or
npm run breaking
```

### Generate (Java)

```shell
docker run --volume "$(pwd):/workspace" --workdir /workspace bufbuild/buf generate
# or
npm run generate:code
```

## TODO

- Generate Documentation (markdown if possible)
