package eg1;

public class TitleCase {

	public static void main(String[] args) {
		String s="hello hii good evening everyone";
		StringBuilder sb=new StringBuilder();
		String s1[]=s.split(" ");
		for(String x:s1) {
			sb.append(Character.toUpperCase(x.charAt(0))).append(x.substring(1)).append(" ");
		}
		System.out.println(sb.toString().trim());

	}

}
//Try last letter of every word touppercase