package behavioral.memento;

import behavioral.memento.inter.PreviousCalculationToCareTaker;
import behavioral.memento.inter.PreviousCalculationToOriginator;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 09:43
 **/
public class PreviousCalculationImp implements PreviousCalculationToCareTaker,
        PreviousCalculationToOriginator {
    private int firstNumber;
    private int secondNumber;

    public PreviousCalculationImp(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public int getFirstNumber() {
        return firstNumber;
    }

    @Override
    public int getSecondNumber() {
        return secondNumber;
    }
}
