package com.jtthink;

import com.jtthink.entity.User;

public class Main {


    public static void main(String[] args) {

        String abc = "{\n" +
                "  \"name\" : \"niushijin\",\n" +
                "  \"age\" : 12\n" +
                "  \n" +
                "}";

        bc();

    }

    private static void bc() {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 1000; i++) {
            sb.append("18612782368");
        }

        f1();

        String str = sb.toString();
        System.out.println(str.getBytes().length);
    }

    private static void f1() {

        User user = new User();
        user.setName(0);
        user.setAge(0);






    }


}
