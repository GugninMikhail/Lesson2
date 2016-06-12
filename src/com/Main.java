package com;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        double e;
        try {
            e = Double.parseDouble(args[0]);
        }catch (Exception ex){
            e = 0.25;
            System.out.println(args[0] +  " is an illegal argument. e = 0.25 by default");
        }

        if( e > 0.25){
            System.out.println("E should be <=0.25");
            return;
        }

        boolean doLoop = true;

        while (doLoop) {

            double a = 1 / Math.pow(i + 1, 2);
            System.out.println("a[" + i + "] = " + a + "; e = " + e);
            if (a < e) {
                doLoop = false;
            } else i++;
        }

    }
}
