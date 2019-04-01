package frc.robot.commands;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import frc.robot.subsystems.GripperSubsystem;

/**
 * CloseGripperTest
 */
public class CloseGripperTest {

    private GripperSubsystem gripper;
    private CloseGripper command;

    @Before
    public void setup(){
        gripper = mock(GripperSubsystem.class);
        command = new CloseGripper(gripper);
    }


    @Test
    public void requiresGripper(){
        assertTrue(command.doesRequire(gripper));
    }

    @Test
    public void closesGripper(){
        command.initialize();
        verify(gripper).closeGripper();
    }

}