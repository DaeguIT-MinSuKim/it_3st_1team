package kr.or.dgit.it_3st_1team.dto;

import java.util.Date;

public class History {
	private int his_no;
	private User code;
	private Book bkcode;
	private Date realreturn;
	private int delay;
	public History() {
		// TODO Auto-generated constructor stub
	}
	public int getHis_no() {
		return his_no;
	}
	public void setHis_no(int his_no) {
		this.his_no = his_no;
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
	public Date getRealreturn() {
		return realreturn;
	}
	public void setRealreturn(Date realreturn) {
		this.realreturn = realreturn;
	}
	public int getDelay() {
		return delay;
	}
	public void setDelay(int delay) {
		this.delay = delay;
	}
	@Override
	public String toString() {
		return String.format("History [his_no=%s, code=%s, bkcode=%s, realreturn=%s, delay=%s]", his_no, code, bkcode,
				realreturn, delay);
	}
	
	
}
