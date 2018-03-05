package kr.or.dgit.it_3st_1team.typehandlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import kr.or.dgit.it_3st_1team.dto.Location;

public class LocationTypeHandler extends BaseTypeHandler<Location> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Location parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setString(i, parameter.toString());
	}

	@Override
	public Location getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return new Location(rs.getString(columnName));
	}

	@Override
	public Location getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return new Location(rs.getString(columnIndex));
	}

	@Override
	public Location getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return new Location(cs.getString(columnIndex));
	}

}
