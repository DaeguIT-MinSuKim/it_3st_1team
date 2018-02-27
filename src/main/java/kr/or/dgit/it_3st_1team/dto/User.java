package kr.or.dgit.it_3st_1team.dto;

import java.util.Date;

public class User {
	private int code;
	private String name;
	private String id;
	private String pw;
	private Phone tel;
	private String email;
	private String addr_id;
	private String blacktf;
	private String entryday;
	private String freeday;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String str) {
		if(str != null) {
			String[] parts = str.split(",");
			
			if(parts.length >0) this.code = Integer.parseInt(parts[0]);
			if(parts.length >1) this.name = parts[1];
			if(parts.length >2) this.id = parts[2];
			if(parts.length >3) this.pw = parts[3];
			if(parts.length >4) this.tel = new Phone(parts[4]);
			if(parts.length >5) this.email = parts[5];
			if(parts.length >6) this.addr_id = parts[6];
			if(parts.length >7) this.blacktf = parts[7];
			if(parts.length >8) this.entryday = parts[8];
			if(parts.length >9) this.freeday = parts[9];
		}
	}
	
	
	public User(String name, String pw, Phone tel, String email, String addr_id) {
		this.name = name;
		this.pw = pw;
		this.tel = tel;
		this.email = email;
		this.addr_id = addr_id;
	}


	public User(int code, String name, String id, String pw, Phone tel, String email, String addr_id, String entryday) {
		super();
		this.code = code;
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.tel = tel;
		this.email = email;
		this.addr_id = addr_id;
		this.entryday = entryday;
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
	public String getAddr_id() {
		return addr_id;
	}
	public void setAddr_id(String addr_id) {
		this.addr_id = addr_id;
	}
	public String isBlacktf() {
		return blacktf;
	}
	public void setBlacktf(String blacktf) {
		this.blacktf = blacktf;
	}
	public String getEntryday() {
		return entryday;
	}
	public void setEntryday(String entryday) {
		this.entryday = entryday;
	}
	public String getFreeday() {
		return freeday;
	}
	public void setFreeday(String freeday) {
		this.freeday = freeday;
	}
	@Override
	public String toString() {
		return String.format(
				"code=%s, name=%s, id=%s, pw=%s, tel=%s, email=%s, blacktf=%s, entryday=%s, freeday=%s",
				code, name, id, pw, tel, email,  blacktf, entryday, freeday);
	}

}
