package lambdaAssignmentExe2;

public class Space {
	
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		Intf obj = (str) -> {
			for (int i = 0; i < str.length(); i++) {
				sb.append(str.charAt(i) + " ");
			}
			return sb;
		};
		StringBuffer str2 = obj.s("CG");
		System.out.println(str2);
	}

}
