package kr.or.dgit.it_3st_1team.typehandlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import kr.or.dgit.it_3st_1team.dto.Phone;

public class PhoneTypeHandler extends BaseTypeHandler<Phone> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Phone parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setString(i, parameter.toString());
	}

	@Override
	public Phone getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return new Phone(rs.getString(columnName));
	}

	@Override
	public Phone getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return new Phone(rs.getString(columnIndex));
	}

	@Override
	public Phone getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return new Phone(cs.getString(columnIndex));
	}

}
