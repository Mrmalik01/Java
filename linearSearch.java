/*
    Author : Khizar Malik
    Date : 13 Oct 2018
*/
public class linearSearch{
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        linearSearch search = new linearSearch();
        System.out.println(search.start(numbers,5));
    }

    public int start(int[] A,int k){
        int counter=-1;
        for(int x= 0;x<A.length;x++){
            counter++;
            if(A[x]>=k){
                break;
            }    
        }
        if(A != null && A[counter] == k){
            return counter;
        }
        return -1;
    }
}