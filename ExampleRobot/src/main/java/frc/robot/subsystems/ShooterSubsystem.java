/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
//import edu.wpi.first.wpilibj.command.Command;
//import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.OI;

public class ShooterSubsystem extends SubsystemBase {
  public static ShooterSubsystem m_ShooterSubsystem = new ShooterSubsystem();

   private OI m_oi;

	  CANSparkMax neo = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax topMotor = new CANSparkMax(2, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax bottomMotor = new CANSparkMax (3, CANSparkMaxLowLevel.MotorType.kBrushless);

    public void shooterUp() {
  
   if(m_oi.readRightForwardAxis() > frc.robot.variables.Constants.deadzone)
    { 
     neo.set(1);
    }
}

    

    public void shooterDown() {
        
   if(m_oi.readRightForwardAxis() < -frc.robot.variables.Constants.deadzone)
   { 
        neo.set(-1);
   }
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


    // @Override
    // default void setDefaultCommand(Command defaultCommand){
    //     // set the default command
    //     // setDefaultCommand (new mySpecialCommand());
    //     CommandScheduler.getInstance().setDefaultCommand(this, defaultCommand);
    // }
    
}