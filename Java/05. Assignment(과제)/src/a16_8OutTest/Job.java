package a16_8OutTest;

class Job extends Thread{
    public void run() {
		 byte n = 0;
          while(true)
                 System.out.println(""+n++);
    }
}

