package org.practice.springDao.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.practice.springDao.model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class JdbcDaoImpl {

	
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public DataSource getDataSource() {
		return dataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public Circle getCircle(int circleId) {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from circle where id =?");
			ps.setInt(1, circleId);

			Circle circle = null;
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				circle = new Circle(circleId, rs.getString("name"));
			}

			rs.close();
			ps.close();

			return circle;

		} catch (Exception e) {
			//throw new RuntimeException(e);
			System.out.println("Exception in catch 1");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;

	}
	
	public List getCircleCount(){
		String sql = "Select * from circle";
		//jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.queryForList(sql);
	}	
	
	public String getCircleName(int circleId){
		String sql = "Select name from circle where id = ?";
		//jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate.queryForObject(sql, new Object[] {circleId}, String.class);
	}
	
	public Circle getCircleForId(int circleId){
		String sql = "Select * from circle where id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] {circleId}, new CircleMapper());

		
	}
	private static final class CircleMapper implements RowMapper<Circle> {

		@Override
		public Circle mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Circle circle = new Circle();
			circle.setId(resultSet.getInt("ID"));
			circle.setName(resultSet.getString("NAME"));
			return circle;
		}
	}
	
	public void insertCircle(Circle circle){
		String sql = "Insert into circle (id, name) values (:id, :name)";
		SqlParameterSource namedParameters = new MapSqlParameterSource("id", circle.getId())
																.addValue("name", circle.getName());
		namedParameterJdbcTemplate.update(sql, namedParameters);
	}
	
}
