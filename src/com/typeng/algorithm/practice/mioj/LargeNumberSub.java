package com.typeng.algorithm.practice.mioj;

/**
 * 大数相减.
 *
 * @author ty-peng
 * @since 2019/1/24 16:33
 */
public class LargeNumberSub {

    public static void main(String[] args) {
        String line = "812345-793456";
        System.out.println(solution(line));
    }

    private static String solution(String line) {
        // 在此处理单行数据
        String[] array = line.split("-");
        // 翻转 从低位开始计算
        char[] a = new StringBuilder(array[0]).reverse().toString().toCharArray();
        char[] b = new StringBuilder(array[1]).reverse().toString().toCharArray();
        // 题目规定 a > b  a.length >= b.length
        int[] result = new int[a.length];
        // 直接相减
        for (int i = 0; i < result.length; i++) {
            int intA = a[i] - '0';
            int intB = i < b.length ? b[i] - '0' : 0;
            result[i] = intA - intB;
        }
        // 清借位
        for (int i = 0; i < result.length; i++) {
            if (result[i] < 0) {
                result[i + 1] -= 1;
                result[i] += 10;
            }
        }
        StringBuilder rt = new StringBuilder();
        // 跳过前面无意义的 0
        boolean flag = true;
        for (int i = result.length - 1; i >= 0; i--) {
            if (result[i] == 0 && flag) {
                continue;
            } else {
                flag = false;
            }
            rt.append(result[i]);
        }
        if (rt.length() == 0) {
            return "0";
        }
        // 返回处理后的结果
        return rt.toString();
    }
}
