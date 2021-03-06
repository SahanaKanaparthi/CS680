package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	private String[] carToStringArray(Car car) {
		String[] carInfo = {car.getMake(), car.getModel(), Integer.toString(car.getYear())};
		return carInfo;
	}
	
	@Test
	void verifyCar() {
		String[] expected = {"Jaguar", "F-pace", "2019"};
		Car actual = new Car("Jaguar", "F-pace", 2019, 20, 50000);
		assertArrayEquals(expected, carToStringArray(actual) );
	}
}
