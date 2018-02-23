package kr.or.dgit.it_3st_1team.dto;

public class Location {
	private String loca_num;
	private String loca_section;
	public Location() {
		// TODO Auto-generated constructor stub
	}
	public String getLoca_num() {
		return loca_num;
	}
	public void setLoca_num(String loca_num) {
		this.loca_num = loca_num;
	}
	public String getLoca_section() {
		return loca_section;
	}
	public void setLoca_section(String loca_section) {
		this.loca_section = loca_section;
	}
	@Override
	public String toString() {
		return String.format("Location [loca_num=%s, loca_section=%s]", loca_num, loca_section);
	}
	
	
}
