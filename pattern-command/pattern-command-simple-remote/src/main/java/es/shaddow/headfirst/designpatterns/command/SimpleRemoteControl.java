package es.shaddow.headfirst.designpatterns.command;

public class SimpleRemoteControl {
	Command slot;

	public SimpleRemoteControl() {
		super();
	}

	public void setCommand(Command command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}

}
