package kr.or.dgit.it_3st_1team.dto;

public class Category {
	private int num;
	private String catename;
	private int catesize;
	private int parentnum;
	
	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(String catename) {
		this.catename = catename;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCatename() {
		return catename;
	}

	public void setCatename(String catename) {
		this.catename = catename;
	}

	public int getCatesize() {
		return catesize;
	}

	public void setCatesize(int catesize) {
		this.catesize = catesize;
	}

	public int getParentnum() {
		return parentnum;
	}

	public void setParentnum(int parentnum) {
		this.parentnum = parentnum;
	}

	@Override
	public String toString() {
		return String.format(" %s", catename);
	}
	
	
}
