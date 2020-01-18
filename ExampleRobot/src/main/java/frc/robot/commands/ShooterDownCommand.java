package frc.robot.commands;

import javax.annotation.OverridingMethodsMustInvokeSuper;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.subsystems.ShooterSubsystem;


public class ShooterDownCommand extends CommandBase {
    public ShooterDownCommand() {
    addRequirements(Robot.m_ShooterSubsystem);
    }
 
 
@Override
public void initialize () {
 
}
 
@Override
public void execute() {
    Robot.m_ShooterSubsystem.shooterDown();
}

@Override
public boolean isFinished() {
    return false;
}
 
@Override
public void end(boolean interrupted) {
 if(interrupted) {
    Robot.m_ShooterSubsystem.setNeoSpeed(0);
 }
}   
    
}