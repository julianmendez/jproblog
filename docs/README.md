# [JProbLog](https://julianmendez.github.io/jproblog/)

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)][license]
[![Maven Central](https://img.shields.io/maven-central/v/de.tu-dresden.inf.lat.jproblog/jproblog/badge.svg?label=Maven%20Central)][maven-central]
[![build](https://github.com/julianmendez/jproblog/workflows/Java%20CI/badge.svg)][build-status]

**JProbLog** is a [Java][java] adapter for [ProbLog][problog].


## Download

* [library JAR file][jar-file]
* [The Central Repository][central-repository]
* as dependency:

```xml
<dependency>
  <groupId>de.tu-dresden.inf.lat.jproblog</groupId>
  <artifactId>jproblog</artifactId>
  <version>0.2.0</version>
</dependency>
```


## Author

[Julian Alfredo Mendez][author]


## License

This software is distributed under the [Apache License Version 2.0][license].


## Release notes

See [release notes][release-notes].


## Source code

To check out and compile the project, use:

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

The bundles uploaded to [Sonatype][sonatype] are created with:

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

In case you need more information, please contact [julianmendez][author].

[author]: https://julianmendez.github.io
[license]: https://www.apache.org/licenses/LICENSE-2.0.txt
[maven-central]: https://search.maven.org/artifact/de.tu-dresden.inf.lat.jproblog/jproblog
[build-status]: https://github.com/julianmendez/jproblog/actions
[central-repository]: https://repo1.maven.org/maven2/de/tu-dresden/inf/lat/jproblog/
[jar-file]: https://sourceforge.net/projects/latitude/files/jproblog/0.2.0/jproblog-0.2.0.jar/download
[release-notes]: https://julianmendez.github.io/jproblog/RELEASE-NOTES.html
[sonatype]: https://oss.sonatype.org
[java]: https://www.oracle.com/java/technologies/
[problog]: https://dtai.cs.kuleuven.be/problog/


