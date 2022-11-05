package com.company;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.HashMap;
import java.util.Map;

/*
Character of other alphabet -> Roman Character

 */
public class alphabetConvert {


    persianRomanMap persianRoman;
    cyrillicRomanMap cyrillicRoman;
    public alphabetConvert(){
        persianRoman = new persianRomanMap();
        cyrillicRoman = new cyrillicRomanMap();
    }
    public String convertPersianToRoman(String persianInput){
        String romanOutput="";
        char[] stringArray = persianInput.toCharArray();
        for (int i = 0; i <= persianInput.length()-1; i++){
            char valueAtPlace = stringArray[i];
            if(persianRoman.valueExists(valueAtPlace) == true){

                romanOutput = romanOutput + persianRoman.getRomanString(valueAtPlace);
            }
            else{
                romanOutput = romanOutput + valueAtPlace;
            }

        }
        return romanOutput;
    }

    public String convertCyrillicToRoman(String cyrillicInput){
        String romanOutput="";
        char[] stringArray = cyrillicInput.toCharArray();
        char valueAtPlace;
        for (int i = 0; i <= cyrillicInput.length()-1; i++){
            valueAtPlace = stringArray[i];
            if(cyrillicRoman.valueExists(valueAtPlace) == true){
                romanOutput = romanOutput + cyrillicRoman.getRomanString(valueAtPlace);
            }
            else{
                romanOutput = romanOutput + valueAtPlace;
            }
        }
        return romanOutput;
    }

    public static void main(String[] args) {
        alphabetConvert converter = new alphabetConvert();
        System.out.println(converter.convertCyrillicToRoman("Слава Украина"));

    }
}

