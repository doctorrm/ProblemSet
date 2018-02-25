package Algorithm.nowcoder;

import java.util.Scanner;

/**问题：
 * [编程题]计算一年中的第几天
 *
 今年的第几天？
 输入年、月、日，计算该天是本年的第几天。

 输入描述:
 包括三个整数年(1<=Y<=3000)、月(1<=M<=12)、日(1<=D<=31)。

 输出描述:
 输入可能有多组测试数据，对于每一组测试数据，
 输出一个整数，代表Input中的年、月、日对应本年的第几天。

 示例：
 输入
 1990 9 20
 2000 5 1

 输出
 263
 122
 *
 *
 * 以下是经历的提交问题：
 * 1.本题不支持把代码写在非main方法中，第一次在牛课提交，感觉还是leetcode方便~
 * 2.必须要用删除语句print而不是return返回。。。。
 * 3.输入得通过scanner来。
 * 以上三点没做到哪一点就运行失败或测试失败，好一个奇葩OJ。
 * 而题目说的输入可能有多组测试数据，本来想用到二维数组，然后发现普通数组也就可以了。题目表意不明！
 */
public class YearMonthDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();//必须要通过scanner等类似方式创建输入。。。
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int leap = 0;
        int sum = 0;
        switch (month) //先计算某月以前月份的总天数
        {
            case 1:
                sum = 0;
                break;
            case 2:
                sum = 31;
                break;
            case 3:
                sum = 59;
                break;
            case 4:
                sum = 90;
                break;
            case 5:
                sum = 120;
                break;
            case 6:
                sum = 151;
                break;
            case 7:
                sum = 181;
                break;
            case 8:
                sum = 212;
                break;
            case 9:
                sum = 243;
                break;
            case 10:
                sum = 273;
                break;
            case 11:
                sum = 304;
                break;
            case 12:
                sum = 334;
                break;
            default:
                System.out.println("data error");
                break;
        }
        sum = sum + day; //再加上某天的天数
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))//判断是不是闰年
            leap = 1;
        if (leap == 1 && month > 2)//如果是闰年且月份大于2,总天数应该加一天
            sum++;
        System.out.println(sum);//没输出就没法通过。。。。。坑！
    }
}