package job_project;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TCS {

	public static void main(String[] args) throws ParseException {
		
		dateMatch();
		
	}
	
	public static void dateMatch() throws ParseException {
		
		
	String dateValue= "19/09/2023";	
//	String d= dateValue.subSequence(0, 10);
	
   DateFormat df  =  new SimpleDateFormat("dd/MM/yyyy");
  Date l= df.parse(dateValue);
  System.out.println(l);
  //This is not
       
		

	}

}
