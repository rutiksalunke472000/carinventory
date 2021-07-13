package com.hcl.Car;

import org.springframework.jdbc.core.JdbcTemplate;

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

	public int listCar(Car c) {
		String query = "select * from car";
		return jdbcTemplate.getFetchSize();
	}

}
