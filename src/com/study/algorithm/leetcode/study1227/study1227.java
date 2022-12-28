package com.study.algorithm.leetcode.study1227;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;

import static java.util.Arrays.stream;

public class study1227 {
    /*
    주차장을 위한 주차 시스템을 설계하다.주차장은 대, 중, 소의 세 가지 주차공간이 있으며, 크기별로 정해진 슬롯 수가 있습니다.
    의 실장ParkingSystem 클래스:
    ParkingSystem(int big, int medium, int small)의 오브젝트를 초기화합니다.ParkingSystem 클래스.
    각 주차 공간에 대한 슬롯 수는 Constructor 일부로 지정됩니다.
    bool addCar(int carType)주차 공간이 있는지 확인합니다.carType 주차장에 들어가려는 차를 위해서요 car Type세 가지 종류가 있을 수 있다:
    큰 것, 중간 것, 작은 것.1,2,그리고.3각각 다음과 같다.차는 주차 공간에만 주차할 수 있다.carType빈자리가 없는 경우 반환false그렇지 않으면 해당 크기의 공간에 차를 주차한 후 되돌아갑니다.true.
     */

    private int big = 0, medium = 0, small = 0;

    /**
     * @param big
     * @param medium
     * @param small
     */
    public void ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (big > 0) {
                    big--;
                    return true;
                } else {
                    return false;
                }
            case 2:
                if (medium > 0) {
                    medium--;
                    return true;
                } else {
                    return false;
                }
            case 3:
                if (small > 0) {
                    small--;
                    return true;
                } else {
                    return false;
                }
        }
        return false;
    }

    /*
    두 개의 정수가 주어지면 num1그리고.num2는 두 정수의 합계를 반환합니다.
     */
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    /*
    이 명령어가 주어집니다.root 정확히 구성되는 이진수의3노드: 루트, 왼쪽 자식 및 오른쪽 자식.
    돌아가다 true 루트의 값이 두 자녀의 값의 합계와 동일한 경우 또는 false 그렇지 않으면.
     */
    public boolean checkTree(TreeNode root) {
        if (root.left == null) {
            return true;
        }
        if (root.right == null) {
            return true;
        }
        checkTree(root.left);
        checkTree(root.right);
        if (root.val == root.right.val + root.left.val) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        study1227 s = new study1227();
        s.ParkingSystem(2, 1, 1);
        System.out.println(s.addCar(1));
        System.out.println(s.addCar(2));
        System.out.println(s.addCar(3));
        System.out.println(s.addCar(1));

        int num1 = 12;
        int num2 = 5;
        int num3 = -10;
        int num4 = 4;
        System.out.println(s.sum(num1, num2));
        System.out.println(s.sum(num3, num4));


    }
}
