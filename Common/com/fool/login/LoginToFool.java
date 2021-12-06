package com.fool.login;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import com.fool.input.InputCountry;
import com.fool.pageobject.PageObjectModule;

public class LoginToFool extends PageObjectModule {

    @BeforeClass
    //Login for Australia
    public void loginFool() throws Throwable {
        super.browser();
        try {
            super.getUrl(read.readData("Browser&URL", 1, 1));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            super.enterText(read.getObject("Edit_Username"), read.readData("Login", 2, 0));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        
        try {
            super.enterText(read.getObject("Edit_Password"), read.readData("Login", 2, 1));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        
        try {
            super.clickButton(read.getObject("Button_Login"));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }

    }

    //Login for Canada
    public void loginCanada() {

        super.browser();
        try {
            super.getUrl(read.readData("Browser&URL", 3, 1));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            super.enterText(read.getObject("Edit_Username"), read.readData("Login", 5, 0));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        
        try {
            super.enterText(read.getObject("Edit_Password"), read.readData("Login", 5, 1));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        try {
            super.clickButton(read.getObject("Button_Login"));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }

    }
    public void loginPreau() {

        super.browser();
        try {
            super.getUrl(read.readData("Browser&URL", 4, 1));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
        	super.enterText(read.getObject("Edit_Username"), read.readData("Login", 2, 0));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        
        try {
        	super.enterText(read.getObject("Edit_Password"), read.readData("Login", 2, 1));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        
        try {
            super.clickButton(read.getObject("Button_Login"));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }

    }
    
    public void loginHiddengem() {

        super.browser();
        try {
            super.getUrl(read.readData("Browser&URL", 6, 1));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            super.enterText(read.getObject("Edit_Username"), read.readData("Login", 2, 0));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        
        try {
            super.enterText(read.getObject("Edit_Password"), read.readData("Login", 2, 1));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
        
        try {
            super.clickButton(read.getObject("Button_Login"));
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            Assert.assertFalse(true);
        }
    }
    
        public void loginProau() {

            super.browser();
            try {
                super.getUrl(read.readData("Browser&URL", 7, 1));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            try {
                super.enterText(read.getObject("Edit_Username"), read.readData("Login", 2, 0));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
            }
            
            try {
                super.enterText(read.getObject("Edit_Password"), read.readData("Login", 2, 1));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
            }
            
            try {
                super.clickButton(read.getObject("Button_Login"));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
            }
    }
        
        public void loginCAStAdv() {

            super.browser();
            try {
                super.getUrl(read.readData("Browser&URL", 9, 1));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            try {
                super.enterText(read.getObject("Edit_Username"), read.readData("Login", 5, 0));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
            }
            try {
                super.enterText(read.getObject("Edit_Password"), read.readData("Login", 5, 1));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
            }
            
            try {
                super.clickButton(read.getObject("Button_Login"));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
            } 
    }
        public void loginCAStAdv1() {

          /*  super.browser();
            try {
                super.getUrl(read.readData("Browser&URL", 9, 2));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }*/

            try {
                super.enterText(read.getObject("Edit_Username"), read.readData("Login", 5, 0));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
            }
            try {
                super.enterText(read.getObject("Edit_Password"), read.readData("Login", 5, 1));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
            }
            
            try {
                super.clickButton(read.getObject("Button_Login"));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
            } 
    }        
        public void loginSG() {

            super.browser();
            try {
                super.getUrl(read.readData("Browser&URL", 8, 1));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            try {
                super.enterText(read.getObject("Edit_Username"), read.readData("Login", 1, 0));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
            }
            
            try {
                super.enterText(read.getObject("Edit_Password"), read.readData("Login", 1, 1));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
            }
            try {
                super.clickButton(read.getObject("Button_Login"));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
            }
    }
        public void loginUK() {

            super.browser();
            try {
                super.getUrl(read.readData("Browser&URL", 29, 1));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            try {
                super.enterText(read.getObject("Edit_Username"), read.readData("Login", 1, 0));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
            }
            
            try {
                super.enterText(read.getObject("Edit_Password"), read.readData("Login", 1, 1));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
            }
            try {
                super.clickButton(read.getObject("Button_Login"));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
            }
    }
        public void loginUSAct() {

            super.browser();
            try {
                super.getUrl(read.readData("Browser&URL", 37, 1));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            try {            	
                super.enterText(read.getObject("Username_US1"), read.readData("Login", 8, 0));                
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
            }
            
            try {
              enterText(read.getObject("Userpass_US1"), read.readData("Login", 8, 1));
          //      super.clickButton(read.getObject("ChkUs_Rem"));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
                
            }
            try {
                super.clickButton(read.getObject("Button_LoginUS"));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
            }
    }
        public void loginUSIQ() {

            super.browser();
            try {
                super.getUrl(read.readData("Browser&URL", 32, 1));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            try {
                super.enterText(read.getObject("Username_US"), read.readData("Login", 8, 0));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
            }
            
            try {
                super.enterText(read.getObject("Userpass_US"), read.readData("Login", 8, 1));
               // super.clickButton(read.getObject("ChkUs_Rem"));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
                
            }
            try {
                super.clickButton(read.getObject("Button_LoginUS"));
            } catch (Throwable e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                Assert.assertFalse(true);
            }
    }
}