Gradle Plugin Template
======================

This is a template project of Gradle plugin with blank implementation.

[![Build Status](https://travis-ci.org/int128/gradle-plugin-blank.png)](https://travis-ci.org/int128/gradle-plugin-blank)


Features
--------

This contains following features:

  * Plugin generator (see [plugin-generator.gradle](gradle/plugin-generator.gradle))
  * Blank implementation of the plugin (see [HelloPlugin.groovy](src/main/groovy/com/example/HelloPlugin.groovy))
  * Testing with Spock (see [HelloPluginSpec.groovy](src/test/groovy/com/example/HelloPluginSpec.groovy))
  * Continuous integration support on Travis CI
  * Publishing the plugin on [Bintray](https://bintray.com) and [Gradle Plugins](http://plugins.gradle.org)
  * Gradle Wrapper
  * `.gitignore` for Gradle, IDEA and Eclipse


Getting Started
---------------

Update plugin ID, group name and description in `gradle.properties`.
See also [how to submit your plugin](http://plugins.gradle.org/submit) for details.

Then, run the generate task.

```
./gradlew generatePlugin

:generatePluginClass
Generating plugin class: .../src/main/groovy/com/example/HelloPlugin.groovy
:generatePluginMetadata
Generating plugin metadata: .../src/main/resources/META-INF/gradle-plugins/com.example.hello.properties
:generatePluginTestClass
Generating plugin test: .../src/test/groovy/com/example/HelloPluginSpec.groovy
:generatePlugin

BUILD SUCCESSFUL
```

Sign up Bintray and provide your user name and API key in `~/.gradle/gradle.properties` as follows:

```ini
bintray.credential=user:apikey
```


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

Run the upload task with release version.

```sh
./gradlew -Pversion=0.1 bintrayUpload
```
