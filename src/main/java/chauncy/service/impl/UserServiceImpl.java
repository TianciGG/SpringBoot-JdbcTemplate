package chauncy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import chauncy.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void createJdbcUser() {
		jdbcTemplate.update("insert into users values(null,?,?);", "chauncy", 18);

	}

}
