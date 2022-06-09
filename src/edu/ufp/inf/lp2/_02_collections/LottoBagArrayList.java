package edu.ufp.inf.lp2._02_collections;

import java.util.Random;
import java.util.ArrayList;

public class LottoBagArrayList {
    
    public static final int MIN_NUM = 1;
    public static final int MAX_NUM = 90;
    private final ArrayList<Integer> bagInts = new ArrayList<>();
    private int numberRemainingBalls;
    private final Random rand = new Random();

    public static void main(String[] args) {
        
        LottoBagArray lotto = new LottoBagArray();
        System.out.println(lotto.toString());
        
        //Withdraw lotto numbers...
        while (lotto.getNumberRemainingBalls() > 0){

            System.out.println("Lotto number " + (MAX_NUM - lotto.getNumberRemainingBalls() + 1) + " = " + lotto.removeLottoNumberRandomly());
        }
        System.out.println(lotto.toString());
    }
    
    public LottoBagArrayList(){
        
        rand.setSeed(System.currentTimeMillis());
        //Add 90 (non-repeated) random numbers to the bag
        for (int i = 1; i <= MAX_NUM; i++){
            
            while (!addLottoNumber(rand.nextInt(MAX_NUM) + MIN_NUM)){
                continue;
            }
        }
    }

    public int numberRemainingBalls(){

        return bagInts.size();
    }

    public int[] toIntArray(){

        int[] a1 = new int[bagInts.size()];
        for (int i = 0; i < bagInts.size(); i++){
            a1[i] = bagInts.get(i);
        }
        return a1;
    }

    public boolean containsLottoNumber(int n){

        for (Integer i : this.bagInts){

            if (i.compareTo(n) == 0) return true;
        }
        return false;
    }

    private boolean addLottoNumber(int n) {

        if (!containsLottoNumber(n)){

            this.bagInts.add(n);
            return true;
        }
        return false;
    }

    public int removeLottoNumberAtIndex(int index){

        if (index >= 0 && index < numberRemainingBalls()){
            return this.bagInts.remove(index);
        }
        return -1;
    }

    public int removeLottoNumberRandomly(){

        int index = rand.nextInt(numberRemainingBalls());
        return removeLottoNumberAtIndex(index);
    }

}
