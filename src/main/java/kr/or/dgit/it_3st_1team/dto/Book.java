package kr.or.dgit.it_3st_1team.dto;

import kr.or.dgit.it_3st_1team.service.BookService;
import kr.or.dgit.it_3st_1team.service.TakeinoutService;

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
	private Takeinout take;

	public Book() {}
	
	public Book(String bkname) {
		this.bkname = bkname;
	}

	public Book(String bkCode, String isbn, boolean rentable, String bkname, String author, String publish, int pubyear,
			String info, Location location, Takeinout take) {
		this.bkCode = bkCode;
		this.isbn = isbn;
		this.rentable = rentable;
		this.bkname = bkname;
		this.author = author;
		this.publish = publish;
		this.pubyear = pubyear;
		this.info = info;
		this.location = location;
		this.take = take;
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
		String able;
		if(rentable==false) {
			able = "대여불가";
		}else {
			able = "대여가능";
		}
		return able;
	}
	
	public boolean getterRentable() {
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

	public Takeinout getTake() {
		return take;
	}

	public void setTake(Takeinout take) {
		this.take = take;
	}

	public Object[] toArrayTakeinout(int i) {
		return new Object[] {i+1, bkCode, bkname, author, publish, pubyear, take.getRentday(), take.getReturnday()};
	}


	public Object[] toArray(int i) {
		int ExistNum = BookService.getInstance().selectExistNum(isbn);
		TakeinoutService service = new TakeinoutService();
		int Num = service.selectOutNum(isbn);
		int inNum = ExistNum - Num;
		return new Object[] {i+1, bkname, author, publish, pubyear, inNum+" / "+ExistNum, isRentable()};
	}

	@Override
	public String toString() {
		return String.format(
				"Book [bkCode=%s, isbn=%s, rentable=%s, bkname=%s, author=%s, publish=%s, pubyear=%s, info=%s, location=%s, take=%s]",
				bkCode, isbn, rentable, bkname, author, publish, pubyear, info, location, take);
	}

}