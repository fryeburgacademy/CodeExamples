import javax.swing.JOptionPane;

public class InputDialog {

	public static void main(String[] args){
	
		String intString = JOptionPane.showInputDialog("Enter an integer:");

		int inputAsInt = Integer.parseInt(intString);
		
		System.out.println("The user entered " + inputAsInt);
	}

}