package kr.or.dgit.it_3st_1team.typehandlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import kr.or.dgit.it_3st_1team.dto.Phone;
import kr.or.dgit.it_3st_1team.dto.Takeinout;

public class DateTypeHandler extends BaseTypeHandler<Takeinout> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Takeinout parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setString(i, parameter.toString());
	}

	@Override
	public Takeinout getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return new Takeinout(rs.getString(columnName));
	}

	@Override
	public Takeinout getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return new Takeinout(rs.getString(columnIndex));
	}

	@Override
	public Takeinout getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return new Takeinout(cs.getString(columnIndex));
	}

}
