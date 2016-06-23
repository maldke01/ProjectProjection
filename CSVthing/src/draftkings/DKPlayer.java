package draftkings;

public class DKPlayer {
	
	private String name;
	private String team;
	
	private double projectedPoints;
	private double cost;
	
	public DKPlayer(String name, String team, Double projectedPoints, 
			Double cost) {
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
