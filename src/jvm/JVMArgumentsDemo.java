package jvm;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;

import util.ConsoleColor;
import util.TimeUtil;

public class JVMArgumentsDemo {

    public static void showJVMArguments() {

        System.out.println(
ConsoleColor.BLUE+
"JVM Arguments"+
                        ConsoleColor.RESET);

                        System.out.println(
"Time : "+TimeUtil.now());

        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();

        List<String> arguments = runtimeMXBean.getInputArguments();

        System.out.println("\n========= JVM Arguments =========");

        if (arguments.isEmpty()) {

            System.out.println("No JVM Arguments Found.");

        } else {

            for (String arg : arguments) {

                System.out.println(arg);

            }

        }

        System.out.println("\nApplication Arguments");

        List<String> appArgs = runtimeMXBean.getInputArguments();

        if (appArgs.isEmpty()) {

            System.out.println("No Application Arguments.");

        }

        System.out.println("=================================");

    }

}