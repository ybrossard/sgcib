package com.home.log;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileAppenderYBV2 {

	private static final String FILE_DIR = "C:/temp/OutputFile.txt";
	private static final DateTimeFormatter LOGS_DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");

	public FileAppenderYBV2() {
	}

	public static void write(String message) {
		writeFile(LocalDateTime.now().format(LOGS_DATE_FORMAT) + " => " + message);
		writeFile("\n");
	}

	public static void writeLn() {
		writeFile("\n");
	}

	public static void writeFile(String message) {
		try {
			Path path = Paths.get(FILE_DIR);
			OpenOption openOption = path.toFile().exists() ? StandardOpenOption.APPEND : StandardOpenOption.CREATE;
			try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, openOption)) {
				bufferedWriter.write(message);
			}
		} catch (IOException caught) {
			caught.printStackTrace();
		}
	}
}
