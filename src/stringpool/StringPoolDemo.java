package stringpool;

import util.ConsoleColor;
import util.TimeUtil;

public class StringPoolDemo {

    public static void showStringPoolDemo() {

        System.out.println(
ConsoleColor.PURPLE+
"String Pool Demo"+
                        ConsoleColor.RESET);

                        System.out.println(
"Time : "+TimeUtil.now());

        String s1 = "Java";
        String s2 = "Java";

        String s3 = new String("Java");

        String s4 = s3.intern();

        System.out.println("\n========== String Pool Demo ==========");

        System.out.println("s1 == s2 : " + (s1 == s2));

        System.out.println("s1 == s3 : " + (s1 == s3));

        System.out.println("s1.equals(s3) : " + s1.equals(s3));

        System.out.println("s1 == s4 : " + (s1 == s4));

        System.out.println("s3 == s4 : " + (s3 == s4));

        System.out.println("======================================");
    }

}