/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.variables.Constants;

public class TankDrive extends CommandBase {
  private OI m_oi;
  private DriveSubsystem m_DriveSubsystem;

  /**
   * Creates a new TankDrive.
   */
  public TankDrive() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.m_DriveSubsystem);
    m_oi = Robot.m_oi;
    m_DriveSubsystem = Robot.m_DriveSubsystem;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double leftSpeed, rightSpeed;
    while(m_oi.readLeftForwardAxis() > frc.robot.variables.Constants.deadzone 
                  || m_oi.readRightForwardAxis() > frc.robot.variables.Constants.deadzone
                  || m_oi.readLeftForwardAxis() < -frc.robot.variables.Constants.deadzone 
                  || m_oi.readRightForwardAxis() < -frc.robot.variables.Constants.deadzone)
    {
      leftSpeed = m_oi.readLeftForwardAxis()*Constants.driveSpeed;
      rightSpeed = m_oi.readRightForwardAxis()*Constants.driveSpeed;
      m_DriveSubsystem.getTankDrive().tankDrive(leftSpeed, rightSpeed);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_DriveSubsystem.getTankDrive().tankDrive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
