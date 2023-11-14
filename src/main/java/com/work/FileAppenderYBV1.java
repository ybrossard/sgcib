package com.work;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileAppenderYBV1 {

	private static final String FILE = "C:/temp/OutputFile.txt";
	private static final SimpleDateFormat FORMAT_DATE_LOGS = new SimpleDateFormat("dd/MM/yyyy - HH':'mm':'ss");

	private FileAppenderYBV1() {
	}

	public static void write(String message) {
		try {
			FileWriter fileWriter = new FileWriter(FILE, true);
			fileWriter.write(FORMAT_DATE_LOGS.format(new java.util.Date()) + " => " + message);
			fileWriter.write("\n");
			fileWriter.close();
		} catch (IOException caught) {
			caught.printStackTrace();
		}
	}
}
