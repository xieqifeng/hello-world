package com.juvenxu.mvnbook.helloworld.demo;

import java.util.Arrays;

public class HelloWorld {
    public String sayHello() {
        return "hello maven";
    }

    public static void main(String[] args) {
        int[] arrs = new int[args.length];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = Integer.parseInt(args[i]);
        }
        int sum = 0;
        for (int i = 0; i < arrs.length - 1; i++) {
            for (int j = 0; j < arrs.length - 1 - i; j++) {
                if (arrs[j] > arrs[j + 1]) {
                    int temp = arrs[j];
                    arrs[j] = arrs[j + 1];
                    arrs[j + 1] = temp;
                }
            }
            if (i < 3)
                sum += arrs[arrs.length - 1 - i];
        }
        System.out.println(Arrays.toString(arrs));
        System.out.println(sum);
    }

    void visitInner(){
        new Inner().f();
    }
    class Inner {
        private void f(){
            System.out.println("this is inner class");
        }
    }
}