package lab1;

public class Ex2 {
    public static boolean check(int num){
        if(num%2 ==0) {
            return true;// tra ve tru neu la so chan
        }else{
            return false;// tra ve false neu la so le
        }
    }
    public boolean isPrime(int n){
        if(n <2) return false;
        for(int i =2; i<= Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Ex2 e2 = new Ex2();
        System.out.println(e2.check(4));
        System.out.println(e2.isPrime(17));
    }
}
