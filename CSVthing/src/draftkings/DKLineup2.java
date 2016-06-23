package draftkings;


public class DKLineup2 {
	//10 players
	//At least 2 different MLB games
	//No more than 5 hitters in one team
	//2 pitchers
	//1 catcher
	//1 FirstBase
	//1 second base
	//1 thirdbase
	//1 shortstop
	//3 outfielders
	
	private DKPlayer2 outfielder1;
	private DKPlayer2 outfielder2;
	private DKPlayer2 outfielder3;
	private DKPlayer2 shortstop;
	private DKPlayer2 thirdBase;
	private DKPlayer2 pitcher1;
	private DKPlayer2 pitcher2;
	private DKPlayer2 catcher;
	private DKPlayer2 firstBase;
	private DKPlayer2 secondBase;

	private double cost;
	private double teamPoints;
	
	public DKLineup2(DKPlayer2 outfielder1, DKPlayer2 outfielder2, DKPlayer2 outfielder3, DKPlayer2 shortstop,
			DKPlayer2 thirdBase, DKPlayer2 pitcher1, DKPlayer2 pitcher2, DKPlayer2 catcher, DKPlayer2 firstBase,
			DKPlayer2 secondBase) {
		super();
		this.outfielder1 = outfielder1;
		this.outfielder2 = outfielder2;
		this.outfielder3 = outfielder3;
		this.shortstop = shortstop;
		this.thirdBase = thirdBase;
		this.pitcher1 = pitcher1;
		this.pitcher2 = pitcher2;
		this.catcher = catcher;
		this.firstBase = firstBase;
		this.secondBase = secondBase;
		setTeamPoints();
		setCost();
	}
	
	
	public void setCost(){
		this.setCost(outfielder1.getCost() + outfielder2.getCost() + outfielder3.getCost() +
				shortstop.getCost() + firstBase.getCost() + secondBase.getCost() +
				thirdBase.getCost() + catcher.getCost() + pitcher1.getCost() + pitcher2.getCost());
	}
	
	public void setTeamPoints(){
		this.setCost(outfielder1.getProjectedPoints() + outfielder2.getProjectedPoints() + outfielder3.getProjectedPoints() +
				shortstop.getProjectedPoints() + firstBase.getProjectedPoints() + secondBase.getProjectedPoints() +
				thirdBase.getProjectedPoints() + catcher.getProjectedPoints() + pitcher1.getProjectedPoints() + pitcher2.getProjectedPoints());
	}
	
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Lineup [qb=" + qb.getName() + 
				", rb1=" + rb1.getName() + ", rb2=" + 
				rb2.getName() + ", wr1=" + wr1.getName() +
				", wr2=" + wr2.getName() + "wr3=" + wr3.getName() +
				"flex=" + flex.getName() + "te=" + te.getName() +
				"dst=" + dst.getName() + "teampoints=" + teamPoints +
				"cost=" + cost + "]";
	}

	public double getTeamPoints() {
		return teamPoints;
	}

	public void setTeamPoints(double teamPoints) {
		
	}
}
