package kr.or.dgit.it_3st_1team.dto;

public class Takeinout {
	private int inout_no;
	private User code;
	private Book bkcode;
	private String rentdey;
	private String returnday;
	public Takeinout() {
		// TODO Auto-generated constructor stub
	}
	
	public Takeinout(int inout_no) {
		this.inout_no = inout_no;
	}

	public Takeinout(String str) {
		if (str != null) {
			String[] parts = str.split("-");

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
	public User getCode() {
		return code;
	}
	public void setCode(User code) {
		this.code = code;
	}
	public Book getBkcode() {
		return bkcode;
	}
	public void setBkcode(Book bkcode) {
		this.bkcode = bkcode;
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
		return String.format("%s-%s", rentdey,returnday);
	}
	
}
