/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.variables.Constants;

public class SpinIntake extends CommandBase {
  /**
   * Creates a new SpinIntake.
   */
  private IntakeSubsystem m_IntakeSubsystem = frc.robot.Robot.m_IntakeSubsystem;
  private Spark intakeMotor;

  public SpinIntake() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_IntakeSubsystem);

    intakeMotor = m_IntakeSubsystem.getIntakeMotor();        
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    intakeMotor.set(Constants.intakeSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    intakeMotor.set(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
