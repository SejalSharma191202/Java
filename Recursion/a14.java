public class a14 {
    public static void a(int n){
        if(n==0) return;
        System.out.print(n+" ");
        a(n-1);
        System.out.print(n+" ");
        a(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=4;
        a(n);
    }
}
