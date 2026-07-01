package stack;

import util.ConsoleColor;
import util.TimeUtil;

public class StackDemo {

    public static void showStackDemo() {

        System.out.println(
ConsoleColor.CYAN+
"Stack Demo"+
                        ConsoleColor.RESET);

                        System.out.println(
"Time : "+TimeUtil.now());

        System.out.println("\n===== Stack Demo =====");

        methodA();

        System.out.println("\nBack to main method.");

    }

    private static void methodA() {

        System.out.println("Entered Method A");

        methodB();

        System.out.println("Leaving Method A");

    }

    private static void methodB() {

        System.out.println("Entered Method B");

        methodC();

        System.out.println("Leaving Method B");

    }

    private static void methodC() {

        System.out.println("Entered Method C");

        System.out.println("Leaving Method C");

    }

}