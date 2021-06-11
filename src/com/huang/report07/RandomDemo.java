package com.huang.report07;

import java.util.Random;

public class RandomDemo {
    Random random;
    String str;

    public RandomDemo(){
        random = new Random();
    }
    public String getRandom(){
        str = "";
        int ranInt = 0;
        int i = 0;
        for (int j = 0; j < 4; j++) {
            i = random.nextInt(3);
            switch (i){
                case 0:
                    ranInt = 48 + random.nextInt(10);
                    break;
                case 1:
                    ranInt = 65 + random.nextInt(26);
                    break;
                case 2:
                    ranInt = 97 + random.nextInt(26);
                    break;
            }
            str += String.valueOf( Character.toChars( ranInt ) ) ;
        }
        return str;
    }
    public String getRandom(int n){
        str = "";
        int ranInt = 0;
        int i = 0;
        for (int j = 0; j < n; j++) {
            i = random.nextInt(3);
            switch (i){
                case 0:
                    ranInt = 48 + random.nextInt(10);
                    break;
                case 1:
                    ranInt = 65 + random.nextInt(26);
                    break;
                case 2:
                    ranInt = 97 + random.nextInt(26);
                    break;
            }
            str += String.valueOf( Character.toChars( ranInt ) ) ;
        }
        return str;
    }
}
