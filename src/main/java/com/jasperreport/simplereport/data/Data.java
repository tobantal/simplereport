package com.jasperreport.simplereport.data;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Data {
	private String ny = "New York";
	private String wn = "Washington";
	private String fl = "Florida";
	private String pc = "Notebook";
	private String dvd = "DVD";
	private String book = "Book";
	private String phone = "Phone";

	public ArrayList<DataBean> getDataBeanList() {
		ArrayList<DataBean> dataBeanList = new ArrayList<DataBean>();

		dataBeanList.add(new DataBean(ny, pc, date(1), 1, 500));
		dataBeanList.add(new DataBean(ny, dvd, date(1), 5, 30));
		dataBeanList.add(new DataBean(ny, dvd, date(3), 2, 45));
		dataBeanList.add(new DataBean(ny, dvd, date(5), 4, 36));
		dataBeanList.add(new DataBean(ny, dvd, date(18), 5, 41));
		dataBeanList.add(new DataBean(ny, book, date(8), 2, 11));
		dataBeanList.add(new DataBean(ny, book, date(15), 8, 9));
		dataBeanList.add(new DataBean(ny, book, date(21), 6, 14));
		dataBeanList.add(new DataBean(ny, phone, date(16), 1, 200));
		dataBeanList.add(new DataBean(ny, phone, date(22), 2, 520));

		dataBeanList.add(new DataBean(wn, pc, date(15), 1, 610));
		dataBeanList.add(new DataBean(wn, dvd, date(8), 4, 40));
		dataBeanList.add(new DataBean(wn, dvd, date(16), 6, 35));
		dataBeanList.add(new DataBean(wn, dvd, date(23), 3, 46));
		dataBeanList.add(new DataBean(wn, dvd, date(28), 2, 42));
		dataBeanList.add(new DataBean(wn, book, date(11), 3, 12));
		dataBeanList.add(new DataBean(wn, book, date(17), 9, 8));
		dataBeanList.add(new DataBean(wn, book, date(26), 4, 14));
		dataBeanList.add(new DataBean(wn, book, date(29), 5, 10));
		dataBeanList.add(new DataBean(wn, phone, date(12), 2, 210));
		dataBeanList.add(new DataBean(wn, phone, date(29), 1, 380));

		dataBeanList.add(new DataBean(fl, pc, date(3), 1, 460));
		dataBeanList.add(new DataBean(fl, dvd, date(1), 3, 49));
		dataBeanList.add(new DataBean(fl, dvd, date(8), 4, 32));
		dataBeanList.add(new DataBean(fl, dvd, date(17), 2, 47));
		dataBeanList.add(new DataBean(fl, book, date(5), 4, 11));
		dataBeanList.add(new DataBean(fl, book, date(16), 8, 6));
		dataBeanList.add(new DataBean(fl, book, date(23), 6, 16));
		dataBeanList.add(new DataBean(fl, book, date(28), 3, 18));
		dataBeanList.add(new DataBean(fl, phone, date(12), 2, 190));
		dataBeanList.add(new DataBean(fl, phone, date(18), 1, 250));
		dataBeanList.add(new DataBean(fl, phone, date(26), 1, 201));

		return dataBeanList;
	}

	private Date date(int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2017);
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_MONTH, day);
		return calendar.getTime();
	}
}