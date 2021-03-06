package org.usfirst.frc.team5587.robot.commands.groundbox;

import org.usfirst.frc.team5587.robot.Robot;
import org.usfirst.frc.team5587.robot.subsystems.GroundBox;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class Vomit extends TimedCommand {

	private GroundBox groundbox;

    public Vomit() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	super(0.25);
    	groundbox = Robot.groundbox;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	groundbox.rollOut();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
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
