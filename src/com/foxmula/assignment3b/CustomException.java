package com.foxmula.assignment3b;

import java.util.*;

public class CustomException {

    /**
     * @param args the command line arguments
     *
     */

    public static boolean prime(int n)
    {
        if(n==2)
        {
            return true;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) throws OddPrimeExc {
        // TODO code application logic here
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();

        try
        {
            if(num%2!=0&&prime(num))
            {
                throw new OddPrimeExc();

            }

            System.out.println("Number is valid");
        }

        catch(OddPrimeExc e)
        {
            System.out.println(e);


        }




    }

}
