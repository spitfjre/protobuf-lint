# protobuf-lint

## Installation

### Buf

For local installation, follow instructions from [here](https://docs.buf.build/installation/).

### Clang

```shell
# Debian/Ubuntu
apt install clang-format
```

## Usage

### Format

```shell
# Shell (npm run lint:local)
buf lint

# Docker (npm run lint)
docker run --volume "$(pwd):/workspace" --workdir /workspace bufbuild/buf lint
```

### Build

```shell
# Shell (npm run build:local)
buf build

# Docker (npm run build)
docker run --volume "$(pwd):/workspace" --workdir /workspace bufbuild/buf build
```

### Lint

```shell
# Shell (npm run lint:local)
buf lint

# Docker (npm run lint)
docker run --volume "$(pwd):/workspace" --workdir /workspace bufbuild/buf lint
```

### Breaking

```shell
# Shell (npm run breaking:local)
buf breaking --against ".git#branch=master"

# Docker (npm run breaking)
docker run --volume "$(pwd):/workspace" --workdir /workspace bufbuild/buf breaking --against ".git#branch=master"
```
