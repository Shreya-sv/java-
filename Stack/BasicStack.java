import java.util.Scanner;

class BasicStack
{
    
    int top;
    int size;
    int st[];
     BasicStack()
     {
       
        top= -1;
        //System.out.print(st.length);
        
     }
     
    void push(int ele)
    {
       
        if(isFull())
        {
            System.out.println("Stack is overflow");
        }
        else
        {
            if(top ==-1)
            {
                top =0;
                st[top]= ele;
            }
            else
            {
                top =top +1;
                st[top]= ele;
            }
        }
    }
    boolean isFull()
    {
        if(top == size-1)
        {
            return true;
        }
        else
            return false;
    }
    boolean isEmpty()
    {
        if(top == -1)
        {
            return true;
        }
        else
            return false;
    }

    int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is underflow .......... no elements to delete");
            return -1;
        }
        else
        {
            int p = st[top];
            top= top-1;
            return p;

        }
    }
    void display()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty ");
        }
        else
        {
           for(int i =0;i<=top; i++)
            {
                System.out.println(st[i]);
            }
    }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        

        BasicStack s = new BasicStack();
        System.out.println("enter the size");
        s.size = sc.nextInt();
        s.st = new int[s.size];
       
        int ch;
        do
        {
            System.out.println("1. Insert element ");
            System.out.println("2. Delete element ");
            System.out.println("3. is empty ");
            System.out.println("4. is full");
            System.out.println("5. Display");
            System.out.println("Enter Your choice : ");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1 :
                        System.out.println("enter ele :");
                        int e = sc.nextInt();
                        s.push(e);
                        break;
                case 2 :
                        System.out.println(" deleted ele "+s.pop());
                        break;
                case 3:
                        System.out.print(s.isEmpty());
                        break;
                case 4:
                        System.out.print(s.isFull());
                        break;
                case 5:
                        s.display();
                        break;
            }


        }while(ch <=5);
        
    }
}