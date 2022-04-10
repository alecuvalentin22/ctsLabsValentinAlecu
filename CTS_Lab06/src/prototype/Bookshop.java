package prototype;

import java.util.ArrayList;

public class Bookshop implements Cloneable {
	
	private String name;
	private ArrayList<Book> books=new ArrayList<Book>();
	public Bookshop(String name, ArrayList<Book> books) {
		super();
		this.name = name;
		this.books = books;
	}
	
	public Bookshop() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	

	@Override
	public String toString() {
		return "Bookshop [name=" + name + ", books=" + books + "]";
	}
	
	public static Bookshop loadDataFromDatabase(String name) {
		Bookshop bookshop=new Bookshop();
		
		bookshop.name=name;
		Book book=null;
		for(int i=0;i<10;i++) {
			book=new Book(name+"-"+i, "anca",i*100);
			bookshop.books.add(book);
		}
		
		return bookshop;
		
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Bookshop copy=new Bookshop();
		copy.name=this.name;
		copy.books=(ArrayList<Book>) this.books.clone();
		return copy;
		
		//return super.clone();
	}
	
	
	

}
