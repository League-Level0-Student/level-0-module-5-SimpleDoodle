package _06_for_loop_gauntlet;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		// for(int a = 0; a < 101; a++) {
		// System.out.println(a);
		// }
		// for (int b = 100; b > -1; b--) {
		// System.out.println(b);
		// }
		// for (int c = 2; c < 101; c++) {
		// System.out.println(c);
		// }
		// for (int d = 0; d < 101; d++) {
		// if (0!=d%2) {
		// System.out.println(d);
		// }
		// }
//	for (int e = 1; e < 501; e++) {
//		if (0==e%2) {
//			System.out.println(e + " even");
//		}
//		if (0!=e%2) {
//			System.out.println(e + " odd");
//		}
//	}
//	for (int f = 0; f < 778; f++) {
//		if (0==f%7) {
//			System.out.println(f);
//		}
//	}
//	int h = 2006;
//	for (int g = 0; g < 14; g++) {
//	System.out.println("In " +h+ ", I was " +g + " years old.");
//	h++;
//	}
//for (int i = 0; i < 3; i++) {
//	for (int j = 0; j < 3; j++) {
//	System.out.println(i +" "+ j);	
//	}
//}
	int a=2;
	int b=3;
for (int i = 1; i < 10; i+=3) {
	
	for (int j = 0; j < 1; j++) {
	System.out.println(i+" "+a+" "+b);
	a+=3;
	b+=3;
	}
}
	}
}
