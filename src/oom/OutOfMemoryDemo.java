package oom;

import java.util.ArrayList;
import java.util.List;

import util.ConsoleColor;
import util.MemoryPrinter;
import util.TimeUtil;

public class OutOfMemoryDemo {

    public static void showOutOfMemoryDemo() {

        System.out.println(
ConsoleColor.RED+
"Out Of Memory Demo"+
                        ConsoleColor.RESET);

                        System.out.println(
"Time : "+TimeUtil.now());

        List<byte[]> memory = new ArrayList<>();

        int count = 0;

        try {

            while (true) {

                memory.add(new byte[1024 * 1024]);

                count++;

                if (count % 5 == 0) {

                    System.out.println("Allocated : " + count + " MB");

                }

            }

        } catch (OutOfMemoryError e) {

            System.out.println("\nOutOfMemoryError Occurred!");

            System.out.println("Allocated Before Crash : " + count + " MB");

            MemoryPrinter.printMemory("Memory at Crash");

        }

    }

}