package org.usfirst.frc.team5587.robot.commandgroups;

import org.usfirst.frc.team5587.robot.Robot;
import org.usfirst.frc.team5587.robot.commands.ClearEncoder;
import org.usfirst.frc.team5587.robot.commands.locomotive.InvertDrive;
import org.usfirst.frc.team5587.robot.commands.locomotive.auto.DutifulProgression;
import org.usfirst.frc.team5587.robot.commands.locomotive.auto.Gyrate;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RedBoilerGear extends CommandGroup {

    public RedBoilerGear() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.
    	requires( Robot.loco );
    	
    	addSequential( new DutifulProgression( -69, 6 ) );
    	addSequential( new ClearEncoder() );
    	addSequential( new Gyrate( -60.0 ) );
    	addSequential( new ClearEncoder() );
    	addSequential( new DutifulProgression( -100, 6 ) );
    	

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
