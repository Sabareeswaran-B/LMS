package net.javaguides.librarymanagement.model;

public class Books {
	private int id;
	private String authorName;
	private String bookName;
	private String edition;
	private int copiesAvailable;

	public Books(int id, String authorName, String bookName, String edition, int copiesAvailable) {
		super();
		this.id = id;
		this.authorName = authorName;
		this.bookName = bookName;
		this.edition = edition;
		this.copiesAvailable = copiesAvailable;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public int getCopiesAvailable() {
		return copiesAvailable;
	}

	public void setCopiesAvailable(int copiesAvailable) {
		this.copiesAvailable = copiesAvailable;
	}
		
}
