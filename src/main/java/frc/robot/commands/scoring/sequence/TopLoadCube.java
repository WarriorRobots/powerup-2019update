package frc.robot.commands.scoring.sequence;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.Constants;
import frc.robot.commands.scoring.StopAllScoringMotors;
import frc.robot.commands.scoring.feed.RunFeedAtPercentage;
import frc.robot.commands.scoring.shooter.RunShooterAtPercentage;

/**
 * Push cube downwards, away from shooter wheels.
 */
public class TopLoadCube extends CommandGroup {

	public TopLoadCube() {
		addParallel(new RunShooterAtPercentage(-Constants.ShooterRig.SHOOTER_PERCENT_SPEED));
		addParallel(new RunFeedAtPercentage(-Constants.ShooterRig.FEED_PERCENT_SPEED));
	}

	@Override
	protected boolean isFinished() {
		return false;
	}
	
	@Override
	protected void end() {
		Scheduler.getInstance().add(new StopAllScoringMotors());
	}
	
	@Override
	protected void interrupted() {
		this.end();
	}

}
