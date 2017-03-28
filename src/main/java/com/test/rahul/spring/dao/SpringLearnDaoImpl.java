package com.test.rahul.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.test.rahul.spring.model.Users;

@Repository
public class SpringLearnDaoImpl implements SpringLearnDao {

	private JdbcOperations jdbcOperations;

	@Autowired
	public SpringLearnDaoImpl(JdbcOperations jdbcOperations) {
		this.jdbcOperations = jdbcOperations;
	}

	@Override
	public Users getDataById(String id) {
		return jdbcOperations.queryForObject("Select userId, name, email, password from users where userId = ? ", new UsersRowMapper() , id);
	}

	@Override
	public void updateDataBase(String value) {
		// TODO Auto-generated method stub

	}


	private static final class UsersRowMapper implements RowMapper<Users> {
		public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Users(rs.getInt("userId"), rs.getString("name"), rs.getString("email"),
					rs.getString("password"));
		}
	}


	@Override
	public List<Users> getAllUsers() {
		List<Users> users = jdbcOperations.query("Select userId, name, email, password from users", new UsersRowMapper());
		return users;
	}

}
