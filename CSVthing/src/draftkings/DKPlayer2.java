package draftkings;

public class DKPlayer {
	
	private String name;
	private String team;
	private String position;
	
	private double ab;
	private double runs;
	private double hrs;
	private double rbi;
	private double sb;
	private double ave;
	private double obp;
	private double hits;
	private double 2b;
	private double 3b;
	private double bb;
	private double so;
	private double slg;
	private double ops;
	
	public DKPlayer(String name, String team, String position, double ab, double runs, double hrs, double rbi,
					double sb, double ave, double obp, double hits, double 2b, double 3b, double bb, double so,
					double slg, double ops) {
		this.setName(name);
		this.setTeam(team);
		this.setProjectedPoints(projectedPoints);
		this.setCost(cost);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	public double getProjectedPoints() {
		return projectedPoints;
	}

	public void setProjectedPoints(double projectedPoints) {
		this.projectedPoints = projectedPoints;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + 
				", team=" + team + ", projectedPoints=" + 
				projectedPoints + ", cost=" + cost + "]";
	}
}
