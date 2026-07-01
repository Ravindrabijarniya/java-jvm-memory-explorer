package stack;

import util.ConsoleColor;
import util.TimeUtil;

public class StackOverflowDemo {

    static int count = 0;

    public static void showStackOverflowDemo() {

        System.out.println(
ConsoleColor.RED+
"Stack Overflow Demo"+
                        ConsoleColor.RESET);

                        System.out.println(
"Time : "+TimeUtil.now());

        try {

            recursive();

        } catch (StackOverflowError e) {

            System.out.println("\nStackOverflowError occurred!");

            System.out.println("Total Recursive Calls : " + count);

        }

    }

    private static void recursive() {

        count++;

        if (count % 1000 == 0) {

            System.out.println("Depth : " + count);

        }

        recursive();

    }

}