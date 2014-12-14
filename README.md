Gradle Plugin Template
======================

This is a template project of Gradle plugin with blank implementation.

[![Build Status](https://travis-ci.org/int128/gradle-plugin-blank.png)](https://travis-ci.org/int128/gradle-plugin-blank)


Features
--------

This contains following features:

  * Blank implementation of the plugin (see [HelloPlugin.groovy](src/main/groovy/com/example/HelloPlugin.groovy))
  * Testing with Spock (see [HelloPluginSpec.groovy](src/test/groovy/com/example/HelloPluginSpec.groovy))
  * Wiring plugin name (see [hello.properties](src/main/resources/META-INF/gradle-plugins/hello.properties))
  * Generating GroovyDoc JAR and sources JAR
  * Publishing the plugin on [Bintray](https://bintray.com) and [Gradle Plugins](http://plugins.gradle.org)
  * Continuous integration support on Travis CI
  * Gradle Wrapper
  * `.gitignore` for Gradle, IDEA and Eclipse


Contributions
-------------

This is an open source software licensed under the Apache License Version 2.0.
Any issues or pull requests are welcome.

### Development

JDK 7 or later is required.
Intellij IDEA is recommended.
All dependencies are downloaded by Gradle wrapper.

Travis CI will compile and test the branch on each push and pull request.

Artifacts will be published on [Bintray](https://bintray.com) and [Gradle Plugins](http://plugins.gradle.org).

### Build

Run the build task.

```sh
./gradlew build
```

### Acceptance Test

Install the artifact into the local repository and run the test task.

```sh
./gradlew install
./gradlew -p acceptance-test test
```

### Publish

Update metadata of the plugin in `gradle.properties`.

You must have Bintray account and provide your credential in `~/.gradle/gradle.properties` as follows:

```ini
bintray.credential=user:apikey
```

Run the upload task with publishing version.

```sh
./gradlew -Pversion=x.y.z bintrayUpload
```
