import java.util.*;

class Ice extends Cream{
	public static void main(String[] args) {
		int a, s, p, n = 0;
		System.out.println();
		for (int i = 1; i <= 7; i++) {
			System.out.print(" <@) (@> ");
		}
		System.out.println("\n");
		for (int i = 1; i <= 15; i++) {
			System.out.print(" ");
		}
		System.out.print(" <@)   DELICIOUS   (@>");
		System.out.println();
		for (int i = 1; i <= 35; i++) {
			System.out.print(" ");
		}
		System.out.println("_Enjoy your Dream Cream");
		for (int i = 1; i <= 7; i++) {
			System.out.print(" <@) (@> ");
		}
		do {
			menu();
			s = shape();
			a=s;
			p = price(a);
			payment(p);
			switch (s) {
				case 1:
					System.out.println("\nHere is your Icecream Cone\n");
					icecreamcone();
					break;
				case 2:
					System.out.println("\nHere is your Bucket Icecream\n");
					bucket('-');
					break;
				case 3:
					System.out.println("\nHere is your Family Pack Icecream\n");
					familypack('@');
					break;
				case 4:
					System.out.println("\nHere is your Cup Icecream\n");
					cup('-');
					break;
				case 5:
					System.out.println("\nHere is your Stick Icecream\n");
					stick('!');
					break;
				case 6:
					System.out.println("\nHere is your Thick Shake\n");
					thickshake('$');
					break;
				case 7:
					System.out.println("\nHere is your Kulfi\n");
					kulfi('@');
					break;
				case 8:
					System.out.println("\nHere is your Falooda\n");
					thickshake('&');
					break;
			}
			System.out.println("\nDo You Want More Icecream??\nPress 1 For Yes\nPress 0 for Exit\n");
			Scanner sc = new Scanner(System.in);
			n=sc.nextInt();
		} while (n != 0);
		System.out.println("               <@)Fulfill Ur Dream\n       Again with Cream(@>");
	}
}

class Cream {
	public static int price(int a) {
		switch (a) 
		{
			case 1:a=30;break;
			case 2:a=100;break;
            case 3:a=150;break;
            case 4:a=25;break;
			case 5:a=20;break;
            case 6:a=60;break;
			case 7:a=20;break;
			case 8:a=70;break;
		}
		return a;
	}

	public static int menu() {
		int n = 0;
		do {
			if (n >= 7) {
				System.out.println("You Have Entered Wrong Value\nTry Again");
			}
			System.out.println();
			for (int i = 1; i <= 3; i++) {
				System.out.print("'-._.-'");
			}
			System.out.print("MENU CARD");
			for (int i = 1; i <= 3; i++) {
				System.out.print("'-._.-'");
			}
			System.out.println("\n");
			space(4);
			System.out.print("FLAVOURS");
			System.out.print("\n1) Creamy Vanilla");
			space(20);
			System.out.print("2) Mango Tango\n");
			System.out.print("3) Strawberry Strike");
			space(17);
			System.out.print("4) Kesar Pista\n");
			System.out.print("5) Chocolate Brownie");
			space(17);
			System.out.print("6) ButterScotch Bonanza\n");
			System.out.print("Enter The Flavour\n");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
		} while (n >= 7);
		return n;
	}

	public static void payment(int x) {
		int a = 0;
		do {
			if (a >= 4) {
				System.out.println("\nYou Have Entered Wrong Value\nTry Again");
			}
			System.out.println("\nMode Of Payment\n1)Insert Money");
			System.out.println("2)Debit Card\n3)Credit Card");
			System.out.println("Enter Your Option");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			switch (a) {
				case 1:
					System.out.println("INSERT Rs." + x);
					try {
						Thread.sleep(5*60*10);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
			break;
		case 2:
			System.out.println("INSERT CARD\nEnter pincode without pressing enter");
			long p = sc.nextLong();
			System.out.println("Transaction Successfull, dedeucted Rs."+x);
			break;
		case 3:
			System.out.println("INSERT CARD\nEnter pincode without pressing enter");
			p = sc.nextLong();
			System.out.println("Transaction Successfull, dedeucted Rs."+x);
			break;
		}
	} while(a >= 4);
}
public static int shape() {
	int a = 0;
	do {
		if(a >= 9) {
			System.out.print("\nYou Have Entered Wrong Value\nTry Again");
		}
		System.out.print("\nEnter Shape You Want To Choose");
		System.out.print("\n    SHAPE");
		space(20);
		System.out.print("PRICE\n");
		System.out.print("1) Cone");
		space(23);
		System.out.print("30\n");
		System.out.print("2) Bucket");
		space(21);
		System.out.print("100\n");
		System.out.print("3) Family Pack");
		space(16);
		System.out.print("150\n");
		System.out.print("4) Cup"); 
		space(24);
		System.out.print("25\n");
		System.out.print("5) Stick");
		space(22);
		System.out.print("20\n");
		System.out.print("6) Thick Shake"); 
		space(16);
		System.out.print("60\n");
		System.out.print("7) Kulfi");
		space(22);
		System.out.print("20\n");
		System.out.print("8) Falooda");
		space(20);
		System.out.print("70\n");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
	} while(a >= 9);
	return a;
}

public static void kulfi(char c) {
	System.out.println("\n\n  KULFI\n");
	for (int i = 1; i <= 7; i++) {
		for (int j = 1; j <= 9; j++) {
			if (j >= 4 - i && j <= 6 + i) {
				System.out.print((char)(c));
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for (int i = 1; i <= 7; i++) {
		for (int j = 1; j <= 9; j++) {
			System.out.print((char)(c));
		}
		System.out.println();
	}
	for(int i = 1; i <= 5; i++) {
		space(3);
		System.out.println("|||");
	}
}

public static void stick(char c){
	semicir(3, '@');
	for (int i = 1; i <= 14; i++) {
		space(1);
		for (int j = 1; j <= 15; j++) {
			System.out.print((char)(c));
		}
		System.out.println();
	}
	for(int i = 1; i <= 7; i++) {
		space(7);
		System.out.println("|||");
	}
}

public static void cup(char c) {
	semicir(3, '#');
	System.out.print("* CUP ICE-CREAM *");
	System.out.println();
	for (int i = 1; i <= 4; i++) {
		for (int j = 1; j <= 17; j++) {
			System.out.print((char)(c));
		}
		System.out.println();
	}
	for(int i = 1; i <= 1; i++) {
		for(int j = 1; j <= 17; j++) {
			if(j >= i + 1 && j <= 17 - i) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for(int i = 1; i <= 15; i++) {
		if(i <= 2) {
			System.out.print(" ");
		} else {
			System.out.print("=");
		}
	}
	System.out.println();
	for(int i = 1; i <= 17; i++) {
		System.out.print("+");
	}
}

public static void thickshake(char c) {
	space(5);
	for (int k = 1; k <= 15; k++) {
		System.out.print("@");
	}
	System.out.println();
	for (int i = 1; i <= 5; i++) {
		if (i >= 2) {
			for (int k = 1; k <= 5; k++) {
				System.out.print((char)(c));
			}
		} else {
			space(5);
		}
		for (int j = 1; j <= 2; j++) {
			System.out.print("@");
		}
		if (i >= 2) {
			for (int k = 1; k <= 7; k++) {
				System.out.print((char)(c));
			}
		}
		System.out.println();
	}
	for (int i = 1; i <= 13; i++) {
		for (int j = 1; j <= 14; j++) {
			System.out.print((char)(c));
		}
		System.out.println();
	}
	for(int i = 1; i <= 2; i++) {
		for(int j = 1; j <= 13; j++) {
			if(j >= i + 1 && j <= 14 - i) {
				System.out.print("+");
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for(int i = 1; i <= 14; i++) {
		System.out.print("=");
	}
}
public static void bucket(char c) {
	cherry('@');
	semicir(4, '#');
	System.out.print("** BUCKET ICECREAM");
	System.out.print(" **");
	System.out.println();
	for (int i = 1; i <= 7; i++) {
		for (int j = 1; j <= 21; j++) {
			System.out.print((char)(c));
		}
		System.out.println();
	}
	for(int i = 1; i <= 1; i++) {
		for(int j = 1; j <= 21; j++) {
			if(j >= i + 1 && j <= 21 - i) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	for(int i = 1; i <= 19; i++) {
		if(i <= 2) {
			System.out.print(" ");
		} else {
			System.out.print("=");
		}
	}
	System.out.println();
	for(int i = 1; i <= 21; i++) {
		System.out.print("+");
	}
}

public static void familypack(char c) {
	char a[] = { 'F', 'A', 'M', 'I', 'L', 'Y', 'P', 'A', 'C', 'K' };
	char b[] = { 'I', 'C', 'E', 'C', 'R', 'E', 'A', 'M' };
	for (int i = 1; i <= 2; i++) {
		for (int j = 1; j <= 30; j++) {
			if (i == 1 && j == 1 || i == 1 && j == 30) {
				System.out.print(" ");
			} else {
				System.out.print((char) (c));
			}
		}
		System.out.println();
	}
	for (int i = 1; i <= 10; i++) {
		System.out.print((char)(c));
	}
	System.out.print(a);
	for (int i = 1; i <= 10; i++) {
		System.out.print((char)(c));
	}
	System.out.println();
	for (int i = 1; i <= 11; i++) {
		System.out.print((char)(c));
	}
	System.out.print(b);
	for (int i = 1; i <= 11; i++) {
		System.out.print((char)(c));
	}
	System.out.println();
	for (int i = 1; i <= 2; i++) {
		for (int j = 1; j <= 30; j++) {
			if (i == 2 && j == 1 || i == 2 && j == 30) {
				System.out.print(" ");
			} else {
				System.out.print((char)(c));
			}
		}
		System.out.println();
	}
}
public static void icecreamcone() {
	cherry('!');
	semicir(4,'#');
	cone(11, (byte)'V');
}

public static void space(int n) {
	for(int i = 1; i <= n; i++) {
		System.out.print(" ");
	}
}

public static void cherry(char c) {
	for (int k = 1; k <= 2; k++) {
		space(9);
		if (k == 1) {
			space(1);
		}
		for (int j = 1; j <= 2 * k - 1; j++) {
			System.out.print((char) Byte.toUnsignedInt((byte) c));
		}
		System.out.println();
	}
}

public static void semicir(int n, char c) {
	for (int i = 1; i <= n; i++) {
		System.out.print("  ");
		for (int j = 1; j <= 5 * n - 2; j++) {
			if (j >= 2 * n + 1 - 2 * i && j <= 2 * i + 2 * n + 1) {
				System.out.print((char) Byte.toUnsignedInt((byte) c));
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}

public static void cone(int n, byte x) {
	for(int i = 1; i <= 2 * n - 1; i++) {
		System.out.print("=");
	}
	System.out.println();
	for(int i = 1; i <= 2 * n - 1; i++) {
		System.out.print("=");
	}
	System.out.println();
	for(int i = 1; i <= n; i++) {
		for(int j = 1; j <= 2 * n - 1; j++) {
			if(j >= i && j <= 2 * n - i) {
				System.out.print((char)Byte.toUnsignedInt(x));
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}


