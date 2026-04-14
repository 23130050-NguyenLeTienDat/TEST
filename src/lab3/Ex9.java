package lab3;

public class Ex9 {
    public String format(int num){
        String sNum = Integer.toString(num);
        StringBuilder sb = new StringBuilder(sNum);
        int count  =0;
        int i = sNum.length();
        while(i>1){
            i--;
            count++;
            if(count ==3){
                sb.insert(i,",");
                count =0;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Ex9 ex9 = new Ex9();
        System.out.println((ex9.format(12345678)));
    }
}
