package regExPlay;

public class RegexTut {

	public static void main(String[] args) {
		
		String digit="-24,55$";
		//^ when used with [^] its a not operator
		digit=	digit.replaceAll("[^\\d]", "");
		
		//remove non digits like -,$  
		System.out.println(digit);//2455
		//insert .(dot) between digits
		//(\\d{2})(\\d{2}) find two groups 1st group  with two digit and
		//secondGroup with 2 digit
		
		  digit=digit.replaceAll("(\\d{2})(\\d{2})", "$1.$2");
		  System.out.println(digit);//24.55
		
		
		String regex2="-24helo24";
		System.out.println(regex2.replaceAll("[^\\d]", ""));
		
		/*
		 * $1: Refers to the content captured by the first capturing group in 
		 * the pattern.
		$2: Refers to the content captured by the second capturing group in the pattern
		 */
	}
	

}
