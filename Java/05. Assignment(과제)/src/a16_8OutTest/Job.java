package a16_8OutTest;

class Job extends Thread{
    public void run(int n) {
		 String name=null;

		while(true)
                 System.out.println(name+n++);
    }	
    public void Job(){
    	
    }
}

