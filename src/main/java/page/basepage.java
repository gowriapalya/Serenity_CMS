package page;

import net.serenitybdd.core.pages.PageObject;

public class basepage extends PageObject{
	
	locaters l;
	
	public void login(String username,String password)
	{
		waitFor(l.username).$(l.username).type(username);
		waitFor(l.password).$(l.password).typeAndEnter(password);
		
	}
	
	public void selectproject()
	
	{
		waitFor(l.Selectproject).$(l.Selectproject).click();
	}
	

}
