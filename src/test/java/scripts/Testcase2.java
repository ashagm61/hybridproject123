package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;
import genericLibrary.BaseClass;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass {
	@Test
	
	public void tc2() throws IOException, InterruptedException  {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		
		utilities.switchingtabs(driver);
		
		//Thread.sleep(2000);
		utilities.dropDown(sd.getCoursedd(), pdata.getPropertydata("coursedd"));

		
		TestingPage tp=new TestingPage(driver);
		
		utilities.dragdrop(driver, tp.getSeleniumtraining(),tp.getCarttab());
		
		//Thread.sleep(5000);
		Point loc =tp.getFacebook().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		utilities.scrollBar(driver, x, y);
		tp.facebookicon();
		
		
		
	}

	

}
