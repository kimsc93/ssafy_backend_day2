package work.com.ssafy.model;

// Java Beans - Data 전달용 객체
public class Book {
	private String title;
	private String isbn;
	private String category;
	private String country;
	private String date;
	private String publisher;
	private String author;
	private String price;
	private String unit;
	private String desc;
	public Book() {}
	public Book(String title, String isbn, String category, String country, String date, String publisher, String author, String price, String unit, String desc) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.category = category;
		this.country = country;
		this.date = date;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.unit = unit;
		this.desc = desc;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + ", category=" + category + ", country=" + country + ", date=" + date + ", publisher=" + publisher + ", author=" + author + ", price=" + price + ", unit=" + unit + ", desc=" + desc + "]";
	}
	
}
