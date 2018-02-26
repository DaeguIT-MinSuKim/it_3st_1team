package kr.or.dgit.it_3st_1team.dto;

public class Book {
	private String bkCode;
	private int isbn;
	private boolean rentable;
	private String bkname;
	private String author;
	private String publish;
	private int pubyear;
	private String info;
	private Location loca_num;

	public Book() {
	}

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

	public Location getLoca_num() {
		return loca_num;
	}

	public void setLoca_num(Location loca_num) {
		this.loca_num = loca_num;
	}

	@Override
	public String toString() {
		return String.format(
				"Book [bkCode=%s, isbn=%s, rentable=%s, bkname=%s, author=%s, publish=%s, pubyear=%s, info=%s, loca_num=%s]",
				bkCode, isbn, rentable, bkname, author, publish, pubyear, info, loca_num);
	}

}