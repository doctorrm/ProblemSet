public class Radix {
    public static void main(String[] args) {
        //将2进制，8进制转化为10进制
        String a = "0100";
        int d = Integer.parseInt(a, 2); // 2进制
        int o = Integer.parseInt(a, 8); // 8进制

        //10进制变为3进制（n进制）字符串
        String threeForm = Integer.toString(5, 3);
    }
}
