package urok1.Task;

import java.util.Arrays;

public class task1{
    public static void main (String[] args){
        var s = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
    }
        System.out.println(System.currentTimeMillis() - s);


    }
}

