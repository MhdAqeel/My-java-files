import java.util.*;
public class Book{
	private String title ;
	private String author ; 
	private int year;
	
	public Book(String title , String author , int year){
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	public String getTitle(){
		return this.title;
	}
	public String getAuthor(){
		return this.author;
	}
	public int getYear(){
		return year;
	}
	
	ArrayList library = new ArrayList<>();
	
	public void addBook(Book b){
		library.add(b);
	}
	
	public void display(){
		for (){
			System.out.println("Title" + b.getTitle());
			System.out.println("Author" + b.getAuthor());
			System.out.println("Year" + b.getYear());
		}
	}
}