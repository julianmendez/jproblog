---
- - version: v0.2.0
  - date: '2023-12-30'
  - requirements:
    - Java 11 or higher (tested with Java 21)
    - Python 3.7 or higher (tested with Python 3.10)
  - build: mvn clean install
  - release: jproblog/target/jproblog-0.2.0.jar
  - features:
    - it downloads ProbLog 2.1
  - deprecated:
    - it does not longer support Python 2
    - it does not longer use Jython
- - version: v0.1.0
  - date: '2016-09-01'
  - requirements:
    - Java 8
    - Python 2.7 or 3.2
  - build: mvn clean install
  - release: jproblog/target/jproblog-0.1.0.jar
  - features:
    - it downloads ProbLog 2.1
    - if Python 2.7 or 3.2 is not installed, it downloads Jython 2.7.0 from the Central
      Repository, and it uses Jython instead


