package org.usfirst.frc.team5587.robot.commands.groundbox;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team5587.robot.Robot;
import org.usfirst.frc.team5587.robot.subsystems.GroundBox;

/**
 *
 */
public class Succ extends Command {

	private GroundBox groundbox;

    public Succ() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	groundbox = Robot.groundbox;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	groundbox.succ();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !groundbox.hasGear();
    }

    // Called once after isFinished returns true
    protected void end() {
    	groundbox.stopRolling();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
