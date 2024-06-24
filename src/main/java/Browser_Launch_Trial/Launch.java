package Browser_Launch_Trial;

import BaseClass.Base;

public class Launch extends Base
{
	public static void main(String[] args) 
	{
		Base b = new Base();
		b.initilization();
		driver.get("https://172.22.1.83/CRA/HomePage_hp.do");
		
	} 

}
