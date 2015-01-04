/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author Adam
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;


public class Question {
        private double mass;
        private double force;
        private double acceleration;
        private double fc;
        private double angle;
        private double frictionForce;
        private double reaction;
        private double weight; 
        private String valueToCalculate;
        private String slippingDirection;
        
        public Question(List <JTextField> fields,JComboBox valueToCalculateComboBox,JRadioButton upButton, JRadioButton downButton){
            valueToCalculate= valueToCalculateComboBox.getSelectedItem().toString();
            if (upButton.isSelected()==true){slippingDirection ="up";}
            else{slippingDirection="down";}
            switch(valueToCalculate){
                case "Mass":fields.get(0).setText("0");break;
                case "Force":fields.get(1).setText("0");break;
                case "Acceleration":fields.get(2).setText("0");break;
                case "µ":fields.get(3).setText("0");break;
                case "θ":fields.get(4).setText("0");break;
                case "Friction ForceFriction Force":fields.get(5).setText("0");break;
                case "Reaction":fields.get(6).setText("0");break;
                case "Weight":fields.get(7).setText("0");break;
            }
            
            mass=Double.parseDouble(fields.get(0).getText());
            force=Double.parseDouble(fields.get(1).getText());
            acceleration=Double.parseDouble(fields.get(2).getText());
            fc=Double.parseDouble(fields.get(3).getText());
            angle=Double.parseDouble(fields.get(4).getText());
            frictionForce=Double.parseDouble(fields.get(5).getText());
            reaction=Double.parseDouble(fields.get(6).getText());
            weight=Double.parseDouble(fields.get(7).getText());
        }
        
        public Answer solve(){
            Answer answer;
            switch(valueToCalculate){
                case "Mass":answer=calcM();break;
                case "Force":answer=calcF();break;
                case "Acceleration":answer=calcA();break;
                case "µ":answer=calcFC();break;
                case "θ":answer=calcAng();break;
                case "Friction ForceFriction Force":answer=calcFF();break;
                case "Reaction":answer=calcR();break;
                default:answer=calcW();break;
            }
            return answer;
        }
        
        public Answer calcM(){
            mass = weight/9.8;
            String step1 = weight+ "/ 9.8 = "+mass;  
            String explainStep1 = "Weight /9.8 = Mass";
            String step2="";
            String explainStep2="";
            
            return new Answer(step1,step2,explainStep1,explainStep2, mass);

        }
        
        public Answer calcF(){
            if (slippingDirection .equals("up")){	
                force = (acceleration*mass)- (weight*Math.sin(Math.toRadians(angle)))-frictionForce; 
                String step1 = acceleration + "*" + mass+ " = "+ acceleration*mass;
                String explainStep1 = "acceleration*mass = resultant force";
                String step2 = acceleration*mass + " – "+ weight + "*sin" +angle + " – "+ frictionForce+ " = "+ force;
                String explainStep2 = "resultant force - weight*sinθ – friction force = force";
                
                return new Answer(step1,step2,explainStep1,explainStep2, force);
            }
            else{
                force = (weight*Math.sin(Math.toRadians(angle)))- (acceleration*mass)- frictionForce;
                String step1 = acceleration + "*" + mass+ " = "+ acceleration*mass;
                String explainStep1 = "acceleration*mass = resultant force";
                String step2 = weight + "*sin" +angle + " – "+  acceleration*mass + " – "+ frictionForce+ " = "+force;
                String explainStep2 = "weight*sinθ – resulatnt force– friction force = force";
                return new Answer(step1,step2,explainStep1,explainStep2, force);
            }

        }
        
        public Answer calcA(){
            if (slippingDirection .equals("up")){
                acceleration = (force-frictionForce-weight*Math.sin(Math.toRadians(angle)))/mass;
                String step1 = force+ " – " +frictionForce+ " – "+weight  + "* sin"+angle + " = "+  (force-frictionForce -weight*Math.sin(Math.toRadians(angle)));
                String explainStep1 = "force – friction force – weight * sinθ = resultant force";
                String step2 = (force -weight*Math.sin(Math.toRadians(angle)) - frictionForce)+ "/" + mass + " = " + acceleration;
                String explainStep2 = "resultant force / mass = acceleration";
                return new Answer(step1,step2,explainStep1,explainStep2, acceleration);
            }
            else{
                acceleration = (weight*Math.sin(Math.toRadians(angle))- force-frictionForce)/mass;
                String step1 = weight  + "* sin"+angle + " – " +frictionForce+ " – "+ force + " = "+  (weight*Math.sin(Math.toRadians(angle))- force-frictionForce);
                String explainStep1 = "weight * sinθ – friction force – force = resultant force";
                String step2 = (weight*Math.sin(Math.toRadians(angle))- force-frictionForce)+ "/" + mass + " = "+ acceleration;
                String explainStep2 = "resultant force / mass = acceleration";
                return new Answer(step1,step2,explainStep1,explainStep2, acceleration);
            }
        }
        
}
