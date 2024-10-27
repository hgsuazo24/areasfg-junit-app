package hn.proyprimerparcial.areasfg_junit_app;

import org.junit.BeforeClass;


import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
   
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	
	  private static App calcularareas;
	  
	  @BeforeClass
	  public static void setUpClass() {
		  calcularareas=new App();	  	  
	  }
	  
	  
	  
	  @Test       
	  public void arearectangulop1(){
		  	  double base=-5;
		  	  double altura=7;
		  	  Double area=calcularareas.arecta(base,altura);		  	  
		  	  if(base<=0 || altura <= 0) {
		  		System.out.print("Base y altura deben ser mayores a cero");
		  		}
			   else {
				   assertEquals(base*altura,area,0.001);
			   }
	  }
	  
	  @Test
	  public void arearectangulop2(){
		  	  double base=0.005;
		  	  double altura=0.007;
		  	  double area=calcularareas.arecta(base,altura);
		  	  assertTrue(base*altura==area);
	  }
	  
	  @Test
	  public void arearectangulop3(){
	  	  double base=0.005;
	  	  double altura=0.007;
	  	  double area=calcularareas.arecta(base,altura);
	  	  assertEquals(base*altura,area,0.001);
  }
	  
	  @Test
	  public void areatriangulop1(){
		  	  double base=-15;
		  	  double altura=2;
		  	  Double area=calcularareas.atri(base,altura);		      
		  	   
		  	  if(base<=0 || altura <= 0) {
			  		System.out.print("Base y altura deben ser mayores a cero");
			  		}
				   else {
					   assertEquals((base*altura)/2,area,0.001);
				   }
	  }
	  
	  @Test
	  public void areatriangulop2(){
		  	  double base=0.15;
		  	  double altura=0.2;
		  	  Double area=calcularareas.atri(base,altura);		      
		  	 assertTrue((base*altura/2)==area);
	  }
	  
	  @Test
	  public void areatriangulop3(){
		  	  double base=15;
		  	  double altura=2;
		  	  Double area=calcularareas.atri(base,altura);		      
		  	   assertEquals((base*altura)/2,area,0.001);
	  }
	  
	 	  
	  @Test
	  public void areacuadradop1(){
		  	  double lado=3;
		  	  
		  	  double area=calcularareas.acuadra(lado);
		  	  
		  	  if(lado<=0) {
			  		System.out.print("Medida de lado debe ser mayor a cero");
			  		}
				   else {
					   assertEquals((lado*lado),area,0.001);
				   }
		  	  
	  }
	  
	  @Test
	  public void areacuadradop2(){
		  	  double lado=-3;
		  	  
		  	  double area=calcularareas.acuadra(lado);
		  	  assertEquals((lado*lado),area,0.001);
	  }
	  
	  @Test
	  public void areacuadradop3(){
		  	  double lado=0.03;
		  	  
		  	  double area=calcularareas.acuadra(lado);
		  	  assertEquals((lado*lado),area,0.001);
		  	  
	  }


	  @Test
	  public void areacirculop1(){
		  	  double pi=3.14;
		  	  double radio=2.00;
		  	  double area=calcularareas.acircu(pi,radio);
		  	  
		  	  if(radio<=0) {
			  		System.out.print("Medida de radio debe ser mayor a cero");
			  		}
				   else {
					   assertEquals((pi*radio*radio),area,0.001);
				   }
	  }
	  @Test
	  public void areacirculop2(){
		  	  double pi=3.14;
		  	  double radio=20;
		  	  double area=calcularareas.acircu(pi,radio);
		  	  assertEquals((pi*radio*radio),area,0.001);
	  }
	  @Test
	  public void areacirculop3(){
		  	  double pi=3.14;
		  	  double radio=0.00003;
		  	  double area=calcularareas.acircu(pi,radio);
		  	  assertEquals((pi*radio*radio),area,0.001);
	  }
   
    
}
