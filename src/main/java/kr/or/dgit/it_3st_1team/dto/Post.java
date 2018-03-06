package kr.or.dgit.it_3st_1team.dto;

public class Post {
	private String zipcode;
	private String sido;
	private String sigungu;
	private String bubjung_name;
	private String heangjeong_name;
	private String bunji_num1;
	private String bunji_num2;
	private String doro;
	private String build_num1;
	private String build_num2;
	private String addr_id;
	private String addr_de;

	public Post() {}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getSido() {
		return sido;
	}

	public void setSido(String sido) {
		this.sido = sido;
	}

	public String getSigungu() {
		return sigungu;
	}

	public void setSigungu(String sigungu) {
		this.sigungu = sigungu;
	}

	public String getBubjung_name() {
		return bubjung_name;
	}

	public void setBubjung_name(String bubjung_name) {
		this.bubjung_name = bubjung_name;
	}

	public String getHeangjeong_name() {
		return heangjeong_name;
	}

	public void setHeangjeong_name(String heangjeong_name) {
		this.heangjeong_name = heangjeong_name;
	}

	public String getBunji_num1() {
		return bunji_num1;
	}

	public void setBunji_num1(String bunji_num1) {
		this.bunji_num1 = bunji_num1;
	}

	public String getBunji_num2() {
		return bunji_num2;
	}

	public void setBunji_num2(String bunji_num2) {
		this.bunji_num2 = bunji_num2;
	}

	public String getDoro() {
		return doro;
	}

	public void setDoro(String doro) {
		this.doro = doro;
	}

	public String getBuild_num1() {
		return build_num1;
	}

	public void setBuild_num1(String build_num1) {
		this.build_num1 = build_num1;
	}

	public String getBuild_num2() {
		return build_num2;
	}

	public void setBuild_num2(String build_num2) {
		this.build_num2 = build_num2;
	}

	public String getAddr_id() {
		return addr_id;
	}

	public void setAddr_id(String addr_id) {
		this.addr_id = sido;
	}

	public String getAddr_de() {
		return addr_de;
	}

	public void setAddr_de(String addr_de) {
		this.addr_de = addr_de;
	}
	
	@Override
	public String toString() {
		return String.format(
				"Post [zipcode=%s, sido=%s, sigungu=%s, bubjung_name=%s, heangjeong_name=%s, bunji_num1=%s, bunji_num2=%s, doro=%s, build_num1=%s, build_num2=%s, addr_id=%s, addr_de=%s]",
				zipcode, sido, sigungu, bubjung_name, heangjeong_name, bunji_num1, bunji_num2, doro, build_num1,
				build_num2, addr_id, addr_de);
	}

	public Object[] toArrayDong(int i) {
		this.addr_id = sido + sigungu + heangjeong_name + bunji_num1 + "-" + bunji_num2;
		return new Object[] { i, sido + " " + sigungu + " " + heangjeong_name + " " + bunji_num1 + " - " + bunji_num2 + " " + "("+bubjung_name+") ", zipcode };
	}

	public Object[] toArrayDoro(int i) {
		this.addr_id = sido + sigungu + doro + build_num1 + "-" + build_num2;
		return new Object[] { i, sido + " " + sigungu + " " + doro + " " + build_num1 + " - " + build_num2 + " ", zipcode };
	}

}
