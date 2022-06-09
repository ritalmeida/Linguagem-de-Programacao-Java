package edu.ufp.inf.lp2._02_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class LottoBagArray {

    public static final int MIN_NUM=1;
    public static final int MAX_NUM=90;
    private final int[] bagInts=new int[MAX_NUM];
    private int numberRemainingBalls;
    private final Random rand=new Random();

    public int getNumberRemainingBalls() {
        return numberRemainingBalls;
    }

    public static void main(String[] args) {

        LottoBagArray lotto=new LottoBagArray();
        System.out.println(lotto.toString());

        //Withdraw lotto numbers...
        while (lotto.getNumberRemainingBalls() > 0) {
            System.out.println("Lotto number " + (MAX_NUM - lotto.getNumberRemainingBalls() + 1) + " = " + lotto.removeLottoNumberRandomly());
        }

        System.out.println(lotto.toString());
    }

    public LottoBagArray() {
        rand.setSeed(System.currentTimeMillis());
        //Add 90 (non-repeated) random numbers to the bag
        for (int i=0; i < bagInts.length; i++) {
            while (!addLottoNumber(rand.nextInt(MAX_NUM) + MIN_NUM)) {
                continue;
            }
        }
    }

    private boolean addLottoNumber(int i) {

        if(!containsLottoNumber(i)){

            bagInts[this.numberRemainingBalls] = i;
            this.numberRemainingBalls++;
            return true;
        }

        return false;
    }

    private boolean containsLottoNumber(int n) {

        for (int i : bagInts){

            if (i == n){

                return true;
            }
        }

        return false;
    }

    int removeLottoNumberRandomly() {

        int index = rand.nextInt(this.numberRemainingBalls);

        return removeLottoNumberAtIndex(index);
    }

    private int removeLottoNumberAtIndex(int index){

        if (index >= 0 && index < this.numberRemainingBalls){

            int element = bagInts[index];

            for (int i = index; i < (this.numberRemainingBalls); i++){

                bagInts[index] = bagInts[index+1];
            }
            bagInts[this.numberRemainingBalls-1] = 0;
            this.numberRemainingBalls--;
            return element;
        }

        return -1;
    }

    @Override
    public String toString() {

        return "LottoBagArray{ " +
                "bagInts=" + Arrays.toString(bagInts) +
                ", numberRemainingBalls=" + numberRemainingBalls +
                '}';
    }

    public ArrayList<Integer> toIntegerArrayList(){

        ArrayList<Integer> aux = new ArrayList<>();

        for (int i : bagInts){

            aux.add(i);
        }

        return aux;
    }
}
