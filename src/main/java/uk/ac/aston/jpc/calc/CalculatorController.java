package uk.ac.aston.jpc.calc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {
	int result = 0;
	@FXML
	TextField txtOperand;
	@FXML
	Label resultLabel;
	int operand = 0;
    @FXML
    private void plusPressed() {
    	try {
    		operand = Integer.valueOf(txtOperand.getText());
    	}
    	catch(Exception e){
    		operand = 0;
    	}
    	finally {
	    	result += operand;
	    	txtOperand.setText(Integer.toString(result) + "");
    	}

    	
    }
    @FXML
    private void minusPressed() {
    	try {
    		operand = Integer.valueOf(txtOperand.getText());
    	}
    	catch(Exception e){
    		operand = 0;
    	}
    	finally {
	    	result -= operand;
	    	txtOperand.setText(result + "");
    	}

    }
    @FXML
    private void timesPressed() {
    	try {
    		operand = Integer.valueOf(txtOperand.getText());
    	}
    	catch(Exception e){
    		operand = 0;
    	}
    	finally {
	    	result *= operand;
	    	txtOperand.setText(result + "");
    	}

    }
    @FXML
    private void dividePressed() {
    	try {
    		operand = Integer.valueOf(txtOperand.getText());
    	}
    	catch(Exception e){
    		operand = 0;
    	}
    	finally {
	    	result /= operand;
	    	txtOperand.setText(result + "");
    	}

    }
    @FXML
    private void setPressed() {
    	resultLabel.setText("Result: " + txtOperand.getText());
    }
}
