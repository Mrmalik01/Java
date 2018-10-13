/*
    Author : Khizar Malik
    Date : 13 Oct 2018
*/

public class binarySearch{
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        binarySearch search = new binarySearch();
        System.out.print(search.start(numbers, 5));
    }

    public int start(int[] A,int k){
        int lo = 0;
        int hi = A.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(A[mid]==k){
                return mid;
            }else{
                if(A[mid]<k){
                    lo = mid+1;
                }else{
                    hi = mid-1;
                }
            }
        }
        return -1;
    }
}