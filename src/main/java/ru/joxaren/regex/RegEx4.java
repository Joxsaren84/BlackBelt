package ru.joxaren.regex;

import java.util.regex.Pattern;

public class RegEx4 {

    static void checkIp(String ip){

        String regex = "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d\\.){3}"
                + "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";

        System.out.println(ip + " is ok? " + Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {

        String ip1 = "192.168.0.1";
        String ip2 = "255.631.255.4";

        checkIp(ip1);
        checkIp(ip2);

    }

}
