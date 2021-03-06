package kr.or.dgit.it_3st_1team.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Request {
	private String code;
	private String bkname;
	private String author;
	private String publish;
	private int pubyear;
	private String isbn;
	private int price;
	private Date reqday;
	
	public Request() {
		// TODO Auto-generated constructor stub
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getReqday() {
		return reqday;
	}

	public void setReqday(Date reqday) {
		this.reqday = reqday;
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
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("Request [code=%s, bkname=%s, author=%s, publish=%s, pubyear=%s, isbn=%s, price=%s]", code,
				bkname, author, publish, pubyear, isbn, price);
	}

	public Object[] RequestToArray(int i) {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		return new Object[] {i+1, bkname, author, publish, pubyear, isbn, sd.format(reqday)};
	}
	
	
}
