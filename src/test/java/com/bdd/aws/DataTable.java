package com.bdd.aws;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class DataTable {
	// private variables
	private static final String filePath = "src/test/resources/aws/data/data.json";
	// public variables
	Map<String, String> data;
	
	public DataTable(Map<String, String> data) {
		this.data=data;
	}
	// Initial DataTable
	public DataTable() {
		createFile();
		Map<String, String> default_data = Stream.of(
				new String[][] { { "AirbnbTitle", "A Chronicle of Airbnb Architecture Evolution" }, 
					{ "YoutubeTitle", "AWS re:Invent 2018: A Chronicle of Airbnb Architecture Evolution (ARC407)" }})
				.collect(Collectors.toMap(d -> d[0], d -> d[1]));
		writeFile(default_data);
		data = readFile();
	}
	// Read JSON file containing testSuite data
	public Map<String, String> readFile() {
		try {
			ObjectMapper mapper = new ObjectMapper();
			data = mapper.readValue(new File(filePath), new TypeReference<Map<String, String>>() {
			});
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Something went wrong with reading the dataFile");
		}
		return data;
	}
	// Write to data to data.json
	public void writeFile(Map<String, String> data) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
			writer.writeValue(new File(filePath), data);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Something went wrong with writing the dataFile");
		}

	}
	// Update a value or add a new key if it doesnt exist
	public void appendFile(Map<String, String> data) {
		data.forEach((k, v) -> {
			if (k != null) {
				if (this.data.containsKey(k)) {
					this.data.replace(k, v);
				} else
					this.data.putIfAbsent(k, v);
			}
		});
	}
	// Creates data.json if it does not exist
	public void createFile() {
		try {
			File dataFile = new File(filePath);
			if (!dataFile.exists()) {
				dataFile.createNewFile();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Something went wrong with creating the dataFile");
		}
	}
	// Pretty print json
	public void printData() {
		data.forEach((k, v) -> {
			if (k != null)
				System.out.println(k + ": " + v);
		});
	}

	// Getters
	public Map<String, String> getData() {
		return data;
	}
}
