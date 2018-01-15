package com.circle.base.algorithm;

/**
 * 动态规划
 * 求解一个高度为N的台阶，从下往上走，每跨一步只能向上走1或者2个台阶，求一共有多走法
 */
public class Algorithm {

    /**
     * 递归
     * @param n
     * @return
     */
    public static int count(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return count(n-1) + count(n-2);
    }

    public static void main(String[] args) {
        System.out.println(count(10));
    }

}
