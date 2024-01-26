public class Naturalno {
    static int getsum(int n) {
        if (n == 0){
            return 0;
    }

        return n+getsum(n-1);
    }

    public static void main(String[] args) {
        System.out.println(getsum(8));
    }

}
