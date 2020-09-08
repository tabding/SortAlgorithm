package com.ding.niuke;

public class SortAlgorithm {

    public static void main(String[] args) {
        int[] a = {3, 2, 6, 1, 0, 5, 9, 8, 4};
        sort(a);
        for (int i : a)
            System.out.print(i + " ");
    }

    //冒泡，时间复杂度为o(n2)，稳定
/*    public static void sort (int[] a) {
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a.length-1-i; j++) {
                if (a[j] > a[j+1])
                    swap(a, j, j+1);
            }
        }
    }*/

    //插入，时间复杂度为o(n2)，稳定
/*    public static void sort (int[] a) {
        for (int i=1; i<a.length; i++) {
            int index = i;
            int temp = a[i];
            while (index >= 1 && a[index-1] > temp)
                a[index] = a[--index];
            a[index] = temp;
        }
    }*/

    //选择，时间复杂度为o(n2)，不稳定
    public static void sort (int[] a) {
        for (int i=0; i<a.length-1; i++) {
            int minIndex = i;
            for (int j=i+1; j<a.length;j++) {
                if (a[j] < a[minIndex])
                    minIndex = j;
            }
            swap(a, i, minIndex);
        }
    }

    //归并，时间复杂度为o(nlogn)，稳定
/*    public static void sort (int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            sort(a, low, mid);
            sort(a, mid+1, high);
            merge(a, low, mid, high);
        }


    }
    public static void merge (int[] a, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int i = low;
        int j = mid+1;
        int index = 0;
        while (i<=mid && j<=high)
            temp[index++] = a[i]<a[j] ? a[i++] : a[j++];
        while (i <= mid)
            temp[index++] = a[i++];
        while (j <= high)
            temp[index++] = a[j++];
        for (int k=0; k<temp.length; k++)
            a[low+k] = temp[k];
    }*/

    //快速，时间复杂度为oo(nlogn)，不稳定
/*    public static void sort(int[] a, int low, int high) {
        if (low >= high)
            return;
        int i = low;
        int j = high;
        int key = a[i];
        while (i < j) {
            while (i<j && a[j]>=key)
                j--;
            if (i < j)
                a[i++] = a[j];
            while (i<j && a[i]<key)
                i++;
            if (i < j)
                a[j--] = a[i];
        }
        sort(a, low, i-1);
        sort(a, i+1, high);
        a[i] = key;
    }*/

    //堆排序，时间复杂度为o(nlogn)，不稳定
/*    public static void sort(int[] a) {
        for (int i=0; i<a.length-1; i++) {
            build(a, a.length-1-i);
            swap(a, 0, a.length-1-i);
        }
    }

    public static void build(int[] a, int lastNode) {
        for (int i=(lastNode-1)/2; i>=0; i--) {
            int fatherNode = i;
            while (2*fatherNode+1 <= lastNode) {
                int childNode = 2*fatherNode+1;
                if (childNode < lastNode) {
                    if (a[childNode] < a[childNode+1])
                        childNode++;
                }
                if (a[fatherNode] < a[childNode]) {
                    swap(a, fatherNode, childNode);
                    fatherNode = childNode;
                }
                else break;
            }
        }
    }*/

    //交换方法
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}