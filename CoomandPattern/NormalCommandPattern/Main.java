public class Main {
    public static void main(String[] args) {
        Invoker remote = new Invoker();
        Light light = new Light();
        TurnLightOnCommand turnLightOnCommand = new TurnLightOnCommand(light);

        remote.setCommand(turnLightOnCommand);
        remote.buttonPressed();

        turnLightOnCommand.undo();

    }
}
