/**
 * 
 */
package kr.co.mnbiz.util;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Administrator
 * 
 */
public class Strings {

	private Strings() {
	}

	/**
	 * @param s
	 * @return capitalized string
	 */
	public static String capitalize(String s) {
		String first = s.substring(0, 1);
		return first.toUpperCase() + s.substring(1);
	}

	public static String upperUnderBar(String s){
		StringBuilder sb = new StringBuilder();
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			char u = Character.toUpperCase(c);
			if (!flag && c == u && i != 0) {
				sb.append("_").append(u);
				flag = true;
				continue;
			}
			sb.append(u);
			flag = false;
		}
		return sb.toString();
		
		
	}
	
	/**
	 * @param input
	 * @param defaultValue
	 * @return input itself if input is not empty , else default value
	 */
	public static String nvl(String input, String defaultValue) {
		return isEmpty(input) ? defaultValue : input;
	}

	/**
	 * @param p
	 * @param n
	 * @return repeated string
	 */
	public static String repeat(String p, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(p);
		}
		return sb.toString();
	}

	/**
	 * @param v
	 * @return is empty?
	 */
	public static boolean isEmpty(String v) {
		return v == null || v.trim().isEmpty();
	}

	/**
	 * @param array
	 * @return empty 인거 빼고 값 있는 것만 넘겨 받음.
	 */
	public static List<String> removeEmptyValues(String[] array) {
		List<String> ret = new ArrayList<String>();
		if (array != null) {
			for (String string : array) {
				if (!isEmpty(string)) {
					ret.add(string);
				}
			}
		}
		return ret;
	}
	public static String removePackageName(String in){
		return in.replaceAll("(.+\\.)", "");
	}
	

	private static final String p = "^(\\d{3})(\\d{4})(\\d{4})$";

	public static String toDashPhoneFormat(String arg) {
		return arg.replaceAll("\\D", "").replaceAll(p, "$1-$2-$3");
	}

	public static String convertCharset(String str, String orgCharset, String newCharset) {
		return new String(str.getBytes(Charset.forName(orgCharset)), Charset.forName(newCharset));

	}

	public static String join(String[] data, int position, String string) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for (; i < data.length - 1 && i < position; i++) {
			sb.append(data[i]).append(string);
		}
		return sb.append(data[i]).toString();
	}

	/**
	 * @param src
	 *            비교대상 글자1
	 * @param dest
	 *            비교대상 글자2
	 * @return 두 문자열 중 최초로 다른 문자열의 위치, 완전히 같은 경우 -1
	 */
	public static int getFirstDiffernce(String src, String dest) {
		int min = Math.min(src.length(), dest.length());
		for (int i = 0; i < min; i++) {
			if (src.charAt(i) != dest.charAt(i)) {
				return i;
			}
		}
		return src.length() == dest.length() ? -1 : min;
	}

	/**
	 * @param src
	 *            비교대상 글자배열1
	 * @param dest
	 *            비교대상 글자배열2
	 * @return 두 문자 배열 중 최초로 다른 문자열의 위치, 완전히 같은 경우 -1
	 */
	public static int getFirstDiffernce(String[] src, String[] dest) {
		int min = Math.min(src.length, dest.length);
		for (int i = 0; i < min; i++) {
			if (!src[i].equals(dest[i])) {
				return i;
			}
		}
		return src.length == dest.length ? -1 : min;
	}

	public static String camelize(String s) {
		StringBuilder sb = new StringBuilder(s.substring(0, 1).toUpperCase());
		boolean flag = false;
		for (int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '-' || c == '_') {
				flag = true;
				continue;
			}
			if (flag) {
				sb.append(String.valueOf(c).toUpperCase());
			} else {
				sb.append(c);
			}
			flag = false;
		}
		return sb.toString();
	}

	

	public static String firstUpperCamelize(String s) {
		s = camelize(s);
		if (s.startsWith("_")) {
			s = s.substring(1);
		}
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}

	
	
	public static String join(Collection<?> data, String delimiter) {
		StringBuilder sb = new StringBuilder();
		for (Object element : data) {
			sb.append(element.toString()).append(delimiter);
		}
		int leng = delimiter.length();
		if (sb.length() >=leng) {
			sb.delete(sb.length() - leng, sb.length());
		}
		return sb.toString();
	}

	public static String memberFormat(String name) {
		String s = camelize(name);
		return s.substring(0, 1).toLowerCase() + s.substring(1);
	}

	private static Set<String> reserved = new HashSet<String>(Arrays.asList("int", "long", "float", "enum"));
	
	public static String changeReserved(String in) {
		return reserved.contains(in) ? "_" + in : in;
	}

	

	private static String getJosa(char lastChar, String withotFulcrum, String withFulcrum) {
		if (((lastChar - 0xAC00) % (21 * 28)) % 28 == 0) {
			return withotFulcrum;
		} else {
			return withFulcrum;
		}
	}

	private static final Pattern josaPattern = Pattern.compile("\\[([ㄱ-ㅣ가-힣]+)/([ㄱ-ㅣ가-힣]+)\\]");

	/**
	 * @param in
	 *            string : "나[는/은] 너[를/을] 지갑[와/과] 학생[로/으로]부터"
	 * @return 조사 처리된 string [받침 없을때/받침 있을 때의 형식]
	 */
	public static String processJosa(String in) {
		Matcher m = josaPattern.matcher(in);
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			String josa = getJosa(in.charAt(m.start() - 1), m.group(1), m.group(2));
			m.appendReplacement(sb, josa);
		}
		m.appendTail(sb);
		return sb.toString();
	}

	/*
	 * custom class loader 의 경우 class.getPackage() 가 null이 return 되는 경우가 있음.. 왜
	 * 그런지는 모르겠으나...
	 */
	public static String getPackageName(String classFullName) {
		int i = classFullName.lastIndexOf('.');
		if (i != -1) {
			return classFullName = classFullName.substring(0, i);
		} else {
			return null;
		}
	}

	/**
	 * @return generated uuid (length : 36 )
	 */
	public static String newUUID() {
		return UUID.randomUUID().toString();
	}
	
	

	private static Random random = new Random();
	/**
	 * @return generated numbers
	 */
	public static String randomNumber(int disit) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < disit; i++) {
			String s = String.valueOf(random.nextInt(Math.min(32, disit)));
			sb.append(s);
		}
		return sb.toString();
	}
	

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(randomNumber(10));
		}
		
		System.out.println(join(new ArrayList<String>(), "test"));
		System.out.println(getFirstDiffernce("abc", "ab"));
		System.out.println(getFirstDiffernce("abc", "abc"));
		System.out.println(getFirstDiffernce("abc", ""));
	}
}
