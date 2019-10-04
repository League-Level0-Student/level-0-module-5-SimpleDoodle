package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeorNot {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog(null, "What number do you want to test if it's prime or not?");
		int i = Integer.parseInt(s);
		for (int j = 1; j < i; j++) {
			if (0 == i % j && j!=1 && j!=i) {
				
					JOptionPane.showMessageDialog(null, "Your number is not prime.");
					break;

				} else {
					JOptionPane.showMessageDialog(null, "Your number is a prime number.");
					break;
				}

			}
		}
	}

