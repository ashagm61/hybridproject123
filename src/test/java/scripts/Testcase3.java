package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.CorejavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WishlistPage;

public class Testcase3 extends BaseClass {
	@Test
	
	public void tc3() throws InterruptedException, IOException  {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.searchTextbox(pdata.getPropertydata("coursedata"));
		s.gobutton();
		
		CorejavaPage c=new CorejavaPage(driver);
		c.seleniumtraining();
		
		WishlistPage w=new WishlistPage(driver);
		utilities.switchFrame(driver);
		
		Thread.sleep(5000);
		
		w.playbtntb();
		
		Thread.sleep(5000);
		w.pausebtntb();
		
		utilities.switchbackframe(driver);
		
		w.addtowishlistbtn();
}	

}
