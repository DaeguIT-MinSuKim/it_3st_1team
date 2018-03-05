package kr.or.dgit.it_3st_1team.dto;

public class Location {
	private String loca_num;
	private String loca_section;
	
	public Location() {
		// TODO Auto-generated constructor stub
	}

	public Location(String str) {
		if(str != null) {
			String part1 = str.substring(0, 3);
			String part2 = str.substring(3, str.length());
			
			if(part1.length() >0) this.loca_num = part1;
			if(part2.length() >1) this.loca_section = part2;
		}
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
		return String.format("%s", loca_num);
	}
	
}
