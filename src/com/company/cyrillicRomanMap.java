package com.company;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.HashMap;

public class cyrillicRomanMap {
    private BiMap<Character, String> cyrillicMap;

    public cyrillicRomanMap(){
         cyrillicMap = HashBiMap.create();
         cyrillicMap.put('А',"A");
         cyrillicMap.put('а',"a");

         cyrillicMap.put('Б',"B");
         cyrillicMap.put('б',"b");

         cyrillicMap.put('В',"V");
         cyrillicMap.put('в',"v");

         cyrillicMap.put('Г',"G");
         cyrillicMap.put('г',"g");

         cyrillicMap.put('Д',"D");
         cyrillicMap.put('д',"d");

         cyrillicMap.put('Е',"E");
         cyrillicMap.put('е',"e");

         cyrillicMap.put('Ё',"Yo");
         cyrillicMap.put('ё',"yo");

         cyrillicMap.put('Ж',"Zh");
         cyrillicMap.put('ж',"zh");

         cyrillicMap.put('З',"Z");
         cyrillicMap.put('з',"z");

         cyrillicMap.put('И',"I");
         cyrillicMap.put('и',"i");

         cyrillicMap.put('Й',"Y");
         cyrillicMap.put('й',"y");

         cyrillicMap.put('К',"K");
         cyrillicMap.put('к',"k");

         cyrillicMap.put('Л',"L");
         cyrillicMap.put('л',"l");

         cyrillicMap.put('М',"M");
         cyrillicMap.put('м',"m");

         cyrillicMap.put('Н',"N");
         cyrillicMap.put('н',"n");

         cyrillicMap.put('О',"O");
         cyrillicMap.put('о',"o");

         cyrillicMap.put('П',"P");
         cyrillicMap.put('п',"p");

         cyrillicMap.put('Р',"R");
         cyrillicMap.put('р',"r");

         cyrillicMap.put('С',"S");
         cyrillicMap.put('с',"s");

         cyrillicMap.put('Т',"T");
         cyrillicMap.put('т',"t");

         cyrillicMap.put('У',"U");
         cyrillicMap.put('у',"u");

         cyrillicMap.put('Ф',"F");
         cyrillicMap.put('ф',"f");

         cyrillicMap.put('Х',"Kh");
         cyrillicMap.put('х',"kh");

         cyrillicMap.put('Ц',"Ts");
         cyrillicMap.put('ц',"ts");

         cyrillicMap.put('Ч',"Ch");
         cyrillicMap.put('ч',"ch");

         cyrillicMap.put('Ш',"Sh");
         cyrillicMap.put('ш',"sh");

         cyrillicMap.put('Щ',"Shh");
         cyrillicMap.put('щ',"shh");

         //cyrillicMap.put('Ъ',"'");
         //cyrillicMap.put('ъ',"'");

         cyrillicMap.put('Ы',"Iy");
         cyrillicMap.put('ы',"iy");

         //cyrillicMap.put('Ь',"");
         //cyrillicMap.put('ь',"");

         cyrillicMap.put('Э',"Eh");
         cyrillicMap.put('э',"eh");

         cyrillicMap.put('Ю',"Yu");
         cyrillicMap.put('ю',"yu");

         cyrillicMap.put('Я',"Ya");
         cyrillicMap.put('я',"ya");
    }
    public String getRomanString(char cyrillicInput){
         return cyrillicMap.get(cyrillicInput);
    }
    public Character getCyrillicCharacter(String romanInput){
         return cyrillicMap.inverse().get(romanInput);
    }
    public boolean valueExists(char cyrillicInput){
         return cyrillicMap.containsValue(cyrillicMap.get(cyrillicInput));
    }
    public boolean inverseValueExists(String romanInput){
         return cyrillicMap.containsValue(cyrillicMap.inverse().get(romanInput));
    }
}
