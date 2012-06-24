package yusabana.practice

import spock.lang.Specification

class CharacterCodeTest extends Specification {

    CharacterCode cc = new CharacterCode()

    def "数字を入力して対応した文字を返す"() {
        expect:
        cc.getCharacter(NUM) == CHARACTER

        where:
        NUM     | CHARACTER
        1       | "ONE"
        2       | "TWO"
        3       | "THREE"
        4       | "FOUR"
        5       | "FIVE"
    }

    def "対応した数値以外(1~5以外)の場合は例外"() {
        when:
        cc.getCharacter(NUM)

        then:
        thrown(IllegalArgumentException)

        where:
        NUM << [0, -1, 6, 100]
    }
}
