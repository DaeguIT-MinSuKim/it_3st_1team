package kr.or.dgit.it_3st_1team.dto;

public class Takeinout {
	private int inout_no;
	private User user;
	private Book book;
	private String rentdey;
	private String returnday;
	
	public Takeinout() {
	}
	
	public Takeinout(String str) {
		if (str != null) {
			String[] parts = str.split(",");

			if (parts.length > 0)
				this.rentdey = parts[0];
			if (parts.length > 1)
				this.returnday = parts[1];
		}
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

	public String getRentdey() {
		return rentdey;
	}

	public void setRentdey(String rentdey) {
		this.rentdey = rentdey;
	}

	public String getReturnday() {
		return returnday;
	}

	public void setReturnday(String returnday) {
		this.returnday = returnday;
	}

	@Override
	public String toString() {
		return String.format("%s,%s", rentdey, returnday);
	}

}
