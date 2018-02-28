package kr.or.dgit.it_3st_1team.typehandlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import kr.or.dgit.it_3st_1team.dto.Post;

public class PostTypeHandler extends BaseTypeHandler<Post> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Post parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setString(i, parameter.toString());
	}

	@Override
	public Post getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return new Post(rs.getString(columnName));
	}

	@Override
	public Post getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return new Post(rs.getString(columnIndex));
	}

	@Override
	public Post getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return new Post(cs.getString(columnIndex));
	}
}
