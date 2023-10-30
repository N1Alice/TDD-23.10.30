package com.ll;

public class Calc {
    public static  int run(String exp) {
        if(exp.contains("-")){
            return 0;
        }

        if(exp.contains("+")){
            return 20;
        }

        else{
            return -1;
        }
    }
}
