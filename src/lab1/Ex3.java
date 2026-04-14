package lab1;

public class Ex3 {
    public int countDigit(int num){
        num = Math.abs(num);
        int count =0;
        if(num==0) return 1;
        while (num>0){
            num/=10;
            count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        Ex3 e3 = new Ex3();
        System.out.println(e3.countDigit(-102012));
    }
}
