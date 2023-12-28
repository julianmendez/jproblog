# [JProbLog](https://julianmendez.github.io/jproblog/)

[![build](https://github.com/julianmendez/jproblog/workflows/Java%20CI/badge.svg)](https://github.com/julianmendez/jproblog/actions)
[![maven central](https://maven-badges.herokuapp.com/maven-central/de.tu-dresden.inf.lat.jproblog/jproblog/badge.svg)](https://search.maven.org/#search|ga|1|g%3A%22de.tu-dresden.inf.lat.jproblog%22)
[![license](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](https://www.apache.org/licenses/LICENSE-2.0.txt)

**JProbLog** is a [Java](https://www.oracle.com/technetwork/java/index.html) adapter for [ProbLog](https://dtai.cs.kuleuven.be/problog/).


## Download

* [library JAR file](https://sourceforge.net/projects/latitude/files/jproblog/0.2.0/jproblog-0.2.0.jar/download)
* [The Central Repository](https://repo1.maven.org/maven2/de/tu-dresden/inf/lat/jproblog/)
* as dependency:

```xml
<dependency>
  <groupId>de.tu-dresden.inf.lat.jproblog</groupId>
  <artifactId>jproblog</artifactId>
  <version>0.2.0</version>
</dependency>
```


## Author

[Julian Mendez](https://julianmendez.github.io)


## License

This software is distributed under the [Apache License Version 2.0](https://www.apache.org/licenses/LICENSE-2.0.txt).


## Release notes

See [release notes](https://julianmendez.github.io/jproblog/RELEASE-NOTES.html).


## Source code

To checkout and compile the project, use:

```
$ git clone https://github.com/julianmendez/jproblog.git
$ cd jproblog
$ mvn clean install
```

To compile the project offline, first download the dependencies:

```
$ mvn dependency:go-offline
```

and once offline, use:

```
$ mvn --offline clean install
```

The bundles uploaded to [Sonatype](https://oss.sonatype.org/) are created with:

```
$ mvn clean install -DperformRelease=true
```

and then:

```
$ cd jproblog/target
$ jar -cf bundle.jar jproblog-*
```

The version number is updated with:

```
$ mvn versions:set -DnewVersion=NEW_VERSION
```

where *NEW_VERSION* is the new version.


## Contact

In case you need more information, please contact @julianmendez .


