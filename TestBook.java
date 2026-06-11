public class TestBook{
	public static void main(String [] args){
		Book b1 = new Book ("Harry Potter","JK Rowling",2000);
		Book b2 = new Book ("Psycology of money" , "Robert" , 2008);
		Book b3 = new Book ("Game Of Thrones" , "Albert" , 1992);
		b1.addBook(b1);
		b2.addBook(b2);
		b1.display();
	}
}