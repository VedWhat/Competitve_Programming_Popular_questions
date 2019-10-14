import java.util.*;
class substring
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        int p = sc.nextInt ();
        int iter;
        for (iter = 0; iter < p; iter++)
        {
            String s1 = sc.nextLine ();
            sc.nextLine ();
            String s2 = sc.nextLine ();
            int l1 = s1.length ();
            int l2 = s2.length ();
            int i, j; 
            HashMap <String, Integer> hm = new HashMap<>();
            for (i=l1; i>0; i--)
            {
                for (j = 0; j<=l1-i; j++)
                {
                    //System.out.println ("hello");
                    String sb = s1.substring (j, j+l1);
                    if (hm.containsKey (sb))
                        hm.put (sb, hm.get(sb)+1);
                    else
                        hm.put (sb, 1);
                }
            }
            boolean flag = false;
            for (i=l2; i>0; i--)
            {
                for (j = 0; j<=l2-i; j++)
                {
                    String sb = s2.substring (j, j+l2);
                    if (hm.containsKey (sb))
                    {
                        flag=true; break;
                    }
                }
            }
            if (flag)
                System.out.println ("YES");
            else
                System.out.println ("NO");

        }

    }
}