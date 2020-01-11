/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.variables.Constants;

/**
 * An example command. You can replace me with your own command.
 */
public class SpinIntake extends Command {
    private IntakeSubsystem m_IntakeSubsystem = frc.robot.Robot.m_IntakeSubsystem;
    private Spark intakeMotor;

    public SpinIntake() {
        // Use requires() here to declare subsystem dependencies
        requires(m_IntakeSubsystem);

        intakeMotor = m_IntakeSubsystem.getIntakeMotor();        
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {

    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        intakeMotor.set(Constants.intakeSpeed);
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
        intakeMotor.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {

    }
}
