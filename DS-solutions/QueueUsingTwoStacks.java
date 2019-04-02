import java.io.*;
import java.util.*;

public class QueueUsingTwoStacks {

    public static void popOrPeek(ArrayList<Stack<Integer>> a,int type)
    {
        if(!a.get(1).empty())
        {
             if(type==2)
            {
                a.get(1).pop();
            }
            else
            {
                System.out.println(a.get(1).peek());
            }
            return;
        }
        else{
        while(!a.get(0).empty())
        {
            a.get(1).push(a.get(0).pop());
        }
           if(type==2)
            {
                a.get(1).pop();
            }
            else
            {
                System.out.println(a.get(1).peek());
            }
        }
        return;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       ArrayList<Stack<Integer>> stack=new ArrayList<Stack<Integer>>();
       stack.add(new Stack<Integer>());
       stack.add(new Stack<Integer>());
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>=0)
        {
            String arr[]=s.nextLine().split(" ");
            switch(arr[0])
            {
                case "1":
                    stack.get(0).push(Integer.parseInt(arr[1]));
                    break;
                case "2":
                    popOrPeek(stack,2);
                    break;
                case "3":
                   
                    popOrPeek(stack,3);
                    break;
            }
            n--;
        }
    }
}

