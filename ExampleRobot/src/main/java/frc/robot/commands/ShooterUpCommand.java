public class ShooterUpCommand extends Command {
    private ShooterSubsystem m_ShooterSubsystem = Robot.m_ShooterSubsystem;
    public ShooterUpCommand {
        requires (Robot.m_ShooterSubsystem);
    }
 
    @Override
    protected void initialize() {}
 
    @Override
    protected void execute() {m_ShooterSubsystem.shooterUp()}
 
    @Override
    protected boolean isFinished() {return false;}
 
    @Override 
    protected void end() {}
 
    @Override 
    protected void interrupted() {m_ShooterSubsystem.set(0);}
 
 
}
