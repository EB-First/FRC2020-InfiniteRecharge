package frc.robot.subsystems;


import edu.wpi.first.wpilibj.command.Subsystem;

public class ShooterSubsystem extends Subsystem {
   public static ShooterSubsystem m_ShooterSubsystem = new ShooterSubsystem();

	CANSparkMax neo = new CANSparkMax(1, CANSparkMaxLowLevel.MotorLevel.kBrushless);
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

    public void setNeoSpeed(double speed) {
       neo.set(speed);
    }

    public void setTopMotorSpeed(double speed) {
        topMotor.set(speed);
    }

    public void setBottomMotorSpeed(double speed) {
        bottomMotor.set(speed);
    }


    @Override
    public void initDefaultCommand(){
        // set the default command
        // setDefaultCommand (new mySpecialCommand());
    }
    
}