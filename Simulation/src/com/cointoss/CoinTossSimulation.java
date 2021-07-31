package com.cointoss;

import java.util.Random;

public class CoinTossSimulation {

    public static void main(String[] args) {
        int times=1000000000;
        OneCoinToss  oneCoinToss = new OneCoinToss();
        Random random = new Random();
        for (int i = 0; i < times ; i++) {

            if(random.nextBoolean()){
                // True is Head
                oneCoinToss.setHeads( oneCoinToss.getHeads()+1);
            }else {
                //False is Tail
                oneCoinToss.setTails( oneCoinToss.getTails()+1);
            }
         }

        System.out.println("Probability of Head ="+ oneCoinToss.getHeads()/(times*1.0));
        System.out.println("Probability of Tail ="+ oneCoinToss.getTails()/(times*1.0));

    }
}
