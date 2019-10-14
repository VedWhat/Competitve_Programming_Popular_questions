import java.util.*;
class beer
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        Queue <Integer> q1  = new LinkedList <>();
        Queue <Integer> q2  = new LinkedList <>();
        Queue <Integer> q3  = new LinkedList <>();
        Queue <Integer> q4  = new LinkedList <>();
        Queue <Integer> q = new LinkedList <>();
        int n = sc.nextInt ();
        sc.nextLine ();
        int i;
        int scl=0, roll=0;
        for (i=0; i<n; i++)
        {
            String opn = sc.nextLine ();
            if(opn.charAt (0)=='D')
            {
                scl = q.peek ();
                roll=0;
                switch (scl)
                {
                    case 1:
                    roll = q1.remove();
                    if (q1.isEmpty())
                        q.remove();
                    break;
                    case 2:
                    roll = q2.remove();
                    if (q2.isEmpty())
                        q.remove();
                    break;
                    case 3:
                    roll = q3.remove();
                    if (q3.isEmpty())
                        q.remove();
                    break;
                    case 4:
                    roll = q4.remove();
                    if (q4.isEmpty())
                        q.remove();
                    break;
                }
                System.out.println (scl + " " + roll);

            }
            else{
                String items [] = opn.split (" ");
                scl = Integer.parseInt (items[1]);
                roll = Integer.parseInt (items[2]);
                switch (scl)
                {
                    case 1:
                    if (q1.isEmpty())
                        q.add (1);
                    q1.add (roll);
                    break;
                    case 2:
                    if (q2.isEmpty())
                        q.add (2);
                    q2.add (roll);
                    break;
                    case 3:
                    if (q3.isEmpty())
                        q.add (3);
                    q3.add (roll);
                    break;
                    case 4:
                    if (q4.isEmpty())
                        q.add (4);
                    q4.add (roll);
                    break;
                }
            }
        }



    }
}