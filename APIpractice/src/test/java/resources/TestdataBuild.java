package resources;

import pojo.login;

public class TestdataBuild {
	
	public login Loginpayload()
	{
		login l=new login();
		l.setUserEmail("dangeti.vivekanand@jai-kisan.com");
		l.setUserPassword("Vivek@1995");
		return l;
	}
}
