package controlStatementProject;
//Faadlilah Ahmad Purwanto-1197050034-C
import java.util.Scanner;

public class leapYearCalculator {
	public static void main(String[] args) {
		int month, year, day=0;
		String month1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Month(1-12): ");
		month = scan.nextInt();
		if(month>=1&&month<=12) {
			month=month;
		}
		else {
			System.out.println("invalid input");
			System.exit(0);
		}
		System.out.println("Enter any Year: ");
    	year = scan.nextInt();
    	month1 = (month % 2 == 0) ? "genap" : "ganjil";
    	switch (month1) {
       	case "genap" :
       		day = 30;
       		break;
       	case "ganjil" :
        	day = 31;
        	break;
    	}
    	boolean isLeap = false;
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }
        if(isLeap==true && month==2) {
            System.out.println(year + " adalah tahun kabisat.");
        	System.out.println(month + " adalah bulan "+month1+" dan memiliki 29 hari.");
        }
        else if(isLeap==true) {
            System.out.println(year + " adalah tahun kabisat.");
        	System.out.println(month + " adalah bulan "+month1+" dan memiliki "+day+" hari.");
        }
        else if(isLeap==false && month==2) {
            System.out.println(year + " bukan tahun kabisat.");
        	System.out.println(month + " adalah bulan "+month1+" dan memiliki 28 hari.");
        }
        else {
        	System.out.println(year + " bukan tahun kabisat.");
        	System.out.println(month + " adalah bulan "+month1+" dan memiliki "+day+" hari.");
        }
	}
}