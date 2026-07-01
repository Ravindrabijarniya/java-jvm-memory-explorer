package runtime;

import util.ConsoleColor;
import util.TimeUtil;

public class RuntimeMemoryDemo {

    public static void showRuntimeMemory() {
        System.out.println(
ConsoleColor.BLUE+
"Runtime Memory"+
                        ConsoleColor.RESET);

                        System.out.println(
"Time : "+TimeUtil.now());
        
        Runtime runtime = Runtime.getRuntime();
        long totalMemory= runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long maxMemory = runtime.maxMemory();
        long usedMemory = totalMemory - freeMemory;
        int processorCount = runtime.availableProcessors();

        System.out.println("\n========== Runtime Memory ==========");

        System.out.println("Available Processors : " + processorCount);

        System.out.println("Total Memory : " + totalMemory);

        System.out.println("Free Memory  : " + freeMemory);

        System.out.println("Used Memory  : " + usedMemory);

        System.out.println("Maximum Heap : " + maxMemory);

        System.out.println("====================================");
    }
    
}
