package com.aridi.jdbc.starter.equals;

public class Main {
    public static void main(String[] args) {
        var noname = new NoName(1,"kamal", "aridi");
        var noname2 = new NoName(12,"kamal2", "aridi");

        System.out.println(noname.hashCode());
        System.out.println(noname2.hashCode());

        boolean equals = noname.equals(noname2);
        System.out.println(equals);
    }
}
