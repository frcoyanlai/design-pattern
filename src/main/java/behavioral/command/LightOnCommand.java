package behavioral.command;

import behavioral.command.inter.Command;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-04 14:22
 **/
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
