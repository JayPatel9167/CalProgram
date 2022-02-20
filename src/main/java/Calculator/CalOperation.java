/**
 * 
 */
package Calculator;

/**
 * @author Jay Patel
 *
 */
public class CalOperation {
	private double firstNum, secondNum;
	
	CalOperation(double firstNum,double secondNum){
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
	
	double addNum() {
		return firstNum + secondNum;
	}
	double subNum() {
		return firstNum - secondNum;
	}
	double multiNum() {
		return firstNum * secondNum;
	}
	double divNum() {
		return firstNum / secondNum;
	}
	//@Override
    //public String toString() {
        //return "Result:";
    //}
}
