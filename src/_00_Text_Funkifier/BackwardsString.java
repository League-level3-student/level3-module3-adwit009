package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String backwards = "";
		for (int i = 0; i < s.length(); i++) {

			char x = s.charAt(s.length() - (1 + i));
			backwards += x;

		}
		return backwards;
	}

}
