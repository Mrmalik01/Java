/*
    Author : Khizar Malik
    Date : 13 Oct 2018
*/
public class InsertionSort{
    public static void main(String[] args){
        int[] numbers = {10,9,8,7,6,5,4,3,2,1};
        InsertionSort sort = new InsertionSort();
        sort.start(numbers);
        sort.printArray(numbers);
    }
    public void start(int[] A){
        for(int i = 1;i<A.length;i++){
            insert(A,A[i],i);
        }
    }

    public void insert(int[] A,int elem,int index){
        for(int i = index;i>0;i--){
            if(A[i-1]<=elem){
                A[i] = elem;
            }
            A[i] = A[i-1];
        }
        A[0] = elem;
    }

    public void printArray(int[] A){
        for(int x= 0;x<A.length;x++){
            System.out.print(A[x]+" ");
        }
    }
}