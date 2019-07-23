package PageObjectNew.Reddif;



public class HomePage<WebDriver> {
	
	WebDriver driver;
	public void Homepage (WebDriver driver) {
		
		this.driver=driver;
		
}
	
	@FindBY
	@Findby (xpath= "//*[@id=\"signin_info\"]/a[1]");
	WebDriver Signin;
	
	

}
