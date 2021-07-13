package com.hcl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hcl.model.Car;

public class CarDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int addCar(Car c) {
		String query = "insert into car (carid,make,model,years,salesprice) values('" + c.getCarID() + "','"
				+ c.getMake() + "','" + c.getModel() + "','" + c.getYears() + "','" + c.getSalesPrice() + "')";
		return jdbcTemplate.update(query);
	}

	public int updateCar(Car c) {
		String query = "update car set make='" + c.getMake() + "',model='" + c.getModel() + "',years='" + c.getYears()
				+ "',salesprice='" + c.getSalesPrice() + "' where carid='" + c.getCarID() + "'";
		return jdbcTemplate.update(query);
	}

	public int deleteCar(Car c) {
		String query = "delete from car where carid='" + c.getCarID() + "' ";
		return jdbcTemplate.update(query);

	}

	/*public List<Car>getAllData(){
		return jdbcTemplate.query("select * from car",new RowMapper<Car>(){
			public Car mapRow(ResultSet rs,int numRow)throws SQLException{
				Car cc=new Car();
				cc.setCarID(rs.getInt(1));
				cc.setMake(rs.getString(2));
				cc.setModel(rs.getString(3));
				cc.setYears(rs.getInt(4));
				cc.setSalesPrice(rs.getDouble(5));
				return cc;

			}
		}
	}*/

}
