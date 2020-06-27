import java.util.*;
import java.lang.*;
import java.io.*;


class ArrayRotation
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        
        
        while(test!=0)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int len = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int arr[] = new int[len]; 
            int answer[] = new int[len];
            StringTokenizer at = new StringTokenizer(br.readLine());
            for(int i=0 ; i< len ; i++)
            {
               arr[i] = Integer.parseInt(at.nextToken());
                
            }
            for(int j=0; j<len;j++)
            {
                answer[( j - d + len) % len] = arr[j];
            }
            
            for(int j=0; j<len;j++)
            {
                System.out.print(answer[j]+" ");
            }
          
           test--;
            System.out.println();
        }
    }
}