public class Ex01_7 {
	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str  = name + 8.0;

		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");	//�ٸ�Ÿ�� + ����Ÿ���� ����Ÿ������ ��µȴ�
		System.out.println(" " + 7);	//space bar�� ������ �ν� �� �� 7�� ����Ÿ������ ����Ѵ�.
		System.out.println(7 + "");	
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");	//7+7�� ���� �� ����Ÿ������ ��ȯ�Ͽ� ����Ѵ�.
		System.out.println("" + 7 + 7);	//����Ÿ������ ���� ��ȯ�Ͽ� 7�� 7 �̶�� ���ڷ� �ν��Ͽ� ����Ѵ�.
	}
}
