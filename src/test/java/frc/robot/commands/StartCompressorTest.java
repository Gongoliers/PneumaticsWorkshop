package frc.robot.commands;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import frc.robot.subsystems.GripperSubsystem;

/**
 * StartCompressorTest
 */
public class StartCompressorTest {

    private GripperSubsystem gripper;
    private StartCompressor command;

    @Before
    public void setup(){
        gripper = mock(GripperSubsystem.class);
        command = new StartCompressor(gripper);
    }


    @Test
    public void requiresGripper(){
        assertTrue(command.doesRequire(gripper));
    }

    @Test
    public void startsCompressor(){
        command.initialize();
        verify(gripper).startCompressor();
    }

}