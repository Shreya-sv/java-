import java.io.*;
import java.util.StringTokenizer;

class SequencingEle
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while(test --> 0)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            char str[] = s1.toCharArray();
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for(int i =start ; i<=end; i++)
            {
                for(int j =start; j <= end-1; j++)
                    if(str[j+1] > str[j])
                    {
                        char s = str[j+1];
                        str[j+1]= str[j];
                        str[j]=s;


                    }
            }

            System.out.println(str);

        }
    }
}