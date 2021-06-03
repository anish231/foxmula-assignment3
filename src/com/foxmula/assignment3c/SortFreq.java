package com.foxmula.assignment3c;
import java.util.*;

public class SortFreq {

    /**
     * @param args the command line arguments
     */

    // TODO code application logic here
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> ArrList= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers to insert in the array");
        String str=sc.nextLine();
        String strlis[]=str.split(" ");
        for(int i=0;i<strlis.length;i++)
        {
            ArrList.add(Integer.parseInt(strlis[i]));
        }

        HashSet<Integer> hs= new HashSet<>(ArrList);
        TreeSet<Point> ts= new TreeSet<>();
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
            ts.add(new Point(occ,(int)temp));






        }

        System.out.println("Sorting according to occurrence of a number:");
        for(Iterator i=ts.iterator();i.hasNext();)
        {
            System.out.print(i.next()+" ");
        }









    }

}

