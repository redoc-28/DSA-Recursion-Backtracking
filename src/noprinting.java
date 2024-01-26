public class noprinting {
    static void fun1()
    {
        System.out.println("1");

    }
    static void fun2(){
        System.out.println("0");
        fun1();
        System.out.println("1");
    }

    public static void main(String[] args) {
        System.out.println("2");
        fun1();
    }
}
