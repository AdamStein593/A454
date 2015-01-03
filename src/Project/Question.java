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
        
        public Question(List <JTextField> fields,JComboBox valueToCalculateComboBox){
            valueToCalculate= valueToCalculateComboBox.getSelectedItem().toString();
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
        
}
