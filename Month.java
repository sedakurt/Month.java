package month;

/*
Overloading
 */

public class Month {

    public  static String getMonth(int month){
        switch (month){
            case 1: return "Ocak";
            case 2: return "Şubat";
            case 3: return "Mart";
            case 4: return "Nisan";
            case 5: return "Mayıs";
            case 6: return "Haziran";
            case 7: return "Temmuz";
            case 8: return "Ağustos";
            case 9: return "Eylül";
            case 10: return "Ekim";
            case 11: return "Kasım";
            case 12: return "Aralık";
            default: return "Invalid month. Please enter a value between 1 and 12";
        }
    }
    public static int getMonth(String month){
        switch(month){
            case "Ocak": return 1;
            case "Şubat": return 2;
            case "Mart": return 3;
            case "Nisan": return 4;
            case "Mayıs": return 5;
            case "Haziran": return 6;
            case "Temmuz": return 7;
            case "Ağustos": return 8;
            case "Eylül": return 9;
            case "Ekim": return 10;
            case "Kasım": return 11;
            case "Aralık": return 12;
            default: return -1;
        }
    }

}
