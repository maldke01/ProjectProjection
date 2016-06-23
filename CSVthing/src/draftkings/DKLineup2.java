package draftkings;


public class DKLineup {
	
	private DKPlayer qb;
	private DKPlayer rb1;
	private DKPlayer rb2;
	private DKPlayer wr1;
	private DKPlayer wr2;
	private DKPlayer wr3;
	private DKPlayer flex;
	private DKPlayer te;
	private DKPlayer dst;
	private double cost;
	private double teamPoints;
	
	public DKLineup(DKPlayer qb, DKPlayer rb1, DKPlayer rb2,
			DKPlayer wr1, DKPlayer wr2, DKPlayer wr3, 
			DKPlayer flex, DKPlayer te, DKPlayer dst) {
		super();
		this.setQb(qb);
		this.setRb1(rb1);
		this.setRb2(rb2);
		this.setWr1(wr1);
		this.setWr2(wr2);
		this.setWr3(wr3);
		this.setFlex(flex);
		this.setTe(te);
		this.setDst(dst);
		this.setTeamPoints(qb.getProjectedPoints() +
				rb1.getProjectedPoints() + rb2.getProjectedPoints() +
				wr1.getProjectedPoints() + wr2.getProjectedPoints() +
				wr3.getProjectedPoints() + te.getProjectedPoints() +
				flex.getProjectedPoints() + dst.getProjectedPoints());
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
		this.teamPoints = teamPoints;
	}
}
