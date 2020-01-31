package frc.robot;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.SpinIntake;
import frc.robot.variables.ControlMap;
import frc.robot.variables.RobotMap;

public class OI {
    protected GenericHID rightJoystick = new Joystick(RobotMap.operatorGamepad);
    protected Button intakeButton = new JoystickButton(rightJoystick, ControlMap.intakeButton);
    
    public OI() {
        intakeButton.whileHeld(new SpinIntake());
    }

    public GenericHID getRightJoystick()
    { 
        return rightJoystick; 
    }

}