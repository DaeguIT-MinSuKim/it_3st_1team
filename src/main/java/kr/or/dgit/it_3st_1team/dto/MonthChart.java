package kr.or.dgit.it_3st_1team.dto;

public class MonthChart {
	private String month;
	private int result;
	
	public MonthChart() {
	}
	
	public MonthChart(String month, int result) {
		this.month = month;
		this.result = result;
	}
	
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return String.format("Chart [month=%s, result=%s]", month, result);
	}

}