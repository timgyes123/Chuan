package tw.org.iii.ChuanLab;

import javax.swing.JOptionPane;

public class primeNumber {

	public static void main(String[] args) {
		String input =JOptionPane.showInputDialog("�п�J�Ʀr");
		boolean isPrime=true;
	int a=Integer.parseInt(input);
	for(int b=2;a>b;b++) {
		if(a%b == 0) {
			isPrime = false;
			break;	
		}		
	} if(isPrime) {
		System.out.println(a+"�O�ȼ�");
	}else {
		System.out.println(a+"���O�ȼ�");
	}
		
		
	}

}
