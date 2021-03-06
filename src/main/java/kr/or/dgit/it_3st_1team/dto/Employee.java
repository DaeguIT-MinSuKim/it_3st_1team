package kr.or.dgit.it_3st_1team.dto;

public class Employee {
	private String code;
	private String name;
	private String id;
	private String pw;
	private Phone tel;
	private String email;
	private String zipcode;
	private String addr_id;
	private String addr_de;
	private Title title;
	private int titleno;

	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public int getTitleno() {
		return titleno;
	}

	public void setTitleno(int titleno) {
		this.titleno = titleno;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	public Phone getTel() {
		return tel;
	}
	public void setTel(Phone tel) {
		this.tel = tel;
	}

	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddr_id() {
		return addr_id;
	}
	public void setAddr_id(String addr_id) {
		this.addr_id = addr_id;
	}
	public synchronized String getAddr_de() {
		return addr_de;
	}
	public synchronized void setAddr_de(String addr_de) {
		this.addr_de = addr_de;
	}
	
	@Override
	public String toString() {
		return String.format(
				"Employee [code=%s, name=%s, id=%s, pw=%s, tel=%s, email=%s, zipcode=%s, addr_id=%s, addr_de=%s, title=%s]",
				code, name, id, pw, tel, email, zipcode, addr_id, addr_de, title);
	}
	
	public Object[] toArray() {
		return new Object [] {
				code, name, id, tel, email, addr_id, title.getName()
		};
	}
	
	
	
}
