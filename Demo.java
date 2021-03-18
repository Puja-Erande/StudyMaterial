import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	private static final String EXPRESSION = "(0|91)?[7-9][0-9]{9}";
	private static final CharSequence INPUT_STRING = "7768823419";

	public static void main(String[] args) {
		Pattern p = Pattern.compile(EXPRESSION);
		Matcher match = p.matcher(INPUT_STRING);
		if(match.find()&& match.group().equals(INPUT_STRING))
		{
			System.out.print("valid mobile number");
		}
		else
		{
		System.out.print("not valid mobile number");
		}
		

	}

}
