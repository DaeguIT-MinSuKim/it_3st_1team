package kr.or.dgit.it_3st_1team.dto;

import java.util.Date;

public class User {
	private int code;
	private String name;
	private String id;
	private String pw;
	private Phone tel;
	private String email;
	private Post addr_id;
	private boolean blacktf;
	private Date entryday;
	private Date freeday;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public Phone getTel() {
		return tel;
	}
	public void setTel(Phone tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Post getAddr_id() {
		return addr_id;
	}
	public void setAddr_id(Post addr_id) {
		this.addr_id = addr_id;
	}
	public boolean isBlacktf() {
		return blacktf;
	}
	public void setBlacktf(boolean blacktf) {
		this.blacktf = blacktf;
	}
	public Date getEntryday() {
		return entryday;
	}
	public void setEntryday(Date entryday) {
		this.entryday = entryday;
	}
	public Date getFreeday() {
		return freeday;
	}
	public void setFreeday(Date freeday) {
		this.freeday = freeday;
	}
	@Override
	public String toString() {
		return String.format(
				"User [code=%s, name=%s, id=%s, pw=%s, tel=%s, email=%s, addr_id=%s, blacktf=%s, entryday=%s, freeday=%s]",
				code, name, id, pw, tel, email, addr_id, blacktf, entryday, freeday);
	}
	
	
	
	
}
