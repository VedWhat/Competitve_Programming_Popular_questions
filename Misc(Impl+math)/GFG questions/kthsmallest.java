/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class kthsmallest {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt ();
        int iter, n;
        int i;
        for (iter = 0; iter<t; iter++)
        {
            n = sc.nextInt ();
            sc.nextLine ();
            String items [] = sc.nextLine ().split (" ");
            int a []  =new int [n];
            for (i=0; i<n; i++)
                a[i] = Integer.parseInt(items[i]);
            int  k = sc.nextInt();
            int f [] = new int [100001];
            for (i=0; i<n; i++)
                f[a[i]]++;
            int count = 0;
            for (i=0; i<100001; i++)
            {
                if (f[i]==1)
                    count++;
                if (count==k)
                {
                    System.out.println (i);
                    break;
                }
            }
        }
    }
}