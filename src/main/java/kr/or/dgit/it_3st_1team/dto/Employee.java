package kr.or.dgit.it_3st_1team.dto;

public class Employee {
	private String code;
	private String name;
	private String id;
	private String pw;
	private Phone tel;
	private String email;
	private Post zipcode;
	private Post addr_id;
	private String addr_de;
	private Title titleno;
	
	public Employee() {
		// TODO Auto-generated constructor stub
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
	public Post getAddr_id() {
		return addr_id;
	}
	public void setAddr_id(Post addr_id) {
		this.addr_id = addr_id;
	}
	public Title getTitleno() {
		return titleno;
	}
	public void setTitleno(Title titleno) {
		this.titleno = titleno;
	}
	public Phone getTel() {
		return tel;
	}
	public void setTel(Phone tel) {
		this.tel = tel;
	}
	public synchronized Post getZipcode() {
		return zipcode;
	}
	public synchronized void setZipcode(Post zipcode) {
		this.zipcode = zipcode;
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
				"Employee [code=%s, name=%s, id=%s, pw=%s, tel=%s, email=%s, zipcode=%s, addr_id=%s, addr_de=%s, titleno=%s]",
				code, name, id, pw, tel, email, zipcode, addr_id.getTotal(), addr_de, titleno);
	}
	
	
	
}
