package com.typeng.algorithm.practice.interview;

import java.util.PriorityQueue;
import java.util.Scanner;

import com.typeng.algorithm.practice.AbstractQuestion;

/**
 * 小明计算 a + b 的时间为 a + b，
 * 给出 n 个数，输出小明计算 n 个数之和的最小时间数.
 *
 * @author ty-peng
 * @date 2020-07-13 16:48
 */
public class MinTimeOfSum extends AbstractQuestion {

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
        sc.close();
        return array;
    }

    @Override
    public String solution(Object data) {
        int[] array = (int[])data;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(array.length);
        for (int i : array) {
            queue.add(i);
        }
        int time = 0;
        while (queue.size() >= 2) {
            int a = queue.remove();
            int b = queue.remove();
            int sum = a + b;
            time += sum;
            queue.add(sum);
        }
        return String.valueOf(time);
    }

    public static void main(String[] args) {
        AbstractQuestion question = new MinTimeOfSum();
        question.doThat();
    }

}
