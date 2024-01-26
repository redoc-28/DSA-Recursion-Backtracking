public class ropecutting {
    static int cut(int n, int a, int b, int c){
        if (n==0)
            return 0;
        if (n < 0)
            return -1;
        int res =  Math.max(cut(n-a,a,b,c),cut(n-b,a,b,c)
        ,cut(n-c,a,b,c));
    }

    public static void main(String[] args) {
        int n=5,a=2,b=5,c=1;
        System.out.println(cut(n,a,b,c));

}
