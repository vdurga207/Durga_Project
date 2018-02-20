package cucutestscripts;

import Businessfunctions.Login;
import LIB.Commonn;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddempCucu {
Commonn x=new Commonn();
Login l =new Login(x); 
	public String Fn="kk";
	public String Ln="pp";
	public String ae;
	@Given("^login$")
	public void log() throws Exception
	{
		l.setUp();
		l.loginToapp();
	}
	@When("^add emp$")
	
	public void addemp() throws Exception
	{
	
		l.addEmp("QA", "PLANET");
		
	}
	@And("^verify amp$")
	public void verifyEmpList()throws Exception
	{
		l.verifyItemInEmpList("QA", "PLANET");
	}
	
	@And("^editemp$")
	public  void editemp() throws Exception
	{
		l.editEmployee("po", "lo");
	}
	@And("^verfy amp$")
	public void verifyEpList()throws Exception
	{
		l.verifyItemInEmpList("po", "lo");
	}
	
	@Then("^clck on logt$")
	public void logout()
	{
		l.logout();
		l.clos();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
