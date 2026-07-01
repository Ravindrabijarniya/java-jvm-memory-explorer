package util;

public class MemoryPrinter {

    public static void printMemory(String title) {

        Runtime runtime = Runtime.getRuntime();

        long total = runtime.totalMemory() / (1024 * 1024);
        long free = runtime.freeMemory() / (1024 * 1024);
        long used = total - free;
        long max = runtime.maxMemory() / (1024 * 1024);

        System.out.println("\n======================================");
        System.out.println(title);
        System.out.println("======================================");
        System.out.println("Total Heap : " + total + " MB");
        System.out.println("Used Heap  : " + used + " MB");
        System.out.println("Free Heap  : " + free + " MB");
        System.out.println("Max Heap   : " + max + " MB");
        System.out.println("======================================");

    }
}   

