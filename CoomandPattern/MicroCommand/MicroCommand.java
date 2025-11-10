public class MicroCommand implements Command {
    Command  [] command;

    public MicroCommand(Command[] command) {
        this.command = command;
    }

    @Override
    public void execute() {
        for(int i=0 ;  i<command.length ; i++){
            command[i].execute();
        }

    }

    @Override
    public void undo() {
        for(int i=0 ;  i<command.length ; i++){
            command[i].undo();
        }

    }
}
