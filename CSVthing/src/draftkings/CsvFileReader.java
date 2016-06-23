package draftkings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFileReader {
	
	//Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	
	//various player attributes index
	private static final int PLAYER_NAME_IDX = 0;
	private static final int PLAYER_TEAM_IDX = 1;
	private static final int PLAYER_PROJECTED_POINTS_IDX = 2;
	private static final int PLAYER_COST_IDX = 3;
	
	public static void readCsvFile(String fileName) {
		
		BufferedReader fileReader = null;
		
		try {
			
			//Create a new list of players to be filled by CSV file 
			//data
			List<DKPlayer> players = new ArrayList<DKPlayer>();
			
			String line = "";
			
			//Create the file reader
			fileReader = new BufferedReader(new FileReader(fileName));
			
			//Read the CSV file header to skip it
			fileReader.readLine();
			
			//Read the file line by line starting from the second line
			while ((line = fileReader.readLine()) != null) {
				//Get all tokens available in line
				String[] tokens = line.split(COMMA_DELIMITER);
				if (tokens.length > 0 && Double.parseDouble(tokens[PLAYER_COST_IDX]) > 0) {
					//Create a new player object and fill his data
					DKPlayer player = new DKPlayer(tokens[PLAYER_NAME_IDX],
							tokens[PLAYER_TEAM_IDX],
							Double.parseDouble(tokens[PLAYER_PROJECTED_POINTS_IDX]),
							Double.parseDouble(tokens[PLAYER_COST_IDX]));
					players.add(player);
				}
			}
			
			//Print the new player list
			for (int i = 0; i < players.size(); i++) {
				System.out.println(players.get(i).toString());
			}
		}
		catch (Exception e) {
			System.out.println("Error in CsvFileReader !!!");
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				System.out.println("Error while closing fileReader !!!");
				e.printStackTrace();
			}
		}
	}
}
