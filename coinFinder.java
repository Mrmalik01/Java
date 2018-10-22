import java.util.ArrayList;
import java.util.List;
public class coinFinder {
    public static void main(String[] args){
        int[] coins = {200,100,50,20,10,1};
        int amount = 9000000;

        long t = System.nanoTime();
        List<Integer> result = getCoins(amount, coins);
        t = System.nanoTime()-t;
        System.out.println("First alg took "+t+" ns");
        //printArray(result);

        System.out.println("********************");
        long t2 = System.nanoTime();
        List<Integer> result2  =getCoinsNaive(amount, coins);
        t2 = System.nanoTime()-t2;
        System.out.println("Second alg took "+t2+" ns");
        //printArray(result2);
    }

    public static void printArray(List<Integer> arr){
        for(int each: arr){
            System.out.println(each+" ");
        }
    }

    public static List<Integer> getCoins(int amount, int[] coins)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0;i<coins.length;i++){
            if(coins[i]<amount){
                int helper =(int) (amount/coins[i]);
                amount -= coins[i]*helper;
                adder(result, coins[i], helper);
                if(amount == 0){
                    break;
                }
            }   
        }
        return result;
    }

    public static void adder(List<Integer> arr,int elem,int times){
        for(int i=0;i<times;i++){
            arr.add(elem);
        }
    }

    public static List<Integer> getCoinsNaive(int amount,int[] coins){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0;i<coins.length;i++){
            if(coins[i]<=amount){
                amount-=coins[i];
                result.add(coins[i]);
                i--;
                if(amount==0){
                    break;
                }
            }   
        }
        return result;
    }
}