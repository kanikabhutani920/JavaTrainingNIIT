package Collections;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {
	
	static void showpush(Stack st,int a)
	{
	   st.push(new Integer(a));
	   System.out.println("push("+a+")");
	   System.out.println("Stack: " +st);
	}
	
	static void showpop(Stack st)
	{
	   System.out.println("pop ->");
	   Integer a =(Integer)st.pop();
	   System.out.println(a);
	   System.out.println("Stack: " +st);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack st=new Stack();
		System.out.println("Stack:" +st);
		showpush(st,42);
		showpush(st,66);
		showpush(st,99);
		showpop(st);
		showpop(st);
		showpop(st);
		
		try {
			showpop(st);
		}catch(EmptyStackException e) {
			System.out.println("emptyStack");
		}
	}

}
