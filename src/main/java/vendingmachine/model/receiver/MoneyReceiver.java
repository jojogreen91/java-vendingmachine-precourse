package vendingmachine.model.receiver;

import camp.nextstep.edu.missionutils.Console;

public class MoneyReceiver {

	public int receive() {
		String input = "init";

		boolean rewindSwitch = true;
		while (rewindSwitch) {
			input = Console.readLine();

			// rewindSwitch = new MoneyValidator().validate(input);
		}

		return Integer.parseInt(input);
	}
}