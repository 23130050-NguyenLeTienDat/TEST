package lab1;

public class Ex1 {
    public int roundNumber(float num){
        double result = num- (int)num;
        if(num>0) {
            if (result >= 0.5) {
                return (int) num + 1;
            } else {
                return (int) num;
            }
        }else {
            if (result <= -0.5) {
                return (int) num - 1;
            } else {
                return (int) num;
            }
        }
    }

    public static void main(String[] args) {
        Ex1 e = new Ex1();
        System.out.println(e.roundNumber(-1.6f));
    }
}
