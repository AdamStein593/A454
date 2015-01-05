/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 *
 * @author Adam
 */
public class Answer {
    private String step1;
    private String step2;
    private String explainStep1;
    private String explainStep2;
    private double result;
    
    public Answer(String step1, String step2, String explainStep1, String explainStep2, double result){
        this.step1=step1;       
        this.step2=step2;
        this.explainStep1=explainStep1;
        this.explainStep2=explainStep2;
        BigDecimal bd = new BigDecimal(result);
        bd = bd.round(new MathContext(2));
        this.result= bd.doubleValue();
        
    }
    
    public String getStep1(){
        return step1;
    }
    public String getStep2(){
        return step2;
    }
    public String getExplainStep1(){
        return explainStep1;
    }
    public String getExplainStep2(){
        return explainStep2;
    }
    public double getResult(){
        return result;
    }
    
    
    
}
