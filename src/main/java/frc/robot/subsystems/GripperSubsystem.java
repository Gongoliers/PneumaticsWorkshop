/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class GripperSubsystem extends Subsystem {
  
  private Compressor compressor;
  private Solenoid solenoid;


  public GripperSubsystem(Compressor compressor, Solenoid gripperSolenoid){
    // Don't modify the next two lines
    this.compressor = compressor;
    this.solenoid = gripperSolenoid;
  }

  /**
   * Starts the compressor
   */
  public void startCompressor(){
    // Add your code here
  }

  /**
   * Stops the compressor
   */
  public void stopCompressor(){
    // Add your code here
  }

  /**
   * Determines if the pneumatics are fully charged (hint the compressor has a pressure switch)
   * @return true if the pneumatics are fully charged, false otherwise
   */
  public boolean arePneumaticsFullyCharged(){
    // Add your code here
    return false;
  }

  /**
   * Closes the gripper (solenoid should be on)
   */
  public void closeGripper(){
    // Add your code here
  }

  /**
   * Opens the gripper (solenoid should be off)
   */
  public void openGripper(){
    // Add your code here
  }


  @Override
  public void initDefaultCommand() {
    // You can leave this empty
  }
}
