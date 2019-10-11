import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String[] args) {
		int curr = 1;
		int prev = 0;
		JOptionPane.showMessageDialog(null, "0");
		JOptionPane.showMessageDialog(null, "1");
		for (int i = 0; i < 100; i++) {
			JOptionPane.showMessageDialog(null, curr + prev);
			int next = curr + prev;
			prev = curr;
			curr = next;
		}
	}
}
