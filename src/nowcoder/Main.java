package Algorithm.nowcoder;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());//用户数，第一行
        String[] numbers = sc.nextLine().split(" ");//各个人的喜好k，第二行
        int groupnumber = Integer.parseInt(sc.nextLine().trim());//组数，第三行

        for (int i = 0; i < groupnumber; i++) {
            int count = 0;
            String[] grouparr = sc.nextLine().split(" ");//每组情况，第i行
            int start = Integer.parseInt(grouparr[0]);
            int end = Integer.parseInt(grouparr[1]);
            for (int j = start - 1; j <= end - 1; j++) {
                if (numbers[j].equals(grouparr[2])) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}