package pushpaMovieDetails;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.GenericUtilities.BaseClass;
import com.GenericUtilities.ExcelUtility;
import com.GenericUtilities.FileUtility;
import com.GenericUtilities.WebDriverUtility;
import com.ObjectRepository.FindIMDBPage;
import com.ObjectRepository.IMDBHomePage;
import com.ObjectRepository.PushpaMoviePage;
import com.ObjectRepository.WIKIHomePage;

public class pushpaMovieDateAndCountryTest extends BaseClass{
	@Test

	public void PushpaMovieDateAndCountryTest() {
		
		WebDriverUtility wLib=new WebDriverUtility();
		ExcelUtility elib=new ExcelUtility();
		FileUtility flib=new FileUtility();
		String movieName = elib.readDataFromExcel("pushpa", 1, 0); 
		String url = elib.readDataFromExcel("pushpa", 1, 1);
		String subURL = flib.getPropertKeyValue("subURL");
		
		
		IMDBHomePage imdb=new IMDBHomePage(driver);
		imdb.getSearchTextField().sendKeys(movieName);
		imdb.getSearchBtn().click();
		
		FindIMDBPage imdbPage=new FindIMDBPage(driver);
		imdbPage.getMovieName().click();
		
		wLib.scrollBarAction(driver);
		
		PushpaMoviePage moviepage=new PushpaMoviePage(driver);
		moviepage.movieDateAndCountry();
		String country_1 = moviepage.getMovieCountry().getText();
		String date_1 = moviepage.getMovieDate().getText();
		
		wLib.forwardToNextPage(driver, subURL);
		
		WIKIHomePage wiki=new WIKIHomePage(driver);
		wiki.getSearchTextField().sendKeys(movieName);
		wiki.getSearchBtn().click();
		wiki.movieDateAndCountry();
		
		String country = wiki.getMovieCountry().getText();
		String date = wiki.getMovieDate().getText();
		
		//Validation
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(country, country_1);
		Reporter.log("Country name test is pass", true);
		soft.assertAll();
		
		soft.assertEquals(date_1, date);
		soft.assertAll();		
		
	}

}
