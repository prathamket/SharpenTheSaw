package Simple_Programs;

public class StringPalindrom {
public static void main(String[] args) {
	
	String s="abcba";
	char[] arr = s.toCharArray();
	String res="";
	
	for(int i=s.length()-1;i>=0;i--) {
		res =res + arr[i];
	}
	//System.out.println(res);
	if(s.equals(res)) {
		System.out.println("given string is palind");
	}
	
	//or
	
	String str1 = "abcdcba";
	StringBuilder sb = new StringBuilder(str1);
	StringBuilder str2 = sb.reverse();
	str2.append(str1);
}
}
