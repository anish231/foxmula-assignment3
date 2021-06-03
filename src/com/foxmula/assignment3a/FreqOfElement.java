package com.foxmula.assignment3a;

import java.util.*;
public class FreqOfElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> ArrList= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers to be inserted in the array");
        String str=sc.nextLine();
        String strlis[]=str.split(" ");
        for(int i=0;i<strlis.length;i++)
        {
            ArrList.add(Integer.parseInt(strlis[i]));
        }
        //System.out.println(ArrList);
        LinkedHashSet<Integer> hs= new LinkedHashSet<>(ArrList);
        for(Iterator i1= hs.iterator();i1.hasNext();)
        {
            int occ=0;
            var temp=i1.next();
            for(Iterator i2=ArrList.iterator();i2.hasNext();)
            {
                if(temp.equals(i2.next()))
                {
                    occ++;
                }
            }
            System.out.println("Occurrence of "+temp+ " is "+occ);


        }
        //System.out.println(al2);







    }

}