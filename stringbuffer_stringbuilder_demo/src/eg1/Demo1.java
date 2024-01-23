package eg1;

public class Demo1 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);
		sb.append(" heyyyy").append(" java");
		System.out.println(sb);
		
		sb.insert(1, "HIBERNATE");
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		sb.deleteCharAt(1);
		System.out.println(sb);
		
		sb.delete(2, 5);
		System.out.println(sb);
		
		
	}

}