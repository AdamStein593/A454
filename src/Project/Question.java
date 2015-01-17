package Project;

/**
 *An object containing all the details from the text fields on the input screen
 * @author Adam
 */
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;


public class Question {
        //decleration of global variables
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
            //constructor
            valueToCalculate= valueToCalculateComboBox.getSelectedItem().toString();
            if (upButton.isSelected()==true){slippingDirection ="up";}
            else{slippingDirection="down";}
            //value to calculate field set to 0 to prevent error when converting every field to a double
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
            
            //converting String values of text fields into doubles
            mass=Double.parseDouble(fields.get(0).getText());
            force=Double.parseDouble(fields.get(1).getText());
            acceleration=Double.parseDouble(fields.get(2).getText());
            fc=Double.parseDouble(fields.get(3).getText());
            angle=Double.parseDouble(fields.get(4).getText());
            frictionForce=Double.parseDouble(fields.get(5).getText());
            reaction=Double.parseDouble(fields.get(6).getText());
            weight=Double.parseDouble(fields.get(7).getText());
        }
        
        /**
         * Function to solve a question object and return an Answer object
         * @return an Answer that will be used in the display on the working out screen
         */
        public Answer solve(){
            Answer answer;
            //Function called depends on value to valueToCalculate
            switch(valueToCalculate){
                case "Mass":answer=calcM();break;
                case "Force":answer=calcF();break;
                case "Acceleration":answer=calcA();break;
                case "µ":answer=calcFC();break;
                case "θ":answer=calcAng();break;
                case "Friction ForceFriction Force":answer=calcFF();break;
                case "Reaction":answer=calcR();break;
                //default ncessary to ensure an answer is always returned
                default:answer=calcW();break;
            }
            return answer;
        }
        /**
         * Function to calculate Mass using the weight
         * @return an answer object with a value for mass and information on working out
         */
        public Answer calcM(){
            mass = weight/9.8;
            String step1 = weight+ "/ 9.8 = "+mass;  
            String explainStep1 = "Weight /9.8 = Mass";
            String step2="";
            String explainStep2="";
            
            return new Answer(step1,step2,explainStep1,explainStep2, mass);

        }
        
        /**
         * Function to calculate Force from mass, acceleration, angle, friction force and weight
         * @return an answer object with a value for mass and information on working out
         */
        public Answer calcF(){
            if (slippingDirection .equals("up")){	
                force = (acceleration*mass)- ((double)Math.round(weight*Math.sin(Math.toRadians(angle))*10)/10)-frictionForce; 
                String step1 = acceleration + "*" + mass+ " = "+ acceleration*mass;
                String explainStep1 = "acceleration*mass = resultant force";
                String step2 = acceleration*mass + " – "+ weight + "*sin(" +angle + ") – "+ frictionForce+ " = "+ force;
                String explainStep2 = "resultant force - weight*sinθ – friction force = force";
                
                return new Answer(step1,step2,explainStep1,explainStep2, force);
            }
            else{
                
                force = ((double)Math.round(weight*Math.sin(Math.toRadians(angle))*10)/10)- (acceleration*mass)- frictionForce;
                String step1 = acceleration + "*" + mass+ " = "+ acceleration*mass;
                String explainStep1 = "acceleration*mass = resultant force";
                String step2 = weight + "*sin(" +angle + ") – "+  acceleration*mass + " – "+ frictionForce+ " = "+force;
                String explainStep2 = "weight*sinθ – resulatnt force– friction force = force";
                return new Answer(step1,step2,explainStep1,explainStep2, force);
            }

        }
        /**
         * Function to calculate Acceleration from mass, force, angle, friction force and weight
         * @return an answer object with a value for mass and information on working out
         */
        public Answer calcA(){
            if (slippingDirection .equals("up")){
                acceleration = (force-frictionForce-(double)Math.round(weight*Math.sin(Math.toRadians(angle))*10)/10)/mass;
                String step1 = force+ " – " +frictionForce+ " – "+weight  + "*sin("+angle + ") = "+  (double)Math.round((force-frictionForce -weight*Math.sin(Math.toRadians(angle)))*10)/10;
                String explainStep1 = "force – friction force – weight * sinθ = resultant force";
                String step2 = (double)Math.round((force -weight*Math.sin(Math.toRadians(angle)) - frictionForce)*10)/10+ "/" + mass + " = " + acceleration;
                String explainStep2 = "resultant force / mass = acceleration";
                return new Answer(step1,step2,explainStep1,explainStep2, acceleration);
            }
            else{
                acceleration = ((double)Math.round(weight*Math.sin(Math.toRadians(angle))*10)/10- force-frictionForce)/mass;
                String step1 = weight  + "*sin("+angle + ") – " +frictionForce+ " – "+ force + " = "+  (double)Math.round((weight*Math.sin(Math.toRadians(angle))- force-frictionForce)*10)/10;
                String explainStep1 = "weight * sinθ – friction force – force = resultant force";
                String step2 = (double)Math.round((weight*Math.sin(Math.toRadians(angle))- force-frictionForce)*10)/10+ "/" + mass + " = "+ acceleration;
                String explainStep2 = "resultant force / mass = acceleration";
                return new Answer(step1,step2,explainStep1,explainStep2, acceleration);
            }
        }
        /**
         * Function to calculate µ from friction force and reaction
         * @return an answer object with a value for mass and information on working out
         */
        public Answer calcFC(){
            fc = frictionForce/reaction;
            String step1= frictionForce + "/" + reaction+ " = " +fc;
            String explainStep1 =  "friction force/reaction = µ";
            String step2="";
            String explainStep2="";
            return new Answer(step1,step2,explainStep1,explainStep2, fc);
        }
        /**
         * Function to calculate θ from weight and reaction
         * @return an answer object with a value for mass and information on working out
         */
        public Answer calcAng(){
            angle = (double)Math.round(Math.toDegrees(Math.acos(reaction/weight))*10)/10;
            String step1 =  "cos̄¹("+reaction+ "/" + weight+ ") = "+ angle;
            String explainStep1 = "cos̄¹(reaction/weight)= angle";
            String step2="";
            String explainStep2="";
            return new Answer(step1,step2,explainStep1,explainStep2, angle);
        }
        
        /**
         * Function to calculate friction force from µ and reaction
         * @return an answer object with a value for mass and information on working out
         */
        public Answer calcFF(){
            frictionForce = reaction*fc;
            String step1= reaction + "*" + fc +" = "+ frictionForce;
            String explainStep1= "reaction*µ = friction force";
            String step2="";
            String explainStep2="";
            return new Answer(step1,step2,explainStep1,explainStep2, frictionForce);
        }        
        /**
         * Function to calculate reaction from weight and θ
         * @return an answer object with a value for mass and information on working out
         */
        public Answer calcR(){
            reaction = (double)Math.round(weight*Math.cos(Math.toRadians(angle))*10)/10;
            String step1 = weight + "*cos(" + angle + ") = "+ reaction;
            String explainStep1 = "weight*cos(θ) = reaction";
            String step2="";
            String explainStep2="";
            return new Answer(step1,step2,explainStep1,explainStep2, reaction);           
        }
        /**
         * Function to calculate weight from mass
         * @return an answer object with a value for mass and information on working out
         */
        public Answer calcW(){
            weight = mass*9.8;
            String step1 =  mass + "*9.8 = "+ weight;
            String explainStep1 = "mass*9.8 = weight";
            String step2="";
            String explainStep2="";
            return new Answer(step1,step2,explainStep1,explainStep2, weight);
        }
        
        
}
