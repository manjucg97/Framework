package api_script;

import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;

public class Scrip1 {

	public static void main(String[] args) 
	{
	  CountryInfoService s=new CountryInfoService();
	  CountryInfoServiceSoapType a = s.getCountryInfoServiceSoap();
	  String capital = a.capitalCity("CN");
			  System.out.println(capital);

	}

}
