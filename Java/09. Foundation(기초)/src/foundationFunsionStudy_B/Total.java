package foundationFunsionStudy_B;

public class Total {

	public static void main(String[] args) {
		int total = 0;
		int result = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) { // 2�� ���� �������� 0�� �ƴ϶�°��� Ȧ���� �ǹ��Ѵ�.
				continue; // Ȧ���� ��� total = total + i; ������ ������� �����Ƿ�, ��������� ¦���� �����ش�.
			}
			total = total + i;
		}
		System.out.println(total);
		for (int i = 1; i <= 100; i++) { // 1���� 100���� �ݺ��ϱ� ���� for �ݺ���

			result = result + i; // 1���� 100���� �ݺ��ؼ� total ������ ���� ����
		}
		System.out.println(result); // ����� ���
	}
}
