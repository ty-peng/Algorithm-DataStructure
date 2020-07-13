package com.typeng.algorithm.practice.interview;

import java.util.Scanner;

import com.typeng.algorithm.practice.AbstractQuestion;

/**
 * 小明计算 a + b 的时间为 a + b，
 * 给出 n 个数，输出小明计算 n 个数之和的最小时间数.
 *
 * @author ty-peng
 * @date 2020-07-13 16:48
 */
public class Question1 extends AbstractQuestion {

    @Override
    public Object input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入 n：");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第 " + (i + 1) + " 个数：");
            int num = sc.nextInt();
            array[i] = num;
        }
        return array;
    }

    @Override
    public String solution(Object data) {
        int[] array = (int[])data;
        int time = 0;
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum += array[i];
            time += sum;
        }
        return String.valueOf(time);
    }

    public static void main(String[] args) {
        AbstractQuestion question = new Question1();
        question.doThat();
    }

}
