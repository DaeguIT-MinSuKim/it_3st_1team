package kr.or.dgit.it_3st_1team.dto;

public class Reserve {
	private int re_no;
	private User code;
	private Book bkcode;
	private String isbn;
	public Reserve() {
		// TODO Auto-generated constructor stub
	}
	public int getRe_no() {
		return re_no;
	}
	public void setRe_no(int re_no) {
		this.re_no = re_no;
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
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return String.format("Reserve [re_no=%s, code=%s, bkcode=%s, isbn=%s]", re_no, code, bkcode, isbn);
	}
	
	
}
