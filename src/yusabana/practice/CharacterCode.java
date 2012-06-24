package yusabana.practice;

import java.util.HashMap;


public class CharacterCode {

    private HashMap<Integer, String> charMap = new HashMap<Integer, String>();

    public CharacterCode() {
        //文字コードマップの初期化
        charMap.put(1, "ONE");
        charMap.put(2, "TWO");
        charMap.put(3, "THREE");
        charMap.put(4, "FOUR");
        charMap.put(5, "FIVE");
    }

    public String getCharacter(int num) {
        if(!charMap.containsKey(num)) {
            throw new IllegalArgumentException("引数が不正です");
        }
        return charMap.get(num);
    }

}
