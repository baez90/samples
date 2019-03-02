# Maven CLI app with Docker

## Docker

Build image like this:

```bash
docker build -t my-image-tag .
```

Run image like this:

```bash
docker run --rm -ti my-image-tag --verbose --username=root QUEUE1
```

where `--verbose`, `--username` and `QUEUE1` are arguments that are passed to the Java app.

## Maven build

The easiest way to build the app is `mvn package`.
It's also possible to run the app from IntelliJ IDEA (don't forget to add params to your run configuration!).

## Options

[picocli](https://github.com/remkop/picocli) was used to parse CLI arguments and to run a command.
Check the docs for more examples.