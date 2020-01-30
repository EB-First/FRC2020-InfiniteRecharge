/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.IntakeSubsystem;;

/**
 * An example command. You can replace me with your own command.
 */
public class ActivateIntake extends Command {
    private IntakeSubsystem m_IntakeSubsystem = frc.robot.Robot.m_IntakeSubsystem;
    private boolean dropIntake;
    private DoubleSolenoid activatorSolenoid;

    public ActivateIntake(boolean dropIntake) {
        // Use requires() here to declare subsystem dependencies
        requires(m_IntakeSubsystem);

        this.activatorSolenoid = m_IntakeSubsystem.getActivatorSolenoid();
        this.dropIntake = dropIntake;
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {

    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
        if (dropIntake) {
            activatorSolenoid.set(Value.kReverse); // May need to be tweaked
        } else {
            activatorSolenoid.set(Value.kForward);
        }
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {

    }
}