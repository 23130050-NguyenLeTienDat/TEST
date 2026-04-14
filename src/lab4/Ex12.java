package lab4;

public class Ex12 {
    public String format(String primeString){
        String[] split= primeString.split("/");
        String day = split[0];
        String month = split[1];
        String year = split[2];

        String nMonth="";
        switch (month){
            case "1":
                nMonth = "January ";
                break;
            case "2":
                nMonth = "February ";
                break;
            case "3":
                nMonth = "March";
                break;
            case "4":
                nMonth = "April";
                break;
            case "5":
                nMonth = "May";
                break;
            case "6":
                nMonth = "June";
                break;
            case "7":
                nMonth = "July";
                break;
            case "8":
                nMonth = "August";
                break;
            case "9":
                nMonth = "September";
                break;
            case "10":
                nMonth = "October";
                break;
            case "11":
                nMonth = "November";
                break;
            case "12":
                nMonth = "December";
                break;
        }
        return day + " " + nMonth + " " + year;
    }

    public static void main(String[] args) {
        String text = "05/12/2005";
        Ex12 ex12 = new Ex12();
        System.out.println(ex12.format(text));

    }
}
