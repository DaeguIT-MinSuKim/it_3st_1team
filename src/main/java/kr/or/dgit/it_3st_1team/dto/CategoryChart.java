package kr.or.dgit.it_3st_1team.dto;

public class CategoryChart {
	private String cate;
	private int result;
	
	public CategoryChart() {
	}
	
	public CategoryChart(String cate, int result) {
		this.cate = cate;
		this.result = result;
	}
	
	public String getCate() {
		return cate;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return String.format("Chart [cate=%s, result=%s]", cate, result);
	}

}