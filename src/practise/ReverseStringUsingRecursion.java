package practise;

public class ReverseStringUsingRecursion {

	public static void main(String[] args)
	{
		String s = "JAVA";
		byte[] stringArray = s.getBytes();
		//------------------Normal process----------------------------
		
		
		char charAt = 0;
		
		for(int i=stringArray.length-1;i>=0;i--)
		{
			 charAt = s.charAt(i);
			 System.out.println(charAt);
		}
		
		//----------Recursion---------------------------------------
		ReverseStringUsingRecursion rev = new ReverseStringUsingRecursion();
		
			String reverseAStringUsingRecursion = rev.reverseString(s);
			System.out.println(reverseAStringUsingRecursion);
		
		
		
		
		
	}

	public String reverseString(String str){
		String reverse = "";
        if(str.length() == 1){
            return str;
        } else {
            reverse += str.charAt(str.length()-1) +reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    }
}
