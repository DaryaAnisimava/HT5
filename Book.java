package by.epam.les07.main;
import java.util.*;

public class Book {
	/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
*/
	private int id;
    private String name;
    private String author;
    private String publish;
    private int pyear;
    private int pages;
    private int price;
    private String cover;
 
	

	Book(int _id, String _name, String _author, String _publish, int _pyear, int _pages, int _price, String _cover) {
		this.id = _id;
		this.name = _name;
        this.author = _author;
        this.publish = _publish;
        this.pyear = _pyear;
        this.pages = _pages;
        this.price = _price;
        this.cover = _cover;
	}
	 	public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }
	 
	    public String getAuthor() {
	        return author;
	    }
	 
	    public String getPublish() {
	        return publish;
	    }
	 
	    public int getPyear() {
	        return pyear;
	    }
	 
	    public int getPages() {
	        return pages;
	    }
	 
	    public int getPrice() {
	        return price;
	    }
	 
	    public String getCover() {
	        return cover;
	    }
	    
	    public String toString() {
	        return String.format("ID: %d\t name: %s\t author: %s\t publish %s\t pyear: %s\t pages %s\t price %d\t cover",
	                 id, name, author, publish, pyear, pages, price, cover);
	    }
	 
	
	
	    public static void main(String[] args) {
	    	Library lib = new Library("Maxi");
	    	
			
	        lib.addBookrToLibraryList(new Book(1451,"Хождение по мукам", "Толстой", "Юность", 1985, 640, 23, "твердый"));
	        lib.addBookrToLibraryList(new Book(1245,"Репка", "-       ", "Малышок", 1973, 14, 2, "мягкий"));
	        lib.addBookrToLibraryList(new Book(2133,"Преступление и наказание", "Достоевский", "Юность", 1979, 750, 31, "твердый"));
	        lib.addBookrToLibraryList(new Book(6876,"Справочник грибника", "Иванов", "Минск", 1995, 230, 16, "твердый"));
	        lib.addBookrToLibraryList(new Book(6765,"Бременские музыканты", "Братья Гримм", "Малыш", 1992, 54, 13, "мягкий"));
	        lib.addBookrToLibraryList(new Book(6879,"Красная шапочка", "Перо", "Малыш", 1967, 34, 12, "мягкий"));
	        lib.addBookrToLibraryList(new Book(9889,"Анна Каренина", "Толстой", "Юность", 1989, 780, 30, "твердый"));
	        lib.addBookrToLibraryList(new Book(7878,"Идиот", "Достоевский", "Москва", 1982, 590, 33, "твердый"));
	        lib.addBookrToLibraryList(new Book(6868,"Басни", "Крылов", "Юность", 1973, 240, 19, "твердый"));
	        lib.addBookrToLibraryList(new Book(7965,"Дюймовочка", "Андерсен", "Малышок", 1977, 43, 5, "мягкий"));
	 
		
			
			System.out.println("\nsort by author:");
			List<Book> listSortByAuthor = lib.getListByAuthor("Достоевский");
			for (Book c : listSortByAuthor) {
	            System.out.println(c);
	       }
	 
			System.out.println("\nsort by publish house:");
			List<Book> listSortByPublish = lib.getListByPublish("Юность");
	        for (Book c : listSortByPublish) {
	            System.out.println(c);
	        }
	 
	        System.out.println("\nprint books published after given year:");
	        List<Book> listSortByDiapazon = lib.getListByDiapasond(1980);
	        for (Book c : listSortByDiapazon) {
	            System.out.println(c);
	        }
	 
	 
	   
	    }
	    }
	


	

