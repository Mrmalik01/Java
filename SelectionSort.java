/*
    Author : Khizar Malik
    Date : 13 Oct 2018
*/
public class SelectionSort{
    public static void main(String[] args){
        int[] numbers = {10,9,8,7,6,5,4,3,2,1};
        SelectionSort sort = new SelectionSort();
        sort.start(numbers);
        sort.printArray(numbers);
    }

    public void start(int[] A){
        for(int i = 0;i<A.length;i++){
            int smallest = findSmallest(A, i);
            swap(smallest, i, A);
        }
    }

    public int findSmallest(int[] A,int from){
        int smallest = from;
        for(int i = from+1;i<A.length;i++){
            if(A[from] > A[i]){
                smallest = i;
            }
        }
        return smallest;
    }

    public void swap(int smallest,int initial,int[] A){
        int helper = A[smallest];
        A[smallest] = A[initial];
        A[initial] = helper;
    }

    public void printArray(int[] numbers){
        for(int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}