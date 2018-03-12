package kr.or.dgit.it_3st_1team.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class History {
	private int his_no;
	private String code;
	private String bkcode;
	private Date realreturn;
	private Date returnday;
	private Date rentday;
	private int delay;
	private String bkname;
	private String author;
	private String loca_num;
		
	public History() {
		// TODO Auto-generated constructor stub
	}
	public Date getReturnday() {
		return returnday;
	}
	public void setReturnday(Date returnday) {
		this.returnday = returnday;
	}
	public Date getRentday() {
		return rentday;
	}
	public void setRentday(Date rentday) {
		this.rentday = rentday;
	}
	public int getHis_no() {
		return his_no;
	}
	public void setHis_no(int his_no) {
		this.his_no = his_no;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getBkcode() {
		return bkcode;
	}
	public void setBkcode(String bkcode) {
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
	public String getLoca_num() {
		return loca_num;
	}
	public void setLoca_num(String loca_num) {
		this.loca_num = loca_num;
	}
	
	public String getBkname() {
		return bkname;
	}
	public void setBkname(String bkname) {
		this.bkname = bkname;
	}
	
	@Override
	public String toString() {
		return String.format("History [his_no=%s, code=%s, bkcode=%s, realreturn=%s, delay=%s]", his_no, code, bkcode,
				realreturn, delay);
	}
	
	public Object[] historyAll(int i) {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		String day;
		if(realreturn==null) {
			day = "";
		}else{
			day = sd.format(realreturn);
		}
		return new Object[] {i+1, bkname, author, sd.format(rentday), sd.format(returnday), day, delay, isState()};
	}
	private String isState() {
		String state;
		if(realreturn==null) {
			state="대출중";
		}else{
			state="반납";
		}
		return state;
	}
	
	public Object[] toHisAll(int i) {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		String day;
		if(realreturn==null) {
			day = "";
		}else{
			day = sd.format(realreturn);
		}
		return new Object[] {
				i+1, code, bkcode, bkname, author, sd.format(rentday), sd.format(returnday), day, delay
		};
	}
}
