package kr.or.dgit.it_3st_1team.dto;

import java.util.Date;

public class User {
	private String code;
	private String name;
	private String id;
	private String pw;
	private Phone tel;
	private String email;
	private Post zipcode;
	private Post addr_id;
	private String addr_de;
	private boolean blacktf;
	private Date entryday;
	private Date freeday;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String code) {
		super();
		this.code = code;
	}
	
	public User(String name, String pw, Phone tel, String email, Post addr_id) {
		super();
		this.name = name;
		this.pw = pw;
		this.tel = tel;
		this.email = email;
		this.addr_id = addr_id;
	}


	public User(String code, String name, String id, String pw, Phone tel, String email, Post addr_id, Date entryday) {
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
	
	public User(String code, String name, String id, String pw, Phone tel, String email, Post addr_id, String addr_de,
			boolean blacktf, Date entryday, Date freeday) {
		super();
		this.code = code;
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.tel = tel;
		this.email = email;
		this.addr_id = addr_id;
		this.addr_de = addr_de;
		this.blacktf = blacktf;
		this.entryday = entryday;
		this.freeday = freeday;
	}


	public String getAddr_de() {
		return addr_de;
	}
	public void setAddr_de(String addr_de) {
		this.addr_de = addr_de;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
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
	public synchronized Post getZipcode() {
		return zipcode;
	}
	public synchronized void setZipcode(Post zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return String.format(
				"User [code=%s, name=%s, id=%s, pw=%s, tel=%s, email=%s, zipcode=%s, addr_id=%s, addr_de=%s, blacktf=%s, entryday=%s, freeday=%s]",
				code, name, id, pw, tel, email, zipcode, addr_id, addr_de, blacktf, entryday, freeday);
	}
}
