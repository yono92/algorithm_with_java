package com.study.algorithm.leetcode.study0308;

public class study0308 {
    public int[][] flipAndInvertImage(int[][] image) {
        int len = image.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len/2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][len - j - 1];
                image[i][len - j - 1] = temp;
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <len ; j++) {
                if (image[i][j] == 1) {
                    image[i][j] -= 1;
                } else {
                    image[i][j] += 1;
                }
            }

        }
        return image;
    }
    public static void main(String[] args) {
        int arr2[][] = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i <= arr2.length; i++) {
            for (int j = 0; j <= arr2.length; j++) {
                System.out.println(arr2[i][j]);;
            }
        }

    }
}
