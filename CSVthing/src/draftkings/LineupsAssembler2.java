package draftkings;

import java.util.ArrayList;
import java.util.List;

public class LineupsAssembler2 {
	
	public static void assembleLineups(List<DKPlayer> quarterbacks,
			List<DKPlayer> runningbacks, List<DKPlayer> widereceivers,
			List<DKPlayer> tightends, List<DKPlayer> flexplayers,
			List<DKPlayer> defenses) {
		
		DKLineup optimalLineup = new DKLineup(quarterbacks.get(quarterbacks.size() - 1), runningbacks.get(runningbacks.size() - 1), runningbacks.get(runningbacks.size() - 2),
				widereceivers.get(widereceivers.size() - 1), widereceivers.get(widereceivers.size() - 2), widereceivers.get(widereceivers.size() - 3), tightends.get(tightends.size() - 1),
				tightends.get(tightends.size() - 2), defenses.get(defenses.size() - 1));
		
		DKPlayer bestSwitchReplace = new DKPlayer(null, null, 0.0, 0.0);
		DKPlayer bestSwitchWith = new DKPlayer(null, null, 0.0, 0.0);
		String positionBeingSwitched = null;
		double bestswitchvalue = 0;
		boolean bestlineupfound = false;
		boolean viableSwitch = false;
		
		while(bestlineupfound == false) {
			//find best potential quarterback switch
			for (int i = 0; i < quarterbacks.size(); i++) {
				//if one of the quarterbacks is projected more points
				if(quarterbacks.get(i).getProjectedPoints() > optimalLineup.getQb().getProjectedPoints()) {
					if((optimalLineup.getCost() - optimalLineup.getQb().getCost() + quarterbacks.get(i).getCost()) <= 50000) {
						//calculate the value of the switch i.e. (change in points)/(change in cost)
						double switchvalue = (quarterbacks.get(i).getProjectedPoints() - optimalLineup.getQb().getProjectedPoints()) /
								(quarterbacks.get(i).getCost() - optimalLineup.getQb().getCost());
						if (switchvalue > bestswitchvalue) {
							bestSwitchReplace = optimalLineup.getQb();
							bestSwitchWith = quarterbacks.get(i);
							bestswitchvalue = switchvalue;
							positionBeingSwitched = "QB";
							viableSwitch = true;
						}
					}
				}
			}
			//find best potential rb1 switch
			for (int i = 0; i < runningbacks.size(); i++) {
				if(runningbacks.get(i).getProjectedPoints() > optimalLineup.getRb1().getProjectedPoints()) {
					if((runningbacks.get(i) != optimalLineup.getRb2()) &&
							(runningbacks.get(i) != optimalLineup.getFlex()) &&
							((optimalLineup.getCost() - optimalLineup.getRb1().getCost() + runningbacks.get(i).getCost()) <= 50000)) {
						double switchvalue = ((runningbacks.get(i).getProjectedPoints() - optimalLineup.getRb1().getProjectedPoints()) /
								(runningbacks.get(i).getCost() - optimalLineup.getRb1().getCost()));
						if (switchvalue > bestswitchvalue) {
							bestSwitchReplace = optimalLineup.getRb1();
							bestSwitchWith = runningbacks.get(i);
							bestswitchvalue = switchvalue;
							positionBeingSwitched = "RB1";
							viableSwitch = true;
						}
					}
				}
			}
			//find best potential rb2 switch
			for (int i = 0; i < runningbacks.size(); i++) {
				if(runningbacks.get(i).getProjectedPoints() > optimalLineup.getRb2().getProjectedPoints()) {
					if((runningbacks.get(i) != optimalLineup.getRb1()) &&
							(runningbacks.get(i) != optimalLineup.getFlex()) &&
							((optimalLineup.getCost() - optimalLineup.getRb2().getCost() + runningbacks.get(i).getCost()) <= 50000)) {
						double switchvalue = ((runningbacks.get(i).getProjectedPoints() - optimalLineup.getRb2().getProjectedPoints()) /
								(runningbacks.get(i).getCost() - optimalLineup.getRb2().getCost()));
						if (switchvalue > bestswitchvalue) {
							bestSwitchReplace = optimalLineup.getRb2();
							bestSwitchWith = runningbacks.get(i);
							bestswitchvalue = switchvalue;
							positionBeingSwitched = "RB2";
							viableSwitch = true;
						}
					}
				}
			}
			//find best potential wr1 switch
			for (int i = 0; i < widereceivers.size(); i++) {
				if(widereceivers.get(i).getProjectedPoints() > optimalLineup.getWr1().getProjectedPoints()) {
					if((widereceivers.get(i) != optimalLineup.getWr2()) &&
							(widereceivers.get(i) != optimalLineup.getWr3()) &&
							(widereceivers.get(i) != optimalLineup.getFlex()) &&
							((optimalLineup.getCost() - optimalLineup.getWr1().getCost() + widereceivers.get(i).getCost()) <= 50000)) {
						double switchvalue = ((widereceivers.get(i).getProjectedPoints() - optimalLineup.getWr1().getProjectedPoints()) /
								(widereceivers.get(i).getCost() - optimalLineup.getWr1().getCost()));
						if (switchvalue > bestswitchvalue) {
							bestSwitchReplace = optimalLineup.getWr1();
							bestSwitchWith = widereceivers.get(i);
							bestswitchvalue = switchvalue;
							positionBeingSwitched = "WR1";
							viableSwitch = true;
						}
					}
				}
			}
			//find best potential wr2 switch
			for (int i = 0; i < widereceivers.size(); i++) {
				if(widereceivers.get(i).getProjectedPoints() > optimalLineup.getWr2().getProjectedPoints()) {
					if((widereceivers.get(i) != optimalLineup.getWr1()) &&
							(widereceivers.get(i) != optimalLineup.getWr3()) &&
							(widereceivers.get(i) != optimalLineup.getFlex()) &&
							((optimalLineup.getCost() - optimalLineup.getWr2().getCost() + widereceivers.get(i).getCost()) <= 50000)) {
						double switchvalue = ((widereceivers.get(i).getProjectedPoints() - optimalLineup.getWr2().getProjectedPoints()) /
								(widereceivers.get(i).getCost() - optimalLineup.getWr2().getCost()));
						if (switchvalue > bestswitchvalue) {
							bestSwitchReplace = optimalLineup.getWr2();
							bestSwitchWith = widereceivers.get(i);
							bestswitchvalue = switchvalue;
							positionBeingSwitched = "WR2";
							viableSwitch = true;
						}
					}
				}
			}
			//find best potential wr3 switch
			for (int i = 0; i < widereceivers.size(); i++) {
				if(widereceivers.get(i).getProjectedPoints() > optimalLineup.getWr3().getProjectedPoints()) {
					if((widereceivers.get(i) != optimalLineup.getWr1()) &&
							(widereceivers.get(i) != optimalLineup.getWr2()) &&
							(widereceivers.get(i) != optimalLineup.getFlex()) &&
							((optimalLineup.getCost() - optimalLineup.getWr3().getCost() + widereceivers.get(i).getCost()) <= 50000)) {
						double switchvalue = ((widereceivers.get(i).getProjectedPoints() - optimalLineup.getWr3().getProjectedPoints()) /
								(widereceivers.get(i).getCost() - optimalLineup.getWr3().getCost()));
						if (switchvalue > bestswitchvalue) {
							bestSwitchReplace = optimalLineup.getWr3();
							bestSwitchWith = widereceivers.get(i);
							bestswitchvalue = switchvalue;
							positionBeingSwitched = "WR3";
							viableSwitch = true;
						}
					}
				}
			}
			//find best potential flex switch
			for (int i = 0; i < flexplayers.size(); i++) {
				if(flexplayers.get(i).getProjectedPoints() > optimalLineup.getFlex().getProjectedPoints()) {
					if((flexplayers.get(i) != optimalLineup.getRb1()) &&
							(flexplayers.get(i) != optimalLineup.getRb2()) &&
							(flexplayers.get(i) != optimalLineup.getWr1()) &&
							(flexplayers.get(i) != optimalLineup.getWr2()) &&
							(flexplayers.get(i) != optimalLineup.getWr3()) &&
							(flexplayers.get(i) != optimalLineup.getTe()) &&
							((optimalLineup.getCost() - optimalLineup.getFlex().getCost() + flexplayers.get(i).getCost()) <= 50000)) {
						double switchvalue = ((flexplayers.get(i).getProjectedPoints() - optimalLineup.getFlex().getProjectedPoints()) /
								(flexplayers.get(i).getCost() - optimalLineup.getFlex().getCost()));
						if (switchvalue > bestswitchvalue) {
							bestSwitchReplace = optimalLineup.getFlex();
							bestSwitchWith = flexplayers.get(i);
							bestswitchvalue = switchvalue;
							positionBeingSwitched = "FLEX";
							viableSwitch = true;
						}
					}
				}
			}
			//find best potential te switch
			for (int i = 0; i < tightends.size(); i++) {
				if(tightends.get(i).getProjectedPoints() > optimalLineup.getTe().getProjectedPoints()) {
					if((tightends.get(i) != optimalLineup.getFlex()) &&
							((optimalLineup.getCost() - optimalLineup.getTe().getCost() + tightends.get(i).getCost()) <= 50000)) {
						double switchvalue = ((tightends.get(i).getProjectedPoints() - optimalLineup.getTe().getProjectedPoints()) /
								(tightends.get(i).getCost() - optimalLineup.getTe().getCost()));
						if (switchvalue > bestswitchvalue) {
							bestSwitchReplace = optimalLineup.getTe();
							bestSwitchWith = tightends.get(i);
							bestswitchvalue = switchvalue;
							positionBeingSwitched = "TE";
							viableSwitch = true;
						}
					}
				}
			}
			//find best potential def switch
			for (int i = 0; i < defenses.size(); i++) {
				if(defenses.get(i).getProjectedPoints() > optimalLineup.getDst().getProjectedPoints()) {
					if((optimalLineup.getCost() - optimalLineup.getDst().getCost() + defenses.get(i).getCost()) <= 50000) {
						double switchvalue = ((defenses.get(i).getProjectedPoints() - optimalLineup.getDst().getProjectedPoints()) /
								(defenses.get(i).getCost() - optimalLineup.getDst().getCost()));
						if (switchvalue > bestswitchvalue) {
							bestSwitchReplace = optimalLineup.getDst();
							bestSwitchWith = defenses.get(i);
							bestswitchvalue = switchvalue;
							positionBeingSwitched = "DEF";
							viableSwitch = true;
						}
					}
				}
			}
			//at this point we should have the best possible single player switch currently available
			//swapping bestSwitchReplace with bestSwitchWith so we will make the switch and then the while loop will continue
			System.out.println("Replacing: " + bestSwitchReplace.getName() + " with " + bestSwitchWith.getName() + "\n" +
			"Position: " + positionBeingSwitched + "\n" + "Switch Value: " + bestswitchvalue + "\n");
			if (viableSwitch == true) {
				switch(positionBeingSwitched) {
					case "QB":		optimalLineup.setQb(bestSwitchWith);
									break;
					case "RB1":		optimalLineup.setRb1(bestSwitchWith);
									break;
					case "RB2":		optimalLineup.setRb2(bestSwitchWith);
									break;
					case "WR1":		optimalLineup.setWr1(bestSwitchWith);
									break;
					case "WR2":		optimalLineup.setWr2(bestSwitchWith);
									break;
					case "WR3":		optimalLineup.setWr3(bestSwitchWith);
									break;
					case "TE":		optimalLineup.setTe(bestSwitchWith);
									break;
					case "FLEX":	optimalLineup.setFlex(bestSwitchWith);
									break;
					case "DEF":		optimalLineup.setDst(bestSwitchWith);
									break;
					default:		System.out.println("no valid position passed to switch, no player switched" + "\n");
									break;
				}
				viableSwitch = false;
				bestswitchvalue = 0;
				optimalLineup.setCost(optimalLineup.getQb().getCost() + optimalLineup.getRb1().getCost() + optimalLineup.getRb2().getCost() +
						optimalLineup.getWr1().getCost() + optimalLineup.getWr2().getCost() + optimalLineup.getWr3().getCost() +
						optimalLineup.getFlex().getCost() + optimalLineup.getTe().getCost() + optimalLineup.getDst().getCost());
			} else {
				System.out.println("No viable switch, optimization process complete.");
				bestlineupfound = true;
			}
		}
		
		System.out.println("The optimal lineup is:" + "\n" +
		optimalLineup.getQb() + "\n" +
		", " + optimalLineup.getRb1() + "\n" +
		", " + optimalLineup.getRb2() + "\n" +
		", " + optimalLineup.getWr1() + "\n" +
		", " + optimalLineup.getWr2() + "\n" +
		", " + optimalLineup.getWr3() + "\n" +
		", " + optimalLineup.getFlex() + "\n" +
		", " + optimalLineup.getTe() + "\n" +
		", " + optimalLineup.getDst());
		
	}
	
}
