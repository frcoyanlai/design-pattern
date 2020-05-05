package behavioral.state.inter;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 09:56
 **/
public interface State {
    /**
     * 投入 25 分钱
     */
    void insertQuarter();

    /**
     * 退回 25 分钱
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     */
    void turnCrank();

    /**
     * 发放糖果
     */
    void dispense();
}
