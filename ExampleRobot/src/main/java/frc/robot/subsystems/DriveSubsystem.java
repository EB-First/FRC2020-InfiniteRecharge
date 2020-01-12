/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.OI;
import frc.robot.variables.RobotMap;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private OI m_oi;
 
  private CANSparkMax leftFMotor = new CANSparkMax(RobotMap.leftFrontMotor,CANSparkMaxLowLevel.MotorType.kBrushless);
  private CANSparkMax leftMMotor = new CANSparkMax(RobotMap.leftMidMotor,CANSparkMaxLowLevel.MotorType.kBrushless);
  private CANSparkMax leftBMotor = new CANSparkMax(RobotMap.leftBackMotor,CANSparkMaxLowLevel.MotorType.kBrushless);
  private CANSparkMax rightFMotor = new CANSparkMax(RobotMap.rightFrontMotor,CANSparkMaxLowLevel.MotorType.kBrushless);
  private CANSparkMax rightMMotor = new CANSparkMax(RobotMap.rightMidMotor,CANSparkMaxLowLevel.MotorType.kBrushless);
  private CANSparkMax rightBMotor = new CANSparkMax(RobotMap.rightBackMotor,CANSparkMaxLowLevel.MotorType.kBrushless);
 
  private DifferentialDrive tankDrive = new DifferentialDrive(leftFMotor, rightFMotor);
 
  public DriveSubsystem(OI m_oi)
  {
    this.m_oi = m_oi;
    leftMMotor.follow(leftFMotor);
    leftBMotor.follow(leftFMotor);
    rightMMotor.follow(rightFMotor);
    rightBMotor.follow(rightFMotor);
  }
 
  public void drive()
  {
    if(m_oi.readLeftForwardAxis() > frc.robot.variables.Constants.deadzone 
                  || m_oi.readRightForwardAxis() > frc.robot.variables.Constants.deadzone
                  || m_oi.readLeftForwardAxis() < -frc.robot.variables.Constants.deadzone 
                  || m_oi.readRightForwardAxis() < -frc.robot.variables.Constants.deadzone)
    {
      tankDrive.tankDrive(m_oi.readLeftForwardAxis(), m_oi.readRightForwardAxis());
    }
  }
 
  public DifferentialDrive getTankDrive()
  {
    return tankDrive;
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
