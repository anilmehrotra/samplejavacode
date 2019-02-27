public class MergeString {

	public static void main(String[] aa) {

		String input1 = "123";
		String input2 = "";

		String out = mergeString(input1, input2);
		System.out.println("Merge String : " + out);
	}

	public static String mergeString(String input1, String input2) {
		String output = "";
		if (((null == input1 || input1.isEmpty()) && (null == input2 || input2.isEmpty()))) {
			output = null;
		} else if (input1 == null || input1.isEmpty()) {
			output = input2;
		} else if (input2 == null || input2.isEmpty()) {
			output = input1;
		} else {
			int length = input1.length() < input2.length() ? input1.length() : input2.length();
			String inputOfMaxLength = input1.length() < input2.length() ? input2 : input1;
			for (int i = 0; i < length; i++) {
				output = output + input1.charAt(i) + input2.charAt(i);
			}
			output = output + inputOfMaxLength.substring(length);
		}
		return output;
	}
}
