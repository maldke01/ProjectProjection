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
	}
	
	
		this.setTeamPoints();
		this.setCost(qb.getCost() + rb1.getCost() + rb2.getCost() +
				wr1.getCost() + wr2.getCost() + wr3.getCost() +
				te.getCost() + flex.getCost() + dst.getCost());


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

	public DKPlayer getQb() {
		return qb;
	}

	public void setQb(DKPlayer qb) {
		this.qb = qb;
	}

	public DKPlayer getRb1() {
		return rb1;
	}

	public void setRb1(DKPlayer rb1) {
		this.rb1 = rb1;
	}

	public DKPlayer getRb2() {
		return rb2;
	}

	public void setRb2(DKPlayer rb2) {
		this.rb2 = rb2;
	}

	public DKPlayer getWr1() {
		return wr1;
	}

	public void setWr1(DKPlayer wr1) {
		this.wr1 = wr1;
	}

	public DKPlayer getWr2() {
		return wr2;
	}

	public void setWr2(DKPlayer wr2) {
		this.wr2 = wr2;
	}

	public DKPlayer getWr3() {
		return wr3;
	}

	public void setWr3(DKPlayer wr3) {
		this.wr3 = wr3;
	}

	public DKPlayer getFlex() {
		return flex;
	}

	public void setFlex(DKPlayer flex) {
		this.flex = flex;
	}

	public DKPlayer getTe() {
		return te;
	}

	public void setTe(DKPlayer te) {
		this.te = te;
	}

	public DKPlayer getDst() {
		return dst;
	}

	public void setDst(DKPlayer dst) {
		this.dst = dst;
	}

	public double getTeamPoints() {
		return teamPoints;
	}

	public void setTeamPoints(double teamPoints) {
		
	}
}
