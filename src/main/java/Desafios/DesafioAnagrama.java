package Desafios;

import java.util.Arrays;

public class DesafioAnagrama {
	public static boolean anagramas(String s1, String s2) {
	    if(!(s1.equalsIgnoreCase(s2))) {
	        char[] ch1 = s1.toCharArray();
	        char[] ch2 = s2.toCharArray();
	        Arrays.sort(ch1);
	        Arrays.sort(ch2);
	        return Arrays.equals(ch1,ch2);
	    }
	    return false;
	}

	public static String ContandoAnagramas(String str) {
	    int res = 0;
	    String[] splitStr = str.split("\\s+");
	    for(int i = 0 ; i< splitStr.length; i++)
	        for (int j = i + 1; j < splitStr.length; j++)
	            if (anagramas(splitStr[i], splitStr[j]))
	                res++;
	    return String.valueOf(res-1);
	}
}