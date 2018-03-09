package kr.or.dgit.it_3st_1team.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import kr.or.dgit.it_3st_1team.service.BookService;

public class Reserve {
	private int re_no;
	private String code;
	private String bkcode;
	private String isbn;
	private Date resday;
	
	public Reserve() {
		// TODO Auto-generated constructor stub
	}
	
	public Date getResday() {
		return resday;
	}
	public void setResday(Date resday) {
		this.resday = resday;
	}


	public int getRe_no() {
		return re_no;
	}
	public void setRe_no(int re_no) {
		this.re_no = re_no;
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

	public Object[] ReserveToArray(int i) {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		Book book = BookService.getInstance().selectByIsbn(isbn);
		return new Object[] {i+1, book.getBkname(), book.getAuthor(),
				book.getPublish(), book.getPubyear(), isbn, sd.format(resday)};
	}
}
