package gc;

import java.util.ArrayList;
import java.util.List;

import util.ConsoleColor;
import util.MemoryPrinter;
import util.TimeUtil;

public class GarbageCollectionDemo {

    public static void showGarbageCollection() {

        System.out.println(
ConsoleColor.RESET+
"Garbage Collection Demo"+
                        ConsoleColor.RESET);

                        System.out.println(
"Time : "+TimeUtil.now());

        MemoryPrinter.printMemory("Initial Memory");

        List<byte[]> list = new ArrayList<>();

        System.out.println("\nCreating Objects...\n");

        for (int i = 1; i <= 30; i++) {

            list.add(new byte[1024 * 1024]);

            if (i % 5 == 0) {
                System.out.println(i + " MB Allocated");
            }

        }

        MemoryPrinter.printMemory("After Object Creation");

        System.out.println("\nRemoving References...");

        list = null;

        System.out.println("Objects are now eligible for Garbage Collection.");

        System.out.println("\nRequesting GC...");

        System.gc();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        MemoryPrinter.printMemory("After GC");

    }

}