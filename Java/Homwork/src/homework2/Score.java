package homework2;

import java.util.Scanner;

public class Score {

   @SuppressWarnings("resource")
public static void main(String[] args) {
      int sum=0;
      Scanner scan=new Scanner(System.in);
      System.out.print("�л��� ���� �Է��Ͻÿ� : ");
      int num=scan.nextInt();
      int[] score=new int[num];
      for(int i=0;i<score.length;i++) {
         System.out.print("�л�"+(i+1)+"�� ������ �Է��Ͻÿ� : ");
         score[i]=scan.nextInt();
         if(score[i]<1||score[i]>100) {
            i--;
            System.out.println("�߸��� �����Դϴ�. �ٽ��Է��Ͻÿ�.");
            continue;
         }
         sum+=score[i];
         
      }
      System.out.println("���� ����� "+(double)(sum/num)+"�Դϴ�.");
   }

}