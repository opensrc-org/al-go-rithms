
import java.util.*;
import java.lang.*;
import java.io.*;
class Vivek
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean seen[] = new boolean[n+1];
        for(int i=0; i<=n; i++){
            seen[i]=true;
        }
        seen[0] = false;
        seen[1] = false;
        for(int p = 2; p<=n; p++){
            for(int i= 2*p; i<=n; i = i+p){
                seen[i] = false;
            }
        }

        for(int i=1; i<=n ; i++){
            if(seen[i])
                System.out.print(i + " ");
        }
    }
}

