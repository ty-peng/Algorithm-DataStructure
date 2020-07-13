package com.typeng.practice;

/**
 * 练习题抽象类.
 *
 * @author ty-peng
 * @date 2020-07-13 17:07
 */
public abstract class AbstractQuestion {

    /**
     * 输入数据.
     * 
     * @return data
     */
    public abstract Object input();

    /**
     * 解题.
     * 
     * @param data 输入数据
     * @return 输出
     */
    public abstract String solution(Object data);

    /**
     * 输出结果.
     *
     * @param result 结果
     */
    public void output(String result) {
        System.out.println("结果：" + result);
    }

    public final void doThat() {
        Object input = input();
        long start = System.currentTimeMillis();
        String result = solution(input);
        long end = System.currentTimeMillis();
        output(result);
        System.out.println("耗时：" + (end - start));
    }

}
