package org.usfirst.frc.team5587.robot.subsystems;

import org.usfirst.frc.team5587.robot.RobotMap;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 *
 */
public class Winch extends PIDSubsystem {
	
	private final VictorSP winchMotor = new VictorSP(RobotMap.WINCH_MOTOR);
	private boolean encDir = true; //Encoder Direction
<<<<<<< HEAD
	private final Encoder winchEnc =  new Encoder(RobotMap.WINCH_ENCODER_A, RobotMap.WINCH_ENCODER_B, encDir, EncodingType.k4X);
	
	public Winch() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PID
        super("PIDWinch", 0.1, 0.0, 0.0);
        winchEnc.setDistancePerPulse( 0.2317 );
        winchEnc.setPIDSourceType(PIDSourceType.kDisplacement);
        setAbsoluteTolerance(1.0);
        getPIDController().setContinuous(false);
        LiveWindow.addActuator("Winch", "PIDSubsystem Controller", getPIDController());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PID
    }
	
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SOURCE
        return winchEnc.pidGet();
    }

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SOURCE
    
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=OUTPUT
        winchMotor.pidWrite(output);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=OUTPUT
    }
}

=======
	private final Encoder winchEnc = new Encoder(RobotMap.WINCH_ENCODER_A, RobotMap.WINCH_ENCODER_B, encDir, EncodingType.k4X);
	
	
	
>>>>>>> origin/master
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
