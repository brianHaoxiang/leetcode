package com.zuo.leetcode;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println(myAtoi("-+2"));
    }

    public static int myAtoi(String str) {
        str = str.trim();
        char[] chars = str.toCharArray();
        boolean charCheck = true;
        int result = 0;
        int flag = 1;
        for (int i = 0; i<chars.length; i++) {

            if (chars[i]=='-') {
                flag = -1;
            } else if (chars[i] == '+') {
                continue;
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                int temp = result;
                result = result * 10;
                if (temp != result/10) {
                    return flag>0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                result += Integer.valueOf(chars[i]+"");
            } else {
                break;
            }
        }

        return result * flag;
    }
}
