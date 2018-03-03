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
	private Takeinout takeinout;

	public Book() {}
	
	public Takeinout getInout() {
		return takeinout;
	}

	public void setInout(Takeinout inout) {
		this.takeinout = inout;
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

	public Location getLoca_num() {
		return location;
	}

	public void setLoca_num(Location loca_num) {
		this.location = loca_num;
	}
	

	@Override
	public String toString() {
		return String.format(
				"Book [bkCode=%s, isbn=%s, rentable=%s, bkname=%s, author=%s, publish=%s, pubyear=%s, info=%s, loca=%s, takeinout=%s]",
				bkCode, isbn, rentable, bkname, author, publish, pubyear, info, location, takeinout);
	}

	public Object[] toArray(int i) {
		return new Object[] {i, bkCode, bkname, author, publish, pubyear, takeinout.getRentdey(), takeinout.getReturnday()};
	}

}