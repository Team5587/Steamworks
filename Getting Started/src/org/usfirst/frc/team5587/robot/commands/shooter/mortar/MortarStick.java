package org.usfirst.frc.team5587.robot.commands.shooter.mortar;

import org.usfirst.frc.team5587.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Used to drive the flywheel directly using the joystick.
 * Also prints out the readings on the encoder.
 */
public class MortarStick extends Command {

	private Joystick stick;
	
    public MortarStick( Joystick j ) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires( Robot.mortar );
    	
    	stick = j;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.mortar.spin( stick.getY() );
    	SmartDashboard.putNumber( "Encoder RPS", Robot.mortar.rps() );
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}