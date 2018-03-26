/**
 * 十进制正数的补码=原码；十进制负数的补码=反码+1；补码除高位取反+1=原码；取反码时符号位不变；位运算都是补码运算
 */
public class bit_operation {
    public static void main(String[] args) {
        System.out.println(4 ^ 2);//运算结果00000110为原码，即输出6

        System.out.println(4 ^ -2);//运算结果10000110为原码，即输出-6
        System.out.println((-4) ^ 2);//运算结果10000110为补码，输出-2？？？

    }

    /**
     * 正数的bit运算
     */
    public void positive() {//注意int是四个字节的，但正数前面都是0不变，所以就简写为一个字节来方便看
        int a = 60;	/* 60 = 0011 1100 */
        int b = 13;	/* 13 = 0000 1101 */
        int c = 0;

        c = a & b;        /* 12 = 0000 1100 */
        System.out.println("a & b = " + c);

        c = a | b;        /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);

        c = a ^ b;        /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c);

        c = ~a;           /*-61， 1100 0011 *///非运算和其它运算不同，正数的非结果也是补码，输出要除高位的取反+1：-61=1011 1101
        System.out.println("~a = " + c);

        c = a << 2;       /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c);

        c = a >> 2;       /* 15 = 1111 */
        System.out.println("a >> 2  = " + c);

        c = a >>> 2;      /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c);
    }

    /**
     * 负数的bit运算-------------not finished yet...!!!
     */
    public void negative() {
        int a = -60;	/* -60原码为1011 1100，转化为补码为1100 0100； */
        int b = -13;	/* -13原码为1000 1101，转化为补码为1111 0011 */
        int c = 0;

        c = a & b;        /*                 运算结果为补码1100 0000，转化为原码为1100 0000=-64 */
        System.out.println("a & b = " + c);

        c = a | b;        /*                运算结果为补码1111 0111，转化为原码为1000 1000=-9 */
        System.out.println("a | b = " + c);

        c = a ^ b;     /* 因为结果为正，所以运算结果为原码0011 0111=55 */
        System.out.println("a ^ b = " + c);

        c = ~a;           /*59 = 1100 0011 */
        System.out.println("~a = " + c);

        c = a << 2;       /* -240 = 1111 0000 */
        System.out.println("a << 2 = " + c);

        c = a >> 2;       /* -15 = 1111 */
        System.out.println("a >> 2  = " + c);

        c = a >>> 2;      /* 1073741809 = 0000 1111 */
        System.out.println("a >>> 2 = " + c);
    }

    //如何统计二进制中1的个数:每次往右移动一位，看最低位，如果是奇数则最低位为1
    public int question1(int num){
        int res=0;
        while(num!=0){
            if(num%2==1) res++;
            num=num>>1;
        }
        return res;
    }

    //如何把二进制的1都变成0，0变成1，就是把二进制整个取反：跟相同长度的1111.。。异或
    public int complement(int num){
        int n=0;
        while(n<num){//构造相同长度的全1序列
            n=(n<<1)|1;
        }
        return (n^num);
    }
}
