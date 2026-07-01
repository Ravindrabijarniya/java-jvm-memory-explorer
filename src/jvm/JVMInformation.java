package jvm;

import util.ConsoleColor;
import util.TimeUtil;

public class JVMInformation {

    public static void showJVMInformation() {

        System.out.println(
ConsoleColor.YELLOW+
"JVM Information"+
                        ConsoleColor.RESET);

                        System.out.println(
"Time : "+TimeUtil.now());

        Runtime runtime = Runtime.getRuntime();

        System.out.println("\n========== JVM Information ==========");

        System.out.println("Java Version      : " + System.getProperty("java.version"));
        System.out.println("Java Vendor       : " + System.getProperty("java.vendor"));
        System.out.println("JVM Name          : " + System.getProperty("java.vm.name"));
        System.out.println("JVM Version       : " + System.getProperty("java.vm.version"));
        System.out.println("JVM Vendor        : " + System.getProperty("java.vm.vendor"));

        System.out.println("OS Name           : " + System.getProperty("os.name"));
        System.out.println("OS Version        : " + System.getProperty("os.version"));
        System.out.println("Architecture      : " + System.getProperty("os.arch"));

        System.out.println("User Name         : " + System.getProperty("user.name"));
        System.out.println("Java Home         : " + System.getProperty("java.home"));
        System.out.println("Working Directory : " + System.getProperty("user.dir"));

        System.out.println("Processors        : " + runtime.availableProcessors());

        System.out.println("=====================================");
    }

}