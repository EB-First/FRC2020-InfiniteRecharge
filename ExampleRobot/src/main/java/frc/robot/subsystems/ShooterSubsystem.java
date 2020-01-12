public class ShooterSubsystem extends Subsystem {
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

    @Override

    public void initDefaultCommand(){
        // set the default command
        // setDefaultCommand (new mySpecialCommand());
    }
    
}