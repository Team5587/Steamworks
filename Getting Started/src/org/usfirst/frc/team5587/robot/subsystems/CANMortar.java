package org.usfirst.frc.team5587.robot.subsystems;

import org.usfirst.frc.team5587.classes.NetworkTable;
import org.usfirst.frc.team5587.robot.RobotMap;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;
import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CANMortar extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private static final int ENC_PULSE_PER_REVOLUTION = 1024; 
	private static final int GEAR_RATIO = 4;
	private static final int FLYWHEEL_PULSE_PER_REVOLUTION = ENC_PULSE_PER_REVOLUTION * GEAR_RATIO;
	
	private static double kF = .03653571429,
						  		kP = 0.004,
								kI = 0.0,
								kD = 0.0;
								
	private NetworkTable table;
	
	private CANTalon flywheel;
	
	public CANMortar()
	{	
		flywheel = new CANTalon( RobotMap.FLYWHEEL_MOTOR_CAN_ID );
		
		flywheel.setFeedbackDevice( FeedbackDevice.CtreMagEncoder_Relative );
		//flywheel.configEncoderCodesPerRev( FLYWHEEL_PULSE_PER_REVOLUTION );
		
		flywheel.configNominalOutputVoltage( +0.0f, -0.0f );
		flywheel.configPeakOutputVoltage( +12.0f, -12.0f );
		
		table = NetworkTable.getTable( "Flywheel PID" );
		
		table.putNumber( "kP", kP );
		table.putNumber( "kI", kI );
		table.putNumber( "kD", kD );
		table.putNumber( "kF", kF );
		
		flywheel.setProfile( 0 );
		flywheel.setF( kF );
		flywheel.setP( kP );
		flywheel.setI( kI );
		flywheel.setD( kD );
		
		flywheel.changeControlMode( TalonControlMode.Speed );
	}
	
	public void spin( double speed )
	{
		flywheel.set( speed );
	}
	
	public void stop()
	{
		flywheel.set( 0 );
		flywheel.disable();
	}
	
	public double rps()
	{
		return flywheel.getEncVelocity()*FLYWHEEL_PULSE_PER_REVOLUTION;
	}
	
	public double rpm()
	{
		return rps()/60;
	}
	
	public double distance()
	{
		return flywheel.getEncPosition();
	}
	
	public double output()
	{
		return flywheel.get();
	}
	
	public void speedMode()
	{
		flywheel.changeControlMode( TalonControlMode.Speed );
	}
	
	public void throttleMode()
	{
		flywheel.changeControlMode( TalonControlMode.PercentVbus );
	}
	
	public void updatePID()
	{
		kP = table.getNumber( "Flywheel PID", kP );
		kI = table.getNumber( "Flywheel PID", kI );
		kD = table.getNumber( "Flywheel PID", kD );
		kF = table.getNumber( "Flywheel PID", kF );
		
		flywheel.setP( kP );
		flywheel.setI( kI );
		flywheel.setD( kD );
		flywheel.setF( kF );
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

