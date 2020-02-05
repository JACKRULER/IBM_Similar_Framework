package common;

import java.io.InputStream;
import java.util.Properties;

public class ReadProp 
{
	
	String value;
	
	public String getValue(String fileName, String key)
	{
		try 
		{
		Properties props=new Properties();
		System.out.println(fileName+"\n"+key);
		InputStream StreamIn=getClass().getResourceAsStream(fileName);
		
			props.load(StreamIn);
			value=props.getProperty(key);
		} 
		catch (Exception e)  
		{
			// TODO Auto-generated catch block
			System.out.println("Exception in reading property \n"+e);
		}
		
		return value;
	}
public static void main(String arg[])
{
	//String filePath=System.getProperty("user.dir");
	ReadProp rp=new ReadProp();
	String fileP="data.properties";
String value1=rp.getValue(fileP, "url");
	System.out.println(value1);
}

}
