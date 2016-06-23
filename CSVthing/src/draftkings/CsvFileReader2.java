package draftkings;
//Chris and Kevin
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
	private static final int PLAYER_POSITION_IDX = 2;
	private static final int PLAYER_AB_IDX = 3;
	private static final int PLAYER_RUNS_IDX = 4;
	private static final int PLAYER_HRS_IDX = 5;
	private static final int PLAYER_RBI_IDX = 6;
	private static final int PLAYER_SB_IDX = 7;
	private static final int PLAYER_AVE_IDX = 8;
	private static final int PLAYER_OBP_IDX = 9;
	private static final int PLAYER_HITS_IDX = 10;
	private static final int PLAYER_2B_IDX = 11;
	private static final int PLAYER_3B_IDX = 12
	private static final int PLAYER_BB_IDX = 13;
	private static final int PLAYER_SO_IDX = 14;
	private static final int PLAYER_SLG_IDX = 15;
	private static final int PLAYER_OPS_IDX = 16;
	
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
				if (tokens.length > 0) {
					//Create a new player object and fill his data
					DKPlayer player = new DKPlayer(
									  tokens[PLAYER_NAME_IDX],
									  tokens[PLAYER_TEAM_IDX],
									  tokens[PLAYER_POSITION_IDX],
									  Double.parseDouble(tokens[PLAYER_AB_IDX]),
									  Double.parseDouble(tokens[PLAYER_RUNS_IDX]),
									  Double.parseDouble(tokens[PLAYER_HRS_IDX]),
									  Double.parseDouble(tokens[PLAYER_RBI_IDX]),
									  Double.parseDouble(tokens[PLAYER_SB_IDX]),
									  Double.parseDouble(tokens[PLAYER_AVE_IDX]),
									  Double.parseDouble(tokens[PLAYER_OBP_IDX]),
									  Double.parseDouble(tokens[PLAYER_HITS_IDX]),
									  Double.parseDouble(tokens[PLAYER_2B_IDX]),
									  Double.parseDouble(tokens[PLAYER_3B_IDX]),
									  Double.parseDouble(tokens[PLAYER_BB_IDX]),
									  Double.parseDouble(tokens[PLAYER_SO_IDX]),
									  Double.parseDouble(tokens[PLAYER_SLG_IDX]),
									  Double.parseDouble(tokens[PLAYER_OPS_IDX]),
							);
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
