public class _Plus {
    /**
     * 输出的第一个true，已经在另外的文章里讲过了。我们直接来看第二个输出。
     * <p>
     * 首先需要再次说一点，字符串常量是编译时候确定的，编译完成，生成class文件，
     * 那就不会再变了。再定义str3的时候，在编译时候，编译器会将字符串常量直接放在一起，
     * 然后查找常量池里面，有没有对应的字符串。 所以str2 和 str3 是相等的，也就是指向相同的内存区域。
     *
     * @param args
     */
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = "abc";
        String str3 = "a" + "b" + "c";
        System.out.println(str1.intern() == str2);   //输出true
        System.out.println(str2 == str3);            //输出true

        test2();
    }

    /**
     * 当+两边连接的是字符串常量时，虚拟机会直接进行优化，看成一个字符串，
     * 当+的一边是引用的时候，虚拟机就会创建StringBuilder，利用append方法进行连接操作。
     * <p>
     * 在定义str4的时候，是用str2+“c“的形式。这个时候str4的值不是编译时候能确定的，
     * 它已经不再会往常量池存放，是一个字符串变量。这个时候，底层是通过StringBuffer的append方法，
     * 最终返回new的string。所以str4的地址只的不是常量池区域的地址，而是指向堆内存中的区域。
     */
    public static void test2() {
        String str1 = "abc";
        String str2 = "ab";
        String str4 = str2 + "c";
        System.out.println(str1 == str4);            //输出false
    }
}
