package org.springdev.guides

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class HelloControllerSpec extends Specification implements ControllerUnitTest<HelloController> {

    def setup() {
    }

    def cleanup() {
    }

    void "Hello Web API"() {
        when:"The default index action is invoked"
        controller.index()

        then:"Hello World"
        response.text == "Hello, World!"
    }
}