package id.app;

public class Id {
	private String user;
	public static final String ID="universe";
	public Id() {
		this.user=null;
	}
	public Id(String user) {
		this.user=user;
	}
	public void userPrint() {	
		if(user.equals(ID)) {
			System.out.println("�½��ϴ�.");
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
		}
	}
}
