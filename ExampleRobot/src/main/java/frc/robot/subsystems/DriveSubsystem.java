/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.variables.RobotMap;

public class DriveSubsystem extends SubsystemBase {
 
  private CANSparkMax leftFMotor;
  private CANSparkMax leftMMotor;
  private CANSparkMax leftBMotor;
  private CANSparkMax rightFMotor;
  private CANSparkMax rightMMotor;
  private CANSparkMax rightBMotor;
 
  private DifferentialDrive tankDrive;
 
  /**
   * Creates a new DriveSubsystem.
   */
  
  
  public DriveSubsystem()
  {
    leftFMotor = new CANSparkMax(RobotMap.leftFrontMotor,CANSparkMaxLowLevel.MotorType.kBrushless);
    leftMMotor = new CANSparkMax(RobotMap.leftMidMotor,CANSparkMaxLowLevel.MotorType.kBrushless);
    leftBMotor = new CANSparkMax(RobotMap.leftBackMotor,CANSparkMaxLowLevel.MotorType.kBrushless);
    rightFMotor = new CANSparkMax(RobotMap.rightFrontMotor,CANSparkMaxLowLevel.MotorType.kBrushless);
    rightMMotor = new CANSparkMax(RobotMap.rightMidMotor,CANSparkMaxLowLevel.MotorType.kBrushless);
    rightBMotor = new CANSparkMax(RobotMap.rightBackMotor,CANSparkMaxLowLevel.MotorType.kBrushless);
 
    tankDrive = new DifferentialDrive(leftFMotor, rightFMotor);

    leftMMotor.follow(leftFMotor);
    leftBMotor.follow(leftFMotor);
    rightMMotor.follow(rightFMotor);
    rightBMotor.follow(rightFMotor);
  }

  public CANSparkMax getLeftMotor()
  {
    return leftFMotor;
  }

  public CANSparkMax getRightMotor()
  {
    return rightFMotor;
  }

  public void drive(double leftSpeed, double rightSpeed)
  {
    tankDrive.tankDrive(leftSpeed, rightSpeed);
  }
 
  public DifferentialDrive getTankDrive()
  {
    return tankDrive;
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
