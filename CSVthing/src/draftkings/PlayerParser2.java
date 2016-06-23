package draftkings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlayerParser {
	
	//Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	
	//various player attributes index
	private static final int PLAYER_NAME_IDX = 0;
	private static final int PLAYER_TEAM_IDX = 1;
	private static final int PLAYER_PROJECTED_POINTS_IDX = 2;
	private static final int PLAYER_COST_IDX = 3;
	
	public static void parsePlayers(String qBFile, String rBFile, String wRFile, String tEFile, String dSTFile) {
		
		BufferedReader fileReader = null;
		
		try {
			
			//Create a new list of players to be filled by CSV file 
			//data
			List<DKPlayer> quarterBacks = new ArrayList<DKPlayer>();
			List<DKPlayer> runningBacks = new ArrayList<DKPlayer>();
			List<DKPlayer> wideReceivers = new ArrayList<DKPlayer>();
			List<DKPlayer> tightEnds = new ArrayList<DKPlayer>();
			List<DKPlayer> flexPlayers = new ArrayList<DKPlayer>();
			List<DKPlayer> defenses = new ArrayList<DKPlayer>();
			
			String line = "";
			
			//Create the file reader
			fileReader = new BufferedReader(new FileReader(qBFile));
			
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
					quarterBacks.add(player);
				}
			}
			
			//Print the new player list
			for (int i = 0; i < quarterBacks.size(); i++) {
				System.out.println(quarterBacks.get(i).toString());
			}
			
			//Create the file reader
			fileReader = new BufferedReader(new FileReader(rBFile));
			
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
					runningBacks.add(player);
					flexPlayers.add(player);
				}
			}
			
			//Print the new player list
			for (int i = 0; i < runningBacks.size(); i++) {
				System.out.println(runningBacks.get(i).toString());
			}
			
			//Create the file reader
			fileReader = new BufferedReader(new FileReader(wRFile));
			
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
					wideReceivers.add(player);
					flexPlayers.add(player);
				}
			}
			
			//Print the new player list
			for (int i = 0; i < wideReceivers.size(); i++) {
				System.out.println(wideReceivers.get(i).toString());
			}
			
			//Create the file reader
			fileReader = new BufferedReader(new FileReader(tEFile));
			
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
					tightEnds.add(player);
					flexPlayers.add(player);
				}
			}
			
			//Print the new player list
			for (int i = 0; i < tightEnds.size(); i++) {
				System.out.println(tightEnds.get(i).toString());
			}
			
			//Create the file reader
			fileReader = new BufferedReader(new FileReader(dSTFile));
			
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
					defenses.add(player);
				}
			}
			
			//Print the new player list
			for (int i = 0; i < defenses.size(); i++) {
				System.out.println(defenses.get(i).toString());
			}
			
			LineupsAssembler.assembleLineups(quarterBacks, runningBacks, wideReceivers, tightEnds, flexPlayers, defenses);
			
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