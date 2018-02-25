package kr.or.dgit.it_3st_1team.dto;

import java.util.Date;

public class Takeinout {
	private int inout_no;
	private User code;
	private Book bkcode;
	private Date rentdey;
	private Date returnday;
	public Takeinout() {
		// TODO Auto-generated constructor stub
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
		return String.format("Takeinout [inout_no=%s, code=%s, bkcode=%s, rentdey=%s, returnday=%s]", inout_no, code,
				bkcode, rentdey, returnday);
	}
	
	
}
