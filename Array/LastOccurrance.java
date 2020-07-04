import java.util.*;
class LastOccurrance {
    public static void main(String args[] ) throws Exception {
        
 
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int key= sc.nextInt();
 
        int a[] = new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]= sc.nextInt();
 
        }
 
            int temp=0,count=0;
        for(int i=0;i<size;i++)
        {
            if(a[i]==key)
            {
                count++;
                temp =i+1;
                continue;
                
            }
 
        }
        if(count!=0)
        {
            System.out.print(temp);
        }
        else
        {
            System.out.println("-1");
        }
 
 
    }
}