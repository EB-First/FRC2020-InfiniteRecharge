package frc.robot.commands;

import javax.annotation.OverridingMethodsMustInvokeSuper;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ShooterDownCommand extends Command {
    private ShooterSubsystem m_Shootersystem = Robot.m_ShooterSubsystem;
    public ShooterDownCommand {
    }
    requires (Robot.m_ShooterSubsystem);
 
 
 
@Override
protected void initialize () {
 
}
 
@Override
protected void execute() {
    m_ShooterSubsystem.shooterDown();
}

@Override
protected boolean isFinished() {
    return false;
}
 
@Override
protected void end() {
 
}
 
@Override
protected void interrupted() {
    m_ShooterSubsystem.set(0);
    } 
    
    
}