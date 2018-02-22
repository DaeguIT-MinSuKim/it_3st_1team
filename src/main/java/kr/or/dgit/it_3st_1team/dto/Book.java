package kr.or.dgit.it_3st_1team.dto;

public class Book {
	private String bkCode;
	private int isbn;
	private boolean rentable;
	private String bkName;
	private String author;
	private String publish;
	private int year;
	private String info;
	private int loca_no;
	
	public String getBkCode() {
		return bkCode;
	}
	public void setBkCode(String bkCode) {
		this.bkCode = bkCode;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public boolean isRentable() {
		return rentable;
	}
	public void setRentable(boolean rentable) {
		this.rentable = rentable;
	}
	public String getBkName() {
		return bkName;
	}
	public void setBkName(String bkName) {
		this.bkName = bkName;
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
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getLoca_no() {
		return loca_no;
	}
	public void setLoca_no(int loca_no) {
		this.loca_no = loca_no;
	}
	@Override
	public String toString() {
		return String.format(
				"Book [%s, %s, %s, %s, %s, %s, %s, %s, %s]",
				bkCode, isbn, rentable, bkName, author, publish, year, info, loca_no);
	}
}
