package com.company;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10000000; i++) {
            map.put(i, "generatedString");
        }
    }
}
//-XX:+PrintCompilation
//-XX:+PrintCompilation -XX:+UnlockDiagnosticVMOptions -XX:+PrintInlining