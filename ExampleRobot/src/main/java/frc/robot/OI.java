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

/**
 * Add your docs here.
 */
public class OI {
    protected GenericHID leftJoystick = new Joystick(RobotMap.leftJoystick);
    protected GenericHID rightJoystick = new Joystick(RobotMap.rightJoystick);
 
    public GenericHID getLeftJoystick()
    { 
        return leftJoystick;
    }
    public GenericHID getRightJoystick()
    { 
        return rightJoystick;
    }
    public double readLeftForwardAxis()
    {
        return leftJoystick.getY();
    }
    public double readRightForwardAxis()
    {
        return rightJoystick.getY();
    }
}
