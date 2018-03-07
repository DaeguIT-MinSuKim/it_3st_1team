package kr.or.dgit.it_3st_1team.dto;

import java.util.Date;
import java.util.List;

import kr.or.dgit.it_3st_1team.service.HistoryService;

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
	@Override
	public String toString() {
		return String.format("History [his_no=%s, code=%s, bkcode=%s, realreturn=%s, delay=%s]", his_no, code, bkcode,
				realreturn, delay);
	}
	
	public Object[] historyAll(int i) {
		
		//HistoryService.getInstance().selectAllhistory(his);
		return new Object[] {i+1, bkname, author, rentday, returnday, realreturn, delay, isState()};
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
}
