package ass1;

		public abstract class Book {
		    protected String title;
		    protected String author;
		    protected double price;
		    protected int language;

		    public Book() {
		    }

		    public Book(String title, String author, double price, int language) {
		        this.title = title;
		        this.author = author;
		        this.price = price;
		        this.language = language;
		    }

		    public abstract void printAttributes();

		    public abstract double getPrice();
		}

		
		public class SFBook extends Book {
		    private int publishYear;
		    private boolean bestSeller;

		    public SFBook() {
		       
		    }

		    public SFBook(String title, String author, double price, int language, int publishYear, boolean bestSeller) {
		        super(title, author, price, language);
		        this.publishYear = publishYear;
		        this.bestSeller = bestSeller;
		    }

		   
		    public void printAttributes() {
		        
		    }

		  
		    public double getPrice() {
		        
		        return 0.0;
		    }
		}

		
		public class AdventureBook extends Book {
		    private int publishYear;
		    private boolean childrenBook;

		    public AdventureBook() {
		        
		    }

		    public AdventureBook(String title, String author, double price, int language, int publishYear, boolean childrenBook) {
		        super(title, author, price, language);
		        this.publishYear = publishYear;
		        this.childrenBook = childrenBook;
		    }

		   
		    public void printAttributes() {
		       

		    
		    public double getPrice() {
		       
		        return 0.0;
		    }
		    }

		
		import java.util.List;
		import java.util.ArrayList;
		import java.util.Scanner;

		public class Book {
		    public static void main(String[] args) {
		        List<SFBook> sfBooks = new ArrayList<>();
		        List<AdventureBook> adventureBooks = new ArrayList<>();
		        Scanner scanner = new Scanner(System.in);

		       
		        scanner.close();
		    }
		


	}
