Gradle Plugin Blank Project
===========================

A Gradle plugin project with blank implementation.

[![Build Status](https://travis-ci.org/int128/gradle-plugin-blank.png)](https://travis-ci.org/int128/gradle-plugin-blank)


Features
--------

This contains following features:

  * Blank implementation of the plugin (see [HelloPlugin.groovy](src/main/groovy/com/example/HelloPlugin.groovy))
  * Testing with Spock (see [HelloPluginSpec.groovy](src/test/groovy/com/example/HelloPluginSpec.groovy))
  * Wiring plugin name (see [hello.properties](src/main/resources/META-INF/gradle-plugins/hello.properties))
  * Generating GroovyDoc JAR and sources JAR
  * Publishing the plugin on [Bintray](https://bintray.com)
  * Continuous integration support on Travis CI
  * Gradle Wrapper
  * `.gitignore` for Gradle, IDEA and Eclipse


Build
-----

Run the build task.

```sh
./gradlew build
```


Publish
-------

Update `gradle.properties` in the repository.

You must have Bintray account and provide its credential in `~/.gradle/gradle.properties` as follows:

```ini
bintrayUser=example
bintrayKey=secret
```

Run the upload task with publishing version.

```sh
./gradlew -Pversion=x.y.z bintrayUpload
```


Contributions
-------------

Please let me know issues and pull requests.
