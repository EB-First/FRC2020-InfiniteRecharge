package frc.robot.subsystems;


import edu.wpi.first.wpilibj.command.Subsystem;

public class ShooterSubsystem extends Subsystem {
   public static ShooterSubsystem m_ShooterSubsystem = new ShooterSubsystem();

	 CANSparkMax neo = new CANSparkMax();
    CANSparkMax topMotor = new CANSparkMax(2, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax bottomMotor = new CANSparkMax (3, CANSparkMaxLowLevel.MotorType.kBrushless);

    public void shooterUp() {
        neo.set(1);
    }

    public void shooterDown() {
        neo.set(-1);
    }

    public void shoot() {
        // top motor counterclockwise, bottom motor clockwise @ full speed
        topMotor.set(-1);
        bottomMotor.set(1);
    }

    public void setSpeed(CANSparkMax type, double speed) {
       type.set(speed);
    }


    @Override
    public void initDefaultCommand(){
        // set the default command
        // setDefaultCommand (new mySpecialCommand());
    }
    
}