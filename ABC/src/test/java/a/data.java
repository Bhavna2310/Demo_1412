package a;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.Utility.BaseClass;
import Testclass.home;

public class data {
	public class home1 extends BaseClass {
		
		
		
		@Test (dataProvider="login")
		public void verifytest(String username ,String pass) throws EncryptedDocumentException, IOException {
			home hm =new home(driver);
			hm.verifyuser(username);
			hm.verifypassword(pass);
	         hm.button();
	}

		@DataProvider(name= "login")
		public  Object [][]logindata(){
			Object [][]data=new Object[2][2];
			data[0][0]="Admin";
			data[0][1]="admin126";
			
			data[1][0]="Admin";
			data[1][1]="admin123";
			
			//data[2][0]="Admin";
			//data[2][1]="admin123";
			
			return data;
			
		}
	}
}
