package nof.utilitys.constants;

public abstract interface AiAbout 
{
	public String aboutTitle = "NOF...About..";
	public String aboutTitleIcon = "/icons/star.jpg";
	public String aboutIcon = "/icons/yamon.jpg";
	public String aboutName = "Nof";
	public String aboutVersion = "1.1.1";
	public String aboutLicense = "MIT License";
	public String aboutPoweredBy = "Java 8  (1.8)";
	public String aboutDeveloped = "Kessler Yaron";
	public String aboutQA = "jron, shalom, noam";
	
	public default String getAllFields()
	{
		return		aboutTitle + " , " 
				  + aboutTitleIcon + " , " 
				  + aboutIcon + " , " 
				  + aboutName + " , " 
				  + aboutVersion + " , " 
				  + aboutLicense + " , "  
				  + aboutPoweredBy + " , "  
				  + aboutDeveloped + " , "   
				  + aboutQA + " , "
				  ;	
	}
	
}
