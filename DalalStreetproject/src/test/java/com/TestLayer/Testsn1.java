package com.TestLayer;

import org.testng.annotations.Test;

import TastBase.SetupM;

public class Testsn1 extends SetupM{
  @Test(enabled=false)
  public void verify_Exchange() throws InterruptedException {
	  Dash.click_on_Exchange();
	  ex.nSE_Simulator_table();
  }
  
  @Test(enabled=false)
  public void verify_User_profile() throws InterruptedException {
	  Dash.user_profile();
	  Dash.on_userprofile();
	 System.out.println(pro.profile_id());
  }
  
  @Test(enabled=false)
  public void verify_logo() throws InterruptedException {
	  Dash.on_logo();
	  
  }
  
  @Test
  public void verify_Buy_Shares() throws InterruptedException {
	  Dash.on_search("sun pharma");
	  Thread.sleep(4);
	  Dash.on_tatamoters();
	  
  }
}
