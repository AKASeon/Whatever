//package com.company;

public class Main {

    public static void main(String[] args) {
        // 자바코드
        String[]    a1 = { "abc "};
        Object[]    a2 = a1;

        a2[0] = new Integer( 17 );
        String s = a1[0];

    }
}
