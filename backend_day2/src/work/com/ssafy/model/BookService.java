package work.com.ssafy.model;

import java.util.Date;

public class BookService {
	private BookService() {
	}

	private static BookService service = new BookService();

	public static BookService getService() {
		return service;
	}

	public Book makeBook(String title, String isbn, String category, String country, String date, String publisher, String author, String price, String unit, String desc) {
		return new Book(title, isbn, category, country, date, publisher, author, price, unit, desc);
	}
}
