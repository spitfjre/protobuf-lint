FROM ubuntu:20.04

WORKDIR /workspace

# update
RUN apt-get update
RUN apt-get upgrade -y

# clang-format
RUN apt-get install -y clang-format

CMD find /workspace -name *.proto | sed 's| |\\ |g' | xargs clang-format --dry-run --Werror
