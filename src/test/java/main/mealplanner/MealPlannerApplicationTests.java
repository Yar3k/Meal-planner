package main.mealplanner;

import main.mealplanner.config.BMICalculus;
import main.mealplanner.model.BMI;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MealPlannerApplicationTests {
	BMICalculus calculate;
	BMI bmi;
	@BeforeEach
	void setUp() {
		calculate = new BMICalculus();
	}

	@Test
	void testBMI1() {
		bmi = new BMI(100,200);
		calculate.Calculate(bmi);
		assertEquals(25,bmi.getResult());
		assertEquals("normal",bmi.getStatus());
	}

	@Test
	void testBMI2() {
		bmi = new BMI(0,0);
		calculate.Calculate(bmi);
		assertEquals(0,bmi.getResult());
		assertEquals("obese",bmi.getStatus());
	}

	@AfterEach
	void tearDown() {

	}
}
