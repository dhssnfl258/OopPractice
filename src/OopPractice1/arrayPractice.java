package OopPractice1;

import java.util.Arrays;

public class arrayPractice {
    public static void main(String[] args) {

        //배열 선언
        int[] arr;
        int arr2[];

        String[] str1;
        String str2[];
        //배열 초기화
        int[] arr1 = new int[10];
        arr1[0] = 1;
        arr1[1] = 2;
        int[] arr3 = {1,2,3,5};
        //얇은 복사 값의 주소를 참조하는것.
//        int[] arr5 = arr1;
        arr1[1] = -1;
//        System.out.println(arr5[1]);
        int[] arr5 = new int[10];
        //깊은 복사 -> 값 자체를 복사
        for(int i = 0 ; i <arr1.length; i++){
            arr5[i] = arr1[i];
        }
        System.out.println(arr5[1]);
        arr5[1] = 4;
        System.out.println(arr5[1]);
        System.out.println(arr1[1]);

    }
}
