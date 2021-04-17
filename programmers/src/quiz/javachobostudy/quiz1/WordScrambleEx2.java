package quiz.javachobostudy.quiz1;

import java.util.Scanner;

class WordScrambleEx2 {
	public static void main(String[] args) {
        String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"};

        String answer = getAnswer(strArr);
        String question = getScrambledWord(answer);
        
        Scanner sc = new Scanner(System.in);
        String next;
        while(true) {
              System.out.println("Question :" + question);
              System.out.print("Your answer is :"); 

              // 1. ȭ���� ���� ������� �Է��� �޴´�.(ScannerŬ���� ���)
              next = sc.next();
              // 2. ����ڰ� q �Ǵ� Q�� �Է��ϸ� ���α׷��� �����Ѵ�.
              if (next.equals("q") || next.equals("Q")){
            	  break;
              }
              // 3. ����ڰ� ������ ���⶧���� �ݺ��ϴٰ�
              if (next.equals(answer)) {
            	  System.out.println("�����Դϴ�.");
            	  break;
              } else {
            	  System.out.println("Ʋ�Ƚ��ϴ�.");
              }
              //     ����ڰ� ������ ���߸�, while���� ����������.

        } // while

  } // main

    public static String getAnswer(String[] strArr) { 
         return strArr[(int) (Math.random()*strArr.length)];
    }
   
    public static String getScrambledWord(String str) { 
    	char[] chars = str.toCharArray();
        for(int i=0; i<str.length(); i++) {
        	int a = (int) (Math.random() * str.length());
        	char c = chars[i];
        	chars[i] = chars[a];
        	chars[a] = c;
        }
        String s = String.copyValueOf(chars);
    	return s;

    } // scramble(String str)
}
