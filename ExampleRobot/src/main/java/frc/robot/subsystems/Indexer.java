/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Indexer extends SubsystemBase {
  /**
   * Creates a new Indexer2.
   */
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
    index_rightMotor.set(0.5);
  }
   
  public void ballDown() {
    index_leftMotor.set(0.5);
    index_rightMotor.set(-0.5);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
