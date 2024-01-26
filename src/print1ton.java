public class print1ton {
    static void fun1(int n){
        if( n == 0) {
            return;
        }
        else {
            fun1(n-1);
            System.out.println(n +" ");

        }
    }

    public static void main(String[] args) {
        int n = 10;
        fun1(10);
    }
}
