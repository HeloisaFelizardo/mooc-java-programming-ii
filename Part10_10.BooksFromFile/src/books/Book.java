package books;

public class Book {
	private String name;
	private int publishingYear;
	private int pageCount;
	private String author;

	public Book(String name, int ReleaseYear, int pages, String author) {
		this.name = name;
		this.publishingYear = ReleaseYear;
		this.pageCount = pages;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	public int getPageCount() {
		return pageCount;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return name + "," + publishingYear + "," + pageCount + "," + author;
	}
}
