package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	Properties property;
	
	public ReadConfig()
	{
		
		//Configuration\config.properties
		//./Configuration/config.properties
		File src=new File("./src/test/resources/Configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			property=new Properties();
			property.load(fis);
		}catch(Exception e){
			System.out.println("Exception is"+ e.getMessage());
		}
	}
	
	public String eNPS_url()
	{
		String url=property.getProperty("enpsUrl");
		return url;
	}

	public String gdsMaker()
	{
		String gdsurl=property.getProperty("gds_maker");
		return gdsurl;
	}
	
	
	public String gdsCheckr()
	{
		String gdscheckerurl=property.getProperty("gds_checker");
		return gdscheckerurl;
	}
	
	public String filePosting()
	{
		String filePostin_url=property.getProperty("gdsfilePosting");
		return filePostin_url;
	}
	
	
	public String gds_regUrl()
	{
		String gds_url=property.getProperty("gds_reg");
		return gds_url;
	}
	
	
	
	// CRATire-2 Activation 
	public String cra_Regration()
	{
		return property.getProperty("Tire-2");
	}
	
	
	
	// enps _ Tire 2 Activation 
	public String enps_ur()
	{
		String enps_url=property.getProperty("enps");
		return enps_url;
	}
	
	public String cra_Modification()
	{
		String enps_url=property.getProperty("CRA_modification");
		return enps_url;
	}
	
	
	
	public String enps_withoutcapch()
	{
		String enps_url=property.getProperty("withoutcaptcha");
		return enps_url;
	}
	
	
	// Nps scan
	public String npscan()
	{
		return property.getProperty("npscan");
	}
	
	public String drvturl()
	{
		return property.getProperty("withoutcaptcha");
	}
	
	public String cra_lite()
	{
		return property.getProperty("cra_lite");
	}
}
