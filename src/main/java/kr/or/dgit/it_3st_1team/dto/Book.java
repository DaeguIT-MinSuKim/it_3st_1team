package kr.or.dgit.it_3st_1team.dto;

public class Book {
	private String bkCode;
	private String isbn;
	private String rentable;
	private String bkname;
	private String author;
	private String publish;
	private int pubyear;
	private String info;
	private Location loca_num;
	private Takeinout inout;

	public Book() {}
	
	public Book(String str) {
		if(str != null) {
			String[] parts = str.split(",");
			
			if(parts.length >0) this.bkCode = parts[0];
			if(parts.length >1) this.isbn = parts[1];
			if(parts.length >2) this.rentable = parts[2];
			if(parts.length >3) this.bkname = parts[3];
			if(parts.length >4) this.author = parts[4];
			if(parts.length >5) this.publish = parts[5];
			if(parts.length >6) this.pubyear = Integer.parseInt(parts[6]);
			if(parts.length >7) this.info = parts[7];
			if(parts.length >8) this.loca_num = new Location(parts[8]);
			if(parts.length >9) this.inout = new Takeinout(parts[9]);
		}
		
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

	public String isRentable() {
		return rentable;
	}

	public void setRentable(String rentable) {
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

	public Takeinout getInout() {
		return inout;
	}

	public void setInout(Takeinout inout) {
		this.inout = inout;
	}

	
	@Override
	public String toString() {
		return String.format(
				"%s, %s, %s, %s, %s, %s, %s, %s, %s, %s",
				bkCode, isbn, rentable, bkname, author, publish, pubyear, info, loca_num, inout);
	}

	public Object[] toArray(int i) {
		return new Object[] {i, bkCode, bkname, author, publish, pubyear, inout.getRentdey(), inout.getReturnday()};
	}

}