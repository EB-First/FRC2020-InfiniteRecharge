/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.variables.RobotMap;
import edu.wpi.first.wpilibj2.command.button.*;
import frc.robot.commands.*;
import frc.robot.variables.ControlMap;

/**
 * Add your docs here.
 */
public class OI {
    protected GenericHID rightJoystick = new Joystick(RobotMap.operatorGamepad);
    protected Button shootButton = new JoystickButton(rightJoystick, ControlMap.shootButton);

    public GenericHID getRightJoystick(){ return rightJoystick; }

    public double readRightForwardAxis() { return rightJoystick.getY();}

    public OI() {
    shootButton.whileHeld(new ShootCommand());
}
   
}
