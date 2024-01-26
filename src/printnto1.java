public class printnto1 {
  /*  static void fun1(int n ){
        for (int i = n; i > 0; i--) {
            System.out.println(+i + " ");
        }

    }*/
    static void fun2(int n ){
        if(n<=0)
        {
            return;
        }
        else{
            System.out.println(n + " ");
            fun2(n-1);
        }


    }



    public static void main(String[] args) {
        int n =10;
        fun2(n);
    }

}
