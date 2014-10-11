Gradle Plugin Blank Project [![Build Status](https://travis-ci.org/int128/gradle-plugin-blank.png)](https://travis-ci.org/int128/gradle-plugin-blank)
===========================

Blank template of the Gradle plugin.


How to use
----------

`git clone` and rename it.

Run `./gradlew build` to build the project.

Import the project into IDE.


Features
--------

This project contains these features:

  * Blank implementation of the plugin (see [HelloPlugin.groovy](src/main/groovy/com/example/HelloPlugin.groovy))
  * Testing with Spock (see [HelloPluginSpec.groovy](src/test/groovy/com/example/HelloPluginSpec.groovy))
  * Wiring plugin name (see [hello.properties](src/main/resources/META-INF/gradle-plugins/hello.properties))
  * Generating GroovyDoc JAR and sources JAR
  * Publishing the plugin on Bintray
  * Continuous integration support on Travis CI
  * Gradle Wrapper
  * `.gitignore` for Gradle, IDEA and Eclipse


Publish the plugin
------------------

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

Welcome.
Please send me your issues or pull requests.
