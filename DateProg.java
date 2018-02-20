/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek Ojha
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateProg {
    

 		public static void main(String args[]) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String inDate1 = sc.nextLine();
		String inDate2 = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fromDate = sdf.parse(inDate1);
		Date toDate = sdf.parse(inDate2);
		
		changeDate(fromDate,toDate);
	}

	public static void changeDate(Date fromDate, Date toDate) {

		int fDt = fromDate.getDate();
		int fMnt = fromDate.getMonth()+1;
		int fYr = fromDate.getYear();
		fromDate.setDate(01);
		
		

		int toDt=toDate.getDate();
		int toMnt = toDate.getMonth()+1;
		int toYr = toDate.getYear();

		if (toMnt == 2) {
			if (toYr % 4 == 0 && toYr % 100 != 0 || toYr % 400 == 0) {
				toDate.setDate(29);
			} else {
				toDate.setDate(28);
			}
		}
		
		else if(toMnt==1||toMnt==3||toMnt==5||toMnt==7||toMnt==8||toMnt==10||toMnt==12) {
			toDate.setDate(31);
		}
		else {
			toDate.setDate(30);
		}
		
		System.out.println(fromDate);
		System.out.println(toDate);

	}
}