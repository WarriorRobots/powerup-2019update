package frc.robot.commands.autonomous.routines.unfinished;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class MidtoRightScale extends CommandGroup {
	
	public MidtoRightScale() {
		DriverStation.reportError("Unfinished Auto Case "
				+ this.getName()
				+ ", robot will CrossLine instead", false);
				//TODO
				//new CrossLine().start();
	}

}