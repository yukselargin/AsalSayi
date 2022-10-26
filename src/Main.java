public class Main {
    public static void main(String[] args) {
        int prime=0;
        for(int i=2;i<=100;i++){
            for(int k=2;k<=i;k++) {
                if (i % k == 0) {
                    prime += k;
                }
            }
            if(prime==i){
                System.out.print(prime+",");
            }
            prime=0;
        }
    }
}