package lab3;

public class Ex8 {
    public byte[] xor1(byte[] data, byte key){
        byte[] res = new byte[data.length];
        for(int i = 0;i<data.length;i++){
            res[i] = (byte) (data[i] ^ key);
        }
        return res;
    }


    public static void main(String[] args) {
        String data = "Con cho cao bang bo pc";
        String pass = "Alo vu a em";
        byte key = 1;
        Ex8 ex8= new Ex8();
        byte[] kqua = ex8.xor1(data.getBytes(),key);
        System.out.println("Ma hoa:  " + new String(kqua));
        byte[] decrypted = ex8.xor1(kqua, key);
        System.out.println("Giải mã: " + new String(decrypted));
    }
}
