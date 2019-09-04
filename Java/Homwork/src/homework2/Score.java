package homework2;

import java.util.Scanner;

public class Score {

   @SuppressWarnings("resource")
public static void main(String[] args) {
      int sum=0;
      Scanner scan=new Scanner(System.in);
      System.out.print("학생의 수를 입력하시오 : ");
      int num=scan.nextInt();
      int[] score=new int[num];
      for(int i=0;i<score.length;i++) {
         System.out.print("학생"+(i+1)+"의 성적을 입력하시오 : ");
         score[i]=scan.nextInt();
         if(score[i]<1||score[i]>100) {
            i--;
            System.out.println("잘못된 성적입니다. 다시입력하시오.");
            continue;
         }
         sum+=score[i];
         
      }
      System.out.println("성적 평균은 "+(double)(sum/num)+"입니다.");
   }

}