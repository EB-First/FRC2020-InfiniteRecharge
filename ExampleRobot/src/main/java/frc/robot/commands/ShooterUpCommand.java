package frc.robot.commands;

import javax.annotation.OverridingMethodsMustInvokeSuper;

// import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.subsystems.ShooterSubsystem;



public class ShooterUpCommand extends CommandBase {
    public ShooterUpCommand() {
        addRequirements(Robot.m_ShooterSubsystem);
    }
 
    @Override
    public void initialize() {}
 
    @Override
    public void execute() {Robot.m_ShooterSubsystem.shooterUp();}
 
    @Override
    public boolean isFinished() {return false;}
 
    @Override 
    public void end(boolean interrupted) {
        if(interrupted) {
            Robot.m_ShooterSubsystem.setNeoSpeed(0);
        }
    }
}
