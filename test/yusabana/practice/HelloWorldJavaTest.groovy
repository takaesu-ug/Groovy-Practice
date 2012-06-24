package yusabana.practice

import spock.lang.Specification

class HelloWorldJavaTest extends Specification {

    final HelloWorldJava obj = new HelloWorldJava();

    def "length of Spock's and his friends' names"() {
        expect:
        name.length() == length

        where:
        name    | length
        "spock" | 5
        "kirk"  | 4
        "aaa"   | 3
    }

    def "test"() {
        expect:
        obj.getHelloWorld(number) == msg

        where:
        number  | msg
        1       | "hllo"
        3       | "World"
        3       | "World"
    }
}
