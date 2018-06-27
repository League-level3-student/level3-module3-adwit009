package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		boolean caps = false;
		boolean lastLetterIsCaps = false;
		String answer = "";
		for (int i = 0; i < s.length(); i++) {

			char x = s.charAt(i);

			if (x > 96 && caps == false) {
				answer += x;
				caps = true;
			} else if (x < 97 && caps == false && x > 64) {
				x += 32;
				answer += x;
				caps = true;
			} else if (x > 96 && caps == true) {
				x -= 32;
				answer += x;
				caps = false;
			} else if (x < 97 && caps == true && x > 33) {
				answer += x;
				caps = true;
			} else if (x == 32) {
				answer += x;
				if (caps == true) {
					caps = false;
				} else if (caps == false) {
					caps = true;
				}
			}

		}
		return answer;
	}

}
