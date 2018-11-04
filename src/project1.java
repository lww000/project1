

public class project1 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 1, 4, 1, 5, 9, 2, 6};

        showReversedArray(array1);//数组倒序
        showReversedArray(array2);
    }

    /*
     * Reverse an array and print it in the standard output
     * @param a the input array
     */
    public static void showReversedArray(int[] a) {
        // 把数组倒序过来，用下标处理
        //a[0]=a[a.length-1],,,a[i]=a[a.length-1-i]
        //用循环，直到i>length-1-i
        int i,temp;
        for (i = 0; i <= a.length - 1 - i; i++) {
            temp=a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i]=temp;
        }
        System.out.print("数组倒序：");
        for(i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}
