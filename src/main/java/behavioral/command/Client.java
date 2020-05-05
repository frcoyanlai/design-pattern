package behavioral.command;

import behavioral.command.inter.Command;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-04 14:23
 *
 * 将命令封装成对象中，具有以下作用：
 *
 * 使用命令来参数化其它对象
 * 将命令放入队列中进行排队
 * 将命令的操作记录到日志中
 * 支持可撤销的操作
 *
 * Class Diagram
 * Command：命令
 * Receiver：命令接收者，也就是命令真正的执行者
 * Invoker：通过它来调用命令
 * Client：可以设置命令与命令的接收者
 *
 *
 **/
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        invoker.setOnCommand(lightOnCommand, 0);
        invoker.setOffCommand(lightOffCommand, 0);
        invoker.onButtonWasPushed(0);
        invoker.offButtonWasPushed(0);
    }

}
