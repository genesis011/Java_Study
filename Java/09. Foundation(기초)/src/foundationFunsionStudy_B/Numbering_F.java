package foundationFunsionStudy_B;

public class Numbering_F {
	public static void main(String[] args) {
		String result = numbering(2, 5); //�޼ҵ� numbering�� ������ ���� ���� result�� �����.
		System.out.println(result); // ���� result�� ���� ȭ�鿡 ����Ѵ�.
	}

	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
		while (i < limit) {
			output += " " + i; //���ڸ� ȭ�鿡 ����ϴ� ��� ���� output�� ��Ҵ�.
			i++;
		}// �߿�!!! output�� ����ִ� ���ڿ��� �޼ҵ� �ܺη� ��ȯ�Ϸ��� �Ʒ��� ���� result��ġ�ϸ�ȴ�.
		return output;
	}
}
