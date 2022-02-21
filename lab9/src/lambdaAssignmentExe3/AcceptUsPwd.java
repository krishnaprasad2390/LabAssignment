package lambdaAssignmentExe3;

public class AcceptUsPwd {
	
	public static void main(String[] args) {

		String name = "Krishna";
		String pass = "Krishna123";
		Intf p = ((username, password) -> {
			if (username.equals(name) && password.equals(pass))
				return true;
			else
				return false;
		});
		System.out.println(p.checkIdentity("Krishna", "krishna123"));
	}

}
