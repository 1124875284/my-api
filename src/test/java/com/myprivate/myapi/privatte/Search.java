package com.myprivate.myapi.privatte;


/**
 * @author 黄志强
 * @data 2018/9/12 16:15
 */
public class Search {


    /**
     * 二分查找
     * @param arr
     * @param min
     * @param max
     * @param  key  我要查的数
     * @return
     */
    public static int recursionBinarySearch(int[] arr,int min,int max,int key){

        int middle=(min+max)/2;

        if (arr[middle]>key){
            return  recursionBinarySearch(arr,min,middle-1,key);
        }else if(arr[middle]<key){
            return recursionBinarySearch(arr,middle+1,max,key);
        }else {
            return middle;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int min=0;
        int max=6;
        int key=3;
        int index=recursionBinarySearch(arr,min,max,key);
        System.out.println("查"+key+"     下标是："+index);
    }
}
