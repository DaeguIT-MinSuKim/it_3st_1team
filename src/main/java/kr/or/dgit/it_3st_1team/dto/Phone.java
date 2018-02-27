package kr.or.dgit.it_3st_1team.dto;

public class Phone {
	private String phone1;
	private String phone2;
	private String phone3;
	
	public Phone() {}	
	
	public Phone(String str) {
		if(str != null) {
			String[] parts = str.split("-");
			
			if(parts.length >0) this.phone1 = parts[0];
			if(parts.length >1) this.phone2 = parts[1];
			if(parts.length >2) this.phone3 = parts[2];
		}
	}

	public Phone(String phone1, String phone2, String phone3) {
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getPhone3() {
		return phone3;
	}

	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}

	@Override
	public String toString() {
		return String.format("%s-%s-%s", phone1,phone2,phone3);
	}

	
}
