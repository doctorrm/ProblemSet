public class Extends {
    class Super {
        int flag = 1;

        Super() {
            test();
        }

        void test() {
            System.out.println("Super.test() flag=" + flag);//不会输出
        }
    }

    class Sub extends Super {
        Sub(int i) {
            flag = i;
            System.out.println("Sub.sub() flag=" + flag);
        }

        void test() {
            System.out.println("Sub.test() flag=" + flag);
        }
    }

    /*输出：
    Sub.test() flag=1
    Sub.sub() flag=5
     */
    public static void main(String[] args) {
        new Extends().new Sub(5);//先执行父类构造方法和flag=1，因为子类重写了test()，所以父类中调用的其实是子类的方法。然后再执行子类的构造方法，输出flag=5；
    }


}
