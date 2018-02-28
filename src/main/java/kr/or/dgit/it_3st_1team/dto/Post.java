package kr.or.dgit.it_3st_1team.dto;

public class Post {
	private String zipcode;
	private String sido;
	private String sigungu;
	private String doro;
	private int build_num1;
	private int build_num2;
	private String bubjung_name;
	private String ri;
	private String heangjeong_name;
	private int bunji_num1;
	private int bunji_num2;
	public Post() {
		// TODO Auto-generated constructor stub
	}
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
	public String getDoro() {
		return doro;
	}
	public void setDoro(String doro) {
		this.doro = doro;
	}
	public int getBuild_num1() {
		return build_num1;
	}
	public void setBuild_num1(int build_num1) {
		this.build_num1 = build_num1;
	}
	public int getBuild_num2() {
		return build_num2;
	}
	public void setBuild_num2(int build_num2) {
		this.build_num2 = build_num2;
	}
	public String getBubjung_name() {
		return bubjung_name;
	}
	public void setBubjung_name(String bubjung_name) {
		this.bubjung_name = bubjung_name;
	}
	public String getRi() {
		return ri;
	}
	public void setRi(String ri) {
		this.ri = ri;
	}
	public String getHeangjeong_name() {
		return heangjeong_name;
	}
	public void setHeangjeong_name(String heangjeong_name) {
		this.heangjeong_name = heangjeong_name;
	}
	public int getBunji_num1() {
		return bunji_num1;
	}
	public void setBunji_num1(int bunji_num1) {
		this.bunji_num1 = bunji_num1;
	}
	public int getBunji_num2() {
		return bunji_num2;
	}
	public void setBunji_num2(int bunji_num2) {
		this.bunji_num2 = bunji_num2;
	}
	@Override
	public String toString() {
		return String.format(
				"%s %s %s %s %s %s %s %s %s %s %s",
				zipcode, sido, sigungu, doro, build_num1, build_num2, bubjung_name, ri, heangjeong_name, bunji_num1,
				bunji_num2);
	}
	
	public Object[] toArray(int i) {
		return new Object[] {
			i, sido + " " + sigungu + " "  + doro + " " + build_num1 + " - " + build_num2, zipcode
		};
	}
	public Object[] toArray1(int i) {
		return new Object[] {
			i, sido + " " + sigungu + " " + heangjeong_name + bunji_num1 +" - " + bunji_num2 + " (" + bubjung_name + ")", zipcode
		};
	}
}
