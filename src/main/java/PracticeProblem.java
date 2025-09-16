public class PracticeProblem {

	public static void main(String args[]) {

	}
	//Question 1
	public static String pluralize(String q1) {
	String word = q1.toLowerCase();
	if (word.endsWith("ey")) {
		return("eys"); }
	else if (word.endsWith("y")) {
		return("ies");	}
	else if (word.endsWith("ife")) {
		return("ives"); }
	else return("s"); 
	}

		
	//Question 2
	public static int min(int num1, int num2, int num3) {
	if (num1 < num2  && num1 < num3) {
		return num1; }
	else if (num2 < num3 && num2 < num1) {
		return num2; }
	else if (num3 < num1 && num3 < num2) {
		return num3; }
	return num3;
	}

	//Question 3
	public static boolean isLeapYear(int q3) {
	if (q3 % 400 == 0) {
		return true; }
	else if (q3 % 100 == 0) {
		return false; }
	else if (q3 % 4 == 0) {
		return true; }
	else {
		return false; }
	}


}
	



