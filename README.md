Gradle Plugin Blank Project
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
  * Publishing artifacts into the Maven Central Repository
  * Continuous integration support on Travis CI
  * Gradle Wrapper
  * `.gitignore` for Gradle, IDEA and Eclipse


Publishing artifacts (optional)
-------------------------------

This section explains how to publish your artifacts into the Maven Central Repository.

You must have Sonatype OSS Repository Hosting account and your own PGP key.
See [Sonatype OSS Maven Repository Usage Guide](https://docs.sonatype.org/display/Repository/Sonatype+OSS+Maven+Repository+Usage+Guide) for further information.

Your account must be provided in the properties file.
Create `~/.gradle/gradle.properties` as:
```
signing.keyId=XXXXXXXX
signing.secretKeyRingFile=/home/xxxxxxxx/.gnupg/secring.gpg
sonatypeUsername=xxxxxxxx
sonatypeFullname=xxxxxxxx
```

Your project metadata must be provided in the build script.
Modify those in [build.publish.gradle](/build.publish.gradle).

Then, just run:
```
$ ./gradlew publishMavenCentral
Enter password for PGP key XXXXXXXX:
Enter password for xxxxxxxx@oss.sonatype.org:
...
```


Contributions
-------------

Welcome.
Please send me your issues or pull requests.
