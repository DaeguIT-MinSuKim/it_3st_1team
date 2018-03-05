package kr.or.dgit.it_3st_1team.dao;

import kr.or.dgit.it_3st_1team.dto.Location;

public interface LocationDao {
	//select loca_num으로 section 찾기
	String selectSectionBynum(Location loca);
}
