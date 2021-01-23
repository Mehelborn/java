import javax.swing.JOptionPane;

class example {
	public static void main(String[] args) {
		String username = 
				JOptionPane.showInputDialog("Username: ");
		String password = 
				JOptionPane.showInputDialog("Password: ");
		if (username != null && password != null && 
				(username.equals("Mehelborn") && password.equals("keygen"))) {
			JOptionPane.showMessageDialog(null, "Authorized successfully!");
		} else {
			JOptionPane.showMessageDialog(null, "Try again!");
		}
	}
}