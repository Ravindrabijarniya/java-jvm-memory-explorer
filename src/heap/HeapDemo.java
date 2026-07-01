package heap;

import java.util.ArrayList;
import java.util.List;

import util.ConsoleColor;
import util.FooterPrinter;
import util.MemoryPrinter;
import util.TimeUtil;

public class HeapDemo {

    public static void showHeapDemo() {

        System.out.println(
                ConsoleColor.GREEN +
                        "Heap Demo" +
                        ConsoleColor.RESET);

        System.out.println(
                "Time : " + TimeUtil.now());

        List<byte[]> objects = new ArrayList<>();

        MemoryPrinter.printMemory("Before Allocation");

        for (int i = 1; i <= 20; i++) {

            objects.add(new byte[1024 * 1024]);

            System.out.println("Allocated : " + i + " MB");

        }

        MemoryPrinter.printMemory("After Allocation");

        System.out.println("\nRemoving references to allocated objects...");

        objects = null;
        System.gc();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MemoryPrinter.printMemory("After GC request");
        FooterPrinter.printFooter();

    }

}