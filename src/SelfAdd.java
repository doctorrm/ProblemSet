public class SelfAdd {
    public static void main(String[] args) {
        int i = 1;
        i = i++;//i==1。 如果是换成i++这样i就变成了2了
        System.out.println(i);//输出1
        System.out.println(i++);//输出1
        System.out.println(i);//输出2
        System.out.println(++i);//输出3
    }
}
