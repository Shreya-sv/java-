import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
class Paranthesis {
    public static void main(String args[] ) throws Exception {
      Scanner sc=new Scanner(System.in); 
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int t = Integer.parseInt(br.readLine());
       for(int i=0;i<t;i++)
       {
           String inp=br.readLine();
           char arr[]=inp.toCharArray();
           char res[]=new char[arr.length];
           int min=0;
           int flag=1;
           for(int j=0;j<arr.length;j++)
           {
                  if(arr[j]=='{'||arr[j]=='['||arr[j]=='(') 
                  {
                       
                       res[min]=arr[j];
                       min++;
                       
                  }
                  else if (min > 0)
                  {
                        if(arr[j]=='}'&&res[min-1]=='{')
                          min--;
                        else if(arr[j]==']'&&res[min-1]=='[')
                          min--;
                        else if(arr[j]==')'&&res[min-1]=='(')
                          min--;
                  }
                  else{
                        flag=0;
                        break;
                      }
                  
            }
            if(flag==1 && min == 0)
            System.out.println("YES");
            else
            System.out.println("NO");
 
       }
 
    }
}