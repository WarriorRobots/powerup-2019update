package frc.robot.commands.climb;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Constants;
import frc.robot.Robot;

/**
 * Pulls the rope in, raising the robot off the ground.
 */
public class WinchInwards extends Command {

	@Override
	public void execute() {
		Robot.climb.runWinchAtPercentage(Constants.ShooterRig.WINCH_PERCENT_SPEED);
	}
	
	@Override
	public void end() {
		Robot.climb.stopWinch();
	}
	
	@Override
	protected boolean isFinished() {
		return false;
	}
	
	@Override
	public void interrupted() {
		this.end();
	}
}
