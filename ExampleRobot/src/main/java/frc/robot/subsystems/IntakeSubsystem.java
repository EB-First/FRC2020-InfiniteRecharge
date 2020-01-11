/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.variables.RobotMap;
import frc.robot.variables.RobotMap.activatorSolenoid;

/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class IntakeSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    // Two slaved motors to manage belt
    private DoubleSolenoid activatorSolenoid;// = new DoubleSolenoid(RobotMap.activatorSolenoid.forwardChannel, RobotMap.activatorSolenoid.reverseChannel);
    private Spark intakeMotor;

    public IntakeSubsystem(){
        activatorSolenoid = new DoubleSolenoid(RobotMap.activatorSolenoid.forwardChannel, RobotMap.activatorSolenoid.reverseChannel);
        intakeMotor = new Spark(RobotMap.intakeMotor);
    }

    @Override
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    public Spark getIntakeMotor(){
        return intakeMotor;
    }

    public DoubleSolenoid getActivatorSolenoid(){
        return activatorSolenoid;
    }

}
