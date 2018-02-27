package kr.or.dgit.it_3st_1team.typehandlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import kr.or.dgit.it_3st_1team.dto.Book;

public class BookTypeHandler extends BaseTypeHandler<Book> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Book parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setString(i, parameter.toString());
	}

	@Override
	public Book getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return new Book(rs.getString(columnName));
	}

	@Override
	public Book getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return new Book(rs.getString(columnIndex));
	}

	@Override
	public Book getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return new Book(cs.getString(columnIndex));
	}

}
