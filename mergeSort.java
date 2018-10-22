public class mergeSort{
    public static void main(String[] args){
        int[] A = {10,9,7,6,5,4,3,2,1};
        mergeSort(A);
        printArray(A);
    }
    public static void mergeSort(int[] arr){
        if(arr.length>1){
            int i, mid = (arr.length/2);
            int[] half1 = new int[mid];
            int[] half2 = new int[arr.length-mid];
            for(i= 0;i<mid;i++) half1[i] = arr[i];
            for(;i<arr.length;i++) half2[i-mid] = arr[i];
            mergeSort(half1);
            mergeSort(half2);
            int j1=0,j2 =0;
            for(i =0;j1<half1.length&&j2<half2.length;i++)
                if(half1[j1]<half2[j2]){ arr[i] = half1[j1]; j1++;}
                else{ arr[i] = half2[j2];j2++;}
            for(;j1<half1.length;j1++,i++) arr[i] = half1[j1];
            for(;j2<half2.length;j2++,i++) arr[i] = half2[j2];
        }
    }
    public static void printArray(int[] arr){
        for(int each :arr){
            System.out.print(each+" ");
        }
    }
}