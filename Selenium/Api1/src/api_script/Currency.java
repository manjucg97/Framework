package api_script;

import org.oorsprong.websamples.ArrayOftCountryCodeAndName;
import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;

public class Currency {

	public static void main(String[] args) 
	{
      CountryInfoService c=new CountryInfoService();
      CountryInfoServiceSoapType a = c.getCountryInfoServiceSoap();
      ArrayOftCountryCodeAndName currency = a.countriesUsingCurrency("IN");
      System.out.println(currency);
	}

}
