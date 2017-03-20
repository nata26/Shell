
public class ShellSort {

    static void shellSort(int[] arr){

        int h = 1;
        while (h > arr.length/2){
            h = h * 2 + 1;
        }

        while (h>0){
            for (int i = 0; i< arr.length; i++){
                //System.out.println(i);
                int temp = arr[i];
               // System.out.println(arr[i]);
                int j;
                for (j = i; j > h-1 && arr[j-h] >= temp; j=j-h){
                    arr[j] = arr[j-h];
                }
                arr[j] = temp;
            }
            h = (h-1)/2;
        }



    }

    public static void main(String[] args){

        int[] arr = {3,6,8,2,1,7,5};
        for (int i = 0; i < arr.length; i++){
        shellSort(arr);
        System.out.println(arr[i] + " ");}

    }
}
