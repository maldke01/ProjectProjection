package draftkings;

public class LineupFinder2 {
	
	public static void main(String[] args) {
		
		String QBfile = "c:/temp/QBfile.csv";//input player file here
		String RBfile = "c:/temp/RBfile.csv";
		String WRfile = "c:/temp/WRfile.csv";
		String TEfile = "c:/temp/TEfile.csv";
		String DSTfile = "c:/temp/DSTfile.csv";
		
		System.out.println("\nRead CSV file:");
		PlayerParser.parsePlayers(QBfile, RBfile, WRfile, TEfile, DSTfile);
	}

}
