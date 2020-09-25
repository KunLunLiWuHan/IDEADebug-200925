package com.itheima.test05;

/**
 * 条件断点
 */
public class ConditionPointMain {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            execute(i);
        }
    }

    private static void execute(int num) {
        int rs = (num)*2;
        System.out.println(rs);
    }
}
