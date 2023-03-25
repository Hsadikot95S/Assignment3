package DOMParser;

//DTD
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.xml.sax.InputSource;


public class DomParserDTD {
	
	private DomParserDTD() {}
	
	// validate using DOM (DTD as defined in the XML)
	  public static void validateDTD(String xml) 
	  {
	    try {
	      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	      factory.setValidating(true);
	      factory.setNamespaceAware(true);

	      DocumentBuilder builder = factory.newDocumentBuilder();
	      
	      builder.parse(new InputSource(xml));
	      System.out.println("Validation passed.");
	    }
	    catch (Exception e) {
		   // catching all validation exceptions
		   System.out.println(e.toString());
		  }
	  }
	  
	  public static void main (String args[]){ 		   
		   DomParserDTD.validateDTD("./employee.xml");		     
		  }
	  
}
