package kr.or.dgit.it_3st_1team.typehandlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import kr.or.dgit.it_3st_1team.dto.Phone;
import kr.or.dgit.it_3st_1team.dto.User;

public class UserTypeHandler extends BaseTypeHandler<User> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, User parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setString(i, parameter.toString());
	}

	@Override
	public User getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return new User(rs.getString(columnName));
	}

	@Override
	public User getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return new User(rs.getString(columnIndex));
	}

	@Override
	public User getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return new User(cs.getString(columnIndex));
	}

}
