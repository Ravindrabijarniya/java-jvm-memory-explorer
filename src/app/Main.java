package app;

import java.util.Scanner;

import gc.GarbageCollectionDemo;
import heap.HeapDemo;
import jvm.JVMArgumentsDemo;
import jvm.JVMInformation;
import oom.OutOfMemoryDemo;
import runtime.RuntimeMemoryDemo;
import stack.StackDemo;
import stack.StackOverflowDemo;
import stringpool.StringPoolDemo;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n======================================");
            System.out.println("||      JVM MEMORY EXPLORER         ||");
            System.out.println("||        Version : 1.0.0           ||");
            System.out.println("======================================");
            System.out.println("1. JVM Information");
            System.out.println("2. Runtime Memory");
            System.out.println("3. Heap Demo");
            System.out.println("4. Stack Demo");
            System.out.println("5. String Pool Demo");
            System.out.println("6. Garbage Collection Demo");
            System.out.println("7. StackOverflow Demo");
            System.out.println("8. OutOfMemory Demo");
            System.out.println("9. JVM Arguments");
            System.out.println("10. Exit");
            System.out.println("11. Run Complete JVM Memory Explorer Demo");

            System.out.print("\nEnter Choice : ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    JVMInformation.showJVMInformation();
                    break;

                case 2:
                    RuntimeMemoryDemo.showRuntimeMemory();
                    break;

                case 3:
                    HeapDemo.showHeapDemo();
                    break;

                case 4:
                    StackDemo.showStackDemo();
                    break;

                case 5:
                    StringPoolDemo.showStringPoolDemo();
                    break;

                case 6:
                    GarbageCollectionDemo.showGarbageCollection();
                    break;

                case 7:
                    StackOverflowDemo.showStackOverflowDemo();
                    break;

                case 8:
                    OutOfMemoryDemo.showOutOfMemoryDemo();
                    break;

                case 9:
                    JVMArgumentsDemo.showJVMArguments();
                    break;

                case 10:
                    System.out.println("\nThank you for using JVM Memory Explorer.");
                    scanner.close();
                    return;

                case 11:

                    JVMInformation.showJVMInformation();

                    RuntimeMemoryDemo.showRuntimeMemory();

                    HeapDemo.showHeapDemo();

                    StringPoolDemo.showStringPoolDemo();

                    GarbageCollectionDemo.showGarbageCollection();

                    StackDemo.showStackDemo();

                    JVMArgumentsDemo.showJVMArguments();

                    break;

                default:
                    System.out.println("\nInvalid Choice.");
            }
        }
    }
}