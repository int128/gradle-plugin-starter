package org.dstadler

import org.gradle.testfixtures.ProjectBuilder
import spock.lang.Specification

class CommonsdostPluginSpec extends Specification {

    def "apply() should load the plugin"() {
        given:
        def project = ProjectBuilder.builder().build()

        when:
        project.with {
            apply plugin: 'org.dstadler.commonsdost'
        }

        then:
        project.plugins.hasPlugin(CommonsdostPlugin)
    }

}
