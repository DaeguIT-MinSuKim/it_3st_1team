package kr.or.dgit.it_3st_1team.dto;

public class Post {
	private String zipcode;
	private String addr_id;
	private String addr_de;
	
	public Post() {}
	
	
	
	public Post(String zipcode, String addr_id, String addr_de) {
		this.zipcode = zipcode;
		this.addr_id = addr_id;
		this.addr_de = addr_de;
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
	public String getAddr_de() {
		return addr_de;
	}
	public void setAddr_de(String addr_de) {
		this.addr_de = addr_de;
	}
	@Override
	public String toString() {
		return String.format("Post [zipcode=%s, addr_id=%s, addr_de=%s]", zipcode, addr_id, addr_de);
	}
	
	
}
