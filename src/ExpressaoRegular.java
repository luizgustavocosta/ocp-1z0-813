import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("(\\d\\d)(\\w)");

		Matcher matcher = pattern.matcher("11a22b33c");

		while (matcher.find()) {
			System.out.format("%s %s | %s %n", matcher.group(), matcher.group(1), matcher.group(2));
		}
		
		// New challenge
		String data = "2007-12-31";

		pattern = Pattern.compile("(\\d{4})+(\\-)+(\\d{2})+(\\-)(\\d{2})");
		matcher = pattern.matcher(data);
		while (matcher.find()) {
			System.out.format("%s | %s | %s %n", matcher.group(5), matcher.group(3), matcher.group(1));
		}
		
	}
}
