package stepDefinations;

import java.io.IOException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Base;

public class Hooks extends Base {

	@Before
	public void InitialiseBrower() throws IOException {
		driver = initialiseDriver();
		driver.get(enterBrowerUrl());
	}

	@After
	public void CloseBrower() throws IOException {

		driver.close();
	}

}
