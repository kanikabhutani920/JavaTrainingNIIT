package Collections;

import java.awt.List;
import java.util.ArrayList;

class Book
{
	int id;
	String name,author,publisher;
	int quantity;
	
	public Book(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}

public class ArrayListExample {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Book> list=new ArrayList<Book>();
		
		Book b1=new Book(101,"Let us c","Yashwant Kanethkar","BPB",8);
		Book b2=new Book(102,"Data Communications and netw","Forouzan","Mc Graw Hill",4);
		Book b3=new Book(103,"Os","Galvin","Wiley",6);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		for(Book b:list)
		{
			System.out.println(b.id + "" +b.name +" " +b.author +"" +b.publisher +"" +b.quantity);
		}
	}

}
