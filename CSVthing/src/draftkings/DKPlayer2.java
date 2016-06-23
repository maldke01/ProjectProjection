package draftkings;

public class DKPlayer2 {

	private String name;
	private String team;
	private String position;
	private double projectedPoints;
	private double cost;

	private double ab;
	private double runs;
	private double hrs;
	private double rbi;
	private double sb;
	private double ave;
	private double obp;
	private double hits;
	private double dubs;
	private double trips;
	private double bb;
	private double so;
	private double slg;
	private double ops;

	public DKPlayer2(String name, String team, String position, double ab, double runs, double hrs, double rbi,
			double sb, double ave, double obp, double hits, double dubs, double trips, double bb, double so, double slg,
			double ops) {
		this.name = name;
		this.team = team;
		this.position = position;
		this.ab = ab;
		this.runs = runs;
		this.hrs = hrs;
		this.rbi = rbi;
		this.sb = sb;
		this.ave = ave;
		this.obp = obp;
		this.hits = hits;
		this.dubs = dubs;
		this.trips = trips;
		this.bb = bb;
		this.so = so;
		this.slg = slg;
		this.ops = ops;
	}

	public String getName() {
		return name;
	}

	public String getTeam() {
		return team;
	}

	public String getPosition() {
		return position;
	}

	public double getProjectedPoints() {
		return projectedPoints;
	}

	public double getCost() {
		return cost;
	}

	public double getAb() {
		return ab;
	}

	public double getRuns() {
		return runs;
	}

	public double getHrs() {
		return hrs;
	}

	public double getRbi() {
		return rbi;
	}

	public double getSb() {
		return sb;
	}

	public double getAve() {
		return ave;
	}

	public double getObp() {
		return obp;
	}

	public double getHits() {
		return hits;
	}

	public double getDubs() {
		return dubs;
	}

	public double getTrips() {
		return trips;
	}

	public double getBb() {
		return bb;
	}

	public double getSo() {
		return so;
	}

	public double getSlg() {
		return slg;
	}

	public double getOps() {
		return ops;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setProjectedPoints(double projectedPoints) {
		this.projectedPoints = projectedPoints;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setAb(double ab) {
		this.ab = ab;
	}

	public void setRuns(double runs) {
		this.runs = runs;
	}

	public void setHrs(double hrs) {
		this.hrs = hrs;
	}

	public void setRbi(double rbi) {
		this.rbi = rbi;
	}

	public void setSb(double sb) {
		this.sb = sb;
	}

	public void setAve(double ave) {
		this.ave = ave;
	}

	public void setObp(double obp) {
		this.obp = obp;
	}

	public void setHits(double hits) {
		this.hits = hits;
	}

	public void setDubs(double dubs) {
		this.dubs = dubs;
	}

	public void setTrips(double trips) {
		this.trips = trips;
	}

	public void setBb(double bb) {
		this.bb = bb;
	}

	public void setSo(double so) {
		this.so = so;
	}

	public void setSlg(double slg) {
		this.slg = slg;
	}

	public void setOps(double ops) {
		this.ops = ops;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", team=" + team + ", projectedPoints=" + projectedPoints + ", cost=" + cost
				+ "]";
	}
}
