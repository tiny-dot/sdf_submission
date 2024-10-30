package vttp.batch5.sdf.task01;

import java.io.BufferedReader;
import java.io.File;
import java.io.Reader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import vttp.batch5.sdf.task01.models.BikeEntry;

// Use this class as the entry point of your program

public class Main {

	 private Reader reader;
	 private File file;
	 static Map<String, String> map;

	public Reader getReader() {
		return reader;
	}
	public void setReader(Reader reader) {
		this.reader = reader;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;

	}
	private int season;
	private int month;
	private boolean holiday;
	private int weekday;
	private int weather;
	private float temperature;
	private float humidity;
	private float windspeed;
	private int casual;
	private int registered;

	
public Main(Reader reader, File file, int season, int month, boolean holiday, int weekday, int weather,
			float temperature, float humidity, float windspeed, int casual, int registered) {
		this.reader = reader;
		this.file = file;
		this.season = season;
		this.month = month;
		this.holiday = holiday;
		this.weekday = weekday;
		this.weather = weather;
		this.temperature = temperature;
		this.humidity = humidity;
		this.windspeed = windspeed;
		this.casual = casual;
		this.registered = registered;
	}
	
	@Override
	public String toString() {
		return "Main [season=" + season + ", month=" + month + ", holiday="
				+ holiday + ", weekday=" + weekday + ", weather=" + weather + ", temperature=" + temperature
				+ ", humidity=" + humidity + ", windspeed=" + windspeed + ", casual=" + casual + ", registered="
				+ registered + "]";
	}
	
	
	public static void main(String[] args) {
 
        String line;  
        try (Reader r = new FileReader("day.csv");
			BufferedReader br = new BufferedReader(r)) {  
            while ((line = br.readLine()) != null) {   
                String[] lines = line.split(",");  
				for(int i= 0; i<lines.length; i++){
					String season = map.put(lines[9],lines[0]);
					String month = map.put(lines[9],lines[1]);
					String isholiday = map.put(lines[9],lines[2]);
					String weekday = map.put(lines[9],lines[3]);
					String weather = map.put(lines[9],lines[4]);
					String temp = map.put(lines[9],lines[5]);
					String humidity= map.put(lines[9],lines[6]);
					String windspeed=map.put(lines[9],lines[7]);
					String casual=map.put(lines[9],lines[8]);
					List<String> registeredList = new ArrayList<>();
					registeredList.add(lines[9]);
					
					int max= Integer.parseInt(registeredList).max;
                }  
            } br.close();
		        } catch (IOException e) {  
            e.printStackTrace();  
        }  
		}

		
		map.get(max);
	
	

      System.out.println("The " + position + "(position) recorded number of cyclists was in: "+ season +"(season) , on a " +
	   day + "(day) in the month of "+ month + "(month). There were a total of " + total + "(total) cyclists"
	   +". The weather was " + weather + "(weather). " + day + "(day) was "+ holiday + ".");
    }



