# protobuf-lint

## Installation

### Buf

For local installation, follow instructions from [here](https://docs.buf.build/installation/).

## Usage

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
