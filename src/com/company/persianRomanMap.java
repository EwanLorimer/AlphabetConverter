package com.company;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class persianRomanMap {
    private BiMap<Character, String> persianToRoman;

    public persianRomanMap(){
        persianToRoman = HashBiMap.create();
        persianToRoman.put('ر',"r");
        persianToRoman.put('ذ',"z");
        persianToRoman.put('د',"d");
        persianToRoman.put('خ',"kh");
        persianToRoman.put('ح',"h");
        persianToRoman.put('چ',"ch");
        persianToRoman.put('ج',"j");
        //persianToRoman.put('ث',"");
        //persianToRoman.put('ت',"t");
        persianToRoman.put('پ',"b");
        persianToRoman.put('ا',"a");
        //persianToRoman.put('غ',"y");
        persianToRoman.put('ع',"'");
        //persianToRoman.put('ظ',"z");
        persianToRoman.put('ط',"t");
        //persianToRoman.put('ض',"z");
        persianToRoman.put('ص',"s");
        persianToRoman.put('ش',"sh");
        //persianToRoman.put('س',"s");
        persianToRoman.put('ژ',"zh");
        //persianToRoman.put('ز',"z");
        persianToRoman.put('ی',"i");
        persianToRoman.put('ه',"eh");
        persianToRoman.put('و',"oo");
        persianToRoman.put('ن',"n");
        persianToRoman.put('م',"m");
        persianToRoman.put('ل',"l");
        persianToRoman.put('گ',"g");
        persianToRoman.put('ک',"y");
        persianToRoman.put('ق',"q");
        persianToRoman.put('ف',"f");
        persianToRoman.put('ب',"be");
        persianToRoman.put('آ',"ah");
    }

    public String getRomanString(char persianInput){
        return persianToRoman.get(persianInput);
    }

    public char getPersianCharacter(String romanInput){
        return persianToRoman.inverse().get(romanInput);
    }
    public boolean valueExists(char persianInput){
        return persianToRoman.containsValue(persianToRoman.get(persianInput));
    }
    public boolean inverseValueExists(String romanInput){
        return persianToRoman.containsValue(persianToRoman.inverse().get(romanInput));
    }
}
