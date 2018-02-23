package kr.or.dgit.it_3st_1team.dto;

public class Title {
	private int titleno;
	private String name;
	private String power; //권한
	
	public Title() {
		// TODO Auto-generated constructor stub
	}
	public int getTitleno() {
		return titleno;
	}
	public void setTitleno(int titleno) {
		this.titleno = titleno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return String.format("Title [titleno=%s, name=%s, power=%s]", titleno, name, power);
	}

}
