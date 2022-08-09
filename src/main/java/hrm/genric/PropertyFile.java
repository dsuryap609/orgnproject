package hrm.genric;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile
{
public String getpropertyData(String key) throws Exception 
{
Properties p=new Properties();	
FileInputStream fis=new FileInputStream(AutoConstastant.propertyfilePath); ///property path
p.load(fis);
return p.getProperty(key);
}
}
