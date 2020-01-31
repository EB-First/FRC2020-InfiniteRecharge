/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSubsystem;

public class ActivateIntake extends CommandBase {
  /**
   * Creates a new ActivateIntake.
   */
  private IntakeSubsystem m_IntakeSubsystem = frc.robot.Robot.m_IntakeSubsystem;
  private boolean dropIntake;
  private DoubleSolenoid activatorSolenoid;

  public ActivateIntake() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_IntakeSubsystem);

    this.activatorSolenoid = m_IntakeSubsystem.getActivatorSolenoid();
    this.dropIntake = dropIntake;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    if (dropIntake) 
    {
      activatorSolenoid.set(Value.kReverse); // May need to be tweaked
    } 
    else 
    {
      activatorSolenoid.set(Value.kForward);
    }
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}