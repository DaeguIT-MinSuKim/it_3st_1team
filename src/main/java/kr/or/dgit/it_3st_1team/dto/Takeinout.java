package kr.or.dgit.it_3st_1team.dto;

import java.util.Date;

public class Takeinout {
	private int inout_no;
	private User user;
	private Book book;
	private Date rentdey;
	private Date returnday;
	
	public Takeinout() {
	}
	
	public int getInout_no() {
		return inout_no;
	}
	public void setInout_no(int inout_no) {
		this.inout_no = inout_no;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}

	public Date getRentdey() {
		return rentdey;
	}

	public void setRentdey(Date rentdey) {
		this.rentdey = rentdey;
	}

	public Date getReturnday() {
		return returnday;
	}

	public void setReturnday(Date returnday) {
		this.returnday = returnday;
	}

	@Override
	public String toString() {
		return String.format("Takeinout [inout_no=%s, user=%s, book=%s, rentdey=%s, returnday=%s]", inout_no, user,
				book, rentdey, returnday);
	}

}
