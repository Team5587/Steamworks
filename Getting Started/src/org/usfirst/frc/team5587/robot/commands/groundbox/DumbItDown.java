package org.usfirst.frc.team5587.robot.commands.groundbox;

import org.usfirst.frc.team5587.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DumbItDown extends Command {

    public DumbItDown() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires( Robot.groundbox );
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.groundbox.dumbItDown();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.groundbox.stopGrind();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
