package behavioral.memento.inter;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 09:41
 **/
public interface Calculator {
    // Create Memento
    PreviousCalculationToCareTaker backupLastCalculation();

    // setMemento
    void restorePreviousCalculation(PreviousCalculationToCareTaker memento);

    int getCalculationResult();

    void setFirstNumber(int firstNumber);

    void setSecondNumber(int secondNumber);
}
