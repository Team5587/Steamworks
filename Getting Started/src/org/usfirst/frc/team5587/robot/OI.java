// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team5587.robot;

import org.usfirst.frc.team5587.robot.commandgroups.TeleOp;
import org.usfirst.frc.team5587.robot.commands.groundbox.Hunger;
import org.usfirst.frc.team5587.robot.commands.groundbox.Regret;
import org.usfirst.frc.team5587.robot.commands.groundbox.GroundManual;
import org.usfirst.frc.team5587.robot.commands.groundbox.Digest;
import org.usfirst.frc.team5587.robot.commands.groundbox.ResetEncArm;
import org.usfirst.frc.team5587.robot.commands.groundbox.Succ;
import org.usfirst.frc.team5587.robot.commands.groundbox.UpdateArmPID;
import org.usfirst.frc.team5587.robot.commands.groundbox.Vomit;
import org.usfirst.frc.team5587.robot.commands.locomotive.InvertDrive;
import org.usfirst.frc.team5587.robot.commands.locomotive.auto.DutifulProgression;
import org.usfirst.frc.team5587.robot.commands.winchester.Climb;
import org.usfirst.frc.team5587.robot.commands.winchester.Unwind;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI
{
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Button screw, climb, unwind, invert, backOff, teleOp, intake, toss, hunger, digest, regret, vomit;
    public Joystick driver, codriver;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        driver = new Joystick( RobotMap.DRIVER );
        codriver = new Joystick( RobotMap.CODRIVER );
        
        climb = new JoystickButton( driver, RobotMap.CLIMB_BUTTON );
        unwind = new JoystickButton( driver, RobotMap.UNWIND_BUTTON );
        invert = new JoystickButton( driver, RobotMap.INVERT_BUTTON );
        backOff = new JoystickButton( driver, RobotMap.BACK_OFF_BUTTON );
        //teleOp = new JoystickButton( driver, RobotMap.TELE_OPERATED_BUTTON );
        hunger = new JoystickButton( driver, RobotMap.HUNGER_BUTTON );
        digest = new JoystickButton( driver, RobotMap.DIGEST_BUTTON );
        regret = new JoystickButton( driver, RobotMap.REGRET_BUTTON );
        vomit = new JoystickButton( driver, RobotMap.VOMIT_BUTTON );

        climb.toggleWhenPressed( new Climb() );
        unwind.toggleWhenPressed( new Unwind() );
        invert.whenPressed( new InvertDrive() );
        backOff.whenPressed( new DutifulProgression( 8 ) );
        //teleOp.whenPressed( new TeleOp( driver, codriver ) );
        
        hunger.whenPressed( new Hunger());
        digest.whenPressed( new Digest());
        regret.whenPressed( new Regret());
        vomit.whenPressed( new Vomit());
        

        // SmartDashboard Buttons
        
        SmartDashboard.putData( "Succ", new Succ());
        SmartDashboard.putData( "Vomit", new Vomit());
        SmartDashboard.putData( "Hunger", new Hunger());
        SmartDashboard.putData( "Digest", new Digest());
        SmartDashboard.putData( "Digest", new Regret());

        SmartDashboard.putData( "Reset Arm", new ResetEncArm());
        SmartDashboard.putData( "Run Arm", new GroundManual());
        SmartDashboard.putData( "Update PID", new UpdateArmPID());


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
