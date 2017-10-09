package leetcode;

/**
 * Reverse digits of an integer.
 * 
 * Example1: x = 123, return 321 ;Example2: x = -123, return -321
 * 
 * @Author doctorrm
 * @Time 2017-10-09 上午12:04:53
 */
public class ReverseInteger {
	public static void main(String[] args) {
		int res = ReverseInteger.revgerseInteger(-2147483412);// 0100
		System.out.println(res);

	}

	public static int revgerseInteger(int x) {
		if (x < -2147483648 || x > 2147483647) {
			// System.out.println("out of rangte1");
			return 0;
		}
		Integer param = x;
		String paramStr = param.toString();
		// System.out.println(param + "," + paramStr);
		char ze = paramStr.charAt(0);
		StringBuffer sb = new StringBuffer();
		if (ze == 45) {
			sb.append("-");
			for (int i = paramStr.length() - 1; i > 0; i--) {
				sb.append(paramStr.charAt(i));
			}
		} else {
			for (int i = paramStr.length() - 1; i >= 0; i--) {
				sb.append(paramStr.charAt(i));
			}
		}
		String reString = sb.toString();
		if (Double.valueOf(reString) < -2147483648 || Double.valueOf(reString) > 2147483647) {// YOU
																								// NEED
																								// TO
																								// THINK
																								// AFTER
																								// REVERSE!!!!
			// System.out.println("out of rangte");
			return 0;
		}
		int resInt = Integer.valueOf(reString);// remove 0 when input is alike
												// 6100
		// System.out.println(resInt);
		return resInt;
	}
}
