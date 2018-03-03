package kr.or.dgit.it_3st_1team.dto;

public class Book {
	private String bkCode;
	private String isbn;
	private boolean rentable;
	private String bkname;
	private String author;
	private String publish;
	private int pubyear;
	private String info;
	private Location location;
	private String rentday;
	private String returnday;

	public Book() {
	}
	
	public Book(String bkname) {
		this.bkname = bkname;
	}

	public String getBkCode() {
		return bkCode;
	}

	public void setBkCode(String bkCode) {
		this.bkCode = bkCode;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isRentable() {
		return rentable;
	}

	public void setRentable(boolean rentable) {
		this.rentable = rentable;
	}

	public String getBkname() {
		return bkname;
	}

	public void setBkname(String bkname) {
		this.bkname = bkname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public int getPubyear() {
		return pubyear;
	}

	public void setPubyear(int pubyear) {
		this.pubyear = pubyear;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getRentday() {
		return rentday;
	}

	public void setRentday(String rentday) {
		this.rentday = rentday;
	}

	public String getReturnday() {
		return returnday;
	}

	public void setReturnday(String returnday) {
		this.returnday = returnday;
	}

	@Override
	public String toString() {
		return String.format(
				"Book [bkCode=%s, isbn=%s, rentable=%s, bkname=%s, author=%s, publish=%s, pubyear=%s, info=%s, location=%s, rentday=%s, returnday=%s]",
				bkCode, isbn, rentable, bkname, author, publish, pubyear, info, location, rentday, returnday);
	}

	public Object[] toArrayTakeinout(int i) {
		return new Object[] {i, bkCode, bkname, author, publish, pubyear, rentday, returnday};
	}

	public Object[] toArray() {
		return new Object[] {null, bkname, author, publish, pubyear, null, rentable};
	}

}