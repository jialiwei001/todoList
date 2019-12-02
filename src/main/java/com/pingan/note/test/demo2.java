package com.pingan.note.test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: 焦立伟
 * @PackageName: com.pingan.note.test
 * @ClassName: demo2
 * @Description:
 * @date: 2019/11/25 12:45
 */
public class demo2 {

    public static void main(String[] args) {

        soft(new int[] {1,4,2,5,6,7,89,34,22,33,98,11,222,34,90,65});

    }

    private static void soft(int[] is) {

        int temp = 0;

        for (int i = 1; i < is.length; i++) {

            for (int j = 0; j < is.length-i; j++) {
                if (is[j] > is[j + 1]) {
                    temp = is[j];
                    is[j] = is[j+1];
                    is[j+1] = temp;
                }
            }
        }

        System.out.println("排序后的数组："+ Arrays.toString(is));
    }
}

