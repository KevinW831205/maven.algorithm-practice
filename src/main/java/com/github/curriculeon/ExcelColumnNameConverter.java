package com.github.curriculeon;

/**
 * Created by leon on 12/22/2019.
 */
public class ExcelColumnNameConverter {
    public Integer toNumber(String columnName) {

        Integer result = 0;
        int digit = 0;
        for(int i=columnName.length()-1; i>=0; i--){
            int charVal = columnName.charAt(i) - 64;
            result += (int)Math.pow(26,digit) * charVal;
            digit++;
        }

        return result;
    }
}
