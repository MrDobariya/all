import java.util.Arrays;
import java.util.List;

public class RemoveVowels
{
	static String removeVowel(String strVowel)
	{
		Character[] vowel = {'a','e','i','o','u','A','E','I','O','U'};
		List<Character> li = Arrays.asList(vowel);
		StringBuffer strBuffer = new StringBuffer(strVowel);
		for(int a = 0; a< strBuffer.length(); a++)
		{
			if(li.contains(strBuffer.charAt(a)))
			{
				strBuffer.replace(a,a + 1,"");
				a--;
			}
		}
		return strBuffer.toString();
	}
	public static void main(String args[])
	{
		String strInput = "Hello World java";
		System.out.println(removeVowel(strInput));
	}
} 