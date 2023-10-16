package main.n1ex1;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		MonthList monthlist = new MonthList();
		
		ArrayList<String> months = monthlist.getMONTHS();
		for (String month : months) {
			System.out.println(month);
		}
	}

}
