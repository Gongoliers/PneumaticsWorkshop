/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.subsystems.GripperSubsystem;

/**
 * This command will open the Gripper
 */
public class OpenGripper extends InstantCommand {

  private GripperSubsystem gripper;

  public OpenGripper(GripperSubsystem gripper) {
    // Don't modify this
    this.gripper = gripper;

    // TODO: Require the gripper
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    // Add your code here
  }
}
