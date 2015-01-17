/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Adam
 */
public class CalculationTests {
    
    
    String slippingDirection="down";
    double mass= 10;
    double force=0 ;
    double acceleration= 4.9;
    double fc= 0;
    double angle= 30;
    double frictionForce= 0;
    double reaction = 84.9;
    double weight= 98;

    
    public CalculationTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testCalcM(){
              
            mass = weight/9.8;
            String step1 = weight+ "/ 9.8 = "+mass;  
            String explainStep1 = "Weight /9.8 = Mass";
            String step2="";
            String explainStep2="";
            
         assertEquals(mass,10,0.01); 
         assertEquals(step1,"98.0/ 9.8 = 10.0");
    }
    
    @Test
    public void testCalcF(){
        
        if (slippingDirection .equals("up")){	
                    force = (acceleration*mass)- ((double)Math.round(weight*Math.sin(Math.toRadians(angle))*10)/10)-frictionForce; 
                    String step1 = acceleration + "*" + mass+ " = "+ acceleration*mass;
                    String explainStep1 = "acceleration*mass = resultant force";
                    String step2 = acceleration*mass + " – "+ weight + "*sin" +angle + " – "+ frictionForce+ " = "+ force;
                    String explainStep2 = "resultant force - weight*sinθ – friction force = force";
                    
                }
                else{
                    force = ((double)Math.round(weight*Math.sin(Math.toRadians(angle))*10)/10)- (acceleration*mass)- frictionForce;
                    String step1 = acceleration + "*" + mass+ " = "+ acceleration*mass;                   
                    String explainStep1 = "acceleration*mass = resultant force";
                    String step2 = weight + "*sin(" +angle + ") – "+  acceleration*mass + " – "+ frictionForce+ " = "+force;
                    String explainStep2 = "weight*sinθ – resulatnt force– friction force = force";     
                    assertEquals(force,0,0.01); 
                    assertEquals(step1,"4.9*10.0 = 49.0");
                    assertEquals(step2,"98.0*sin(30.0) – 49.0 – 0.0 = 0.0");
                }   
        
    }
    
    @Test
    public void testCalcA(){
        if (slippingDirection .equals("up")){
                acceleration = (force-frictionForce-(double)Math.round(weight*Math.sin(Math.toRadians(angle))*10)/10)/mass;
                String step1 = force+ " – " +frictionForce+ " – "+weight  + "*sin("+angle + ") = "+  (double)Math.round((force-frictionForce -weight*Math.sin(Math.toRadians(angle)))*10)/10;
                String explainStep1 = "force – friction force – weight * sinθ = resultant force";
                String step2 = (double)Math.round((force -weight*Math.sin(Math.toRadians(angle)) - frictionForce)*10)/10+ "/" + mass + " = " + acceleration;
                String explainStep2 = "resultant force / mass = acceleration";
                
            }
            else{
                acceleration = ((double)Math.round(weight*Math.sin(Math.toRadians(angle))*10)/10- force-frictionForce)/mass;
                String step1 = weight  + "*sin("+angle + ") – " +frictionForce+ " – "+ force + " = "+  (double)Math.round((weight*Math.sin(Math.toRadians(angle))- force-frictionForce)*10)/10;
                String explainStep1 = "weight * sinθ – friction force – force = resultant force";
                String step2 = (double)Math.round((weight*Math.sin(Math.toRadians(angle))- force-frictionForce)*10)/10+ "/" + mass + " = "+ acceleration;
                String explainStep2 = "resultant force / mass = acceleration";
                assertEquals(acceleration,4.9,0.01); 
                assertEquals(step1,"98.0*sin(30.0) – 0.0 – 0.0 = 49.0");
                assertEquals(step2,"49.0/10.0 = 4.9");
                
            }
    }
}