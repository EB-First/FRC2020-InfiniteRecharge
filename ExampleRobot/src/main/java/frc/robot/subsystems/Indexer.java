package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.variables.RobotMap;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
 
/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Indexer extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
 
  private final CANSparkMax index_leftMotor;
  private final CANSparkMax index_rightMotor;
  private final CANSparkMax feed_motor;
 
public Indexer() {
    index_leftMotor = new CANSparkMax(1, MotorType.kBrushless);
    index_rightMotor = new CANSparkMax(2, MotorType.kBrushless);
    feed_motor = new CANSparkMax(3, MotorType.kBrushless);
}
 
public void feed() {
  feed_motor.set(0.5);
}
 
public void ballUp() {
  index_leftMotor.set(-0.5);
  index_rightMotor.set(-0.5);
}
 
public void ballDown() {
  index_leftMotor.set(0.5);
  index_rightMotor.set(-0.5);
}
 
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
 
 
