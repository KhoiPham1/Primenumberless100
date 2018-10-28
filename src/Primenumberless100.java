

public class Primenumberless100 {
    public static void main(String[] args) {
            for (int a =2;a<100;a++){
                boolean prime = true;
                for (int i = 2; i<(a-1);i++){
                    if (a%i==0){
                        prime = false;
                    }
                }
                if (prime){
                    System.out.println(a);
                }
            }
    }
}
