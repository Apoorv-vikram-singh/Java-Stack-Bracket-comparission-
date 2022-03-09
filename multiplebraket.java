import java.util.*;
public class multiplebraket
{
    boolean isOpening(char a)
    {
        return a=='{'||a=='['||a=='(';
    }
    boolean isClosing(char b,char c)
    {
        return ((b=='('&&c==')')||(b=='{'&&c=='}')||(b=='['&&c==']'));
    }
    boolean brakertcr(String str)
    {
        Stack<Character> sus=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(isOpening(ch))
            {
                sus.push(ch);
            }
            else
            {
                if(sus.isEmpty())
                {
                    return false;
                }
                else if(!isClosing(sus.peek(), ch))
                {
                    return false;
                }
                else
                {
                    sus.pop();
                }
            }
        }
        return sus.isEmpty();
    }
public static void main(String args[])
{
    multiplebraket obj=new multiplebraket();
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext())
    {
        String str=sc.next();
        boolean rsult=obj.brakertcr(str);
        System.out.println(rsult);
    }
}
}
