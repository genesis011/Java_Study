package chapter03;

import java.util.Scanner;

public class B1_chapter03<statc> {

public static void main(String[] args) {
    int number=0;
    @SuppressWarnings("resource")
	Scanner inputObject=new Scanner(System.in);
    System.out.print("2�������� �ٲ� ���� ���� �Է¿�� :");
    number = inputObject.nextInt();
    String strValue=toBinaryString(number);
    System.out.println(number+"���� 2���� ��ȯ="+strValue);
  }
  
  public static String toBinaryString(int value) {
    String strValue =Integer.toBinaryString(value);
    System.out.println("2�������� ��ȯ�� ���ڿ�����:"+strValue.length());
    while(strValue.length()<=32) {
      strValue="0"+strValue;
    }
    return strValue;
  }
}
