package frc.robot.subsystems;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;

/**
 * Tests the Gripper Subsystem
 */
public class GripperSubsystemTest {

    private Compressor compressor;
    private Solenoid solenoid;
    private GripperSubsystem gripper;

    @Before
    public void setup(){
        compressor = mock(Compressor.class);
        solenoid = mock(Solenoid.class);
        gripper = new GripperSubsystem(compressor, solenoid);
    }

    @Test
    public void canStartCompressor(){
        gripper.startCompressor();
        verify(compressor).start(); 
    }

    @Test
    public void canStopCompressor(){
        gripper.stopCompressor();
        verify(compressor).stop();
    }

    @Test
    public void canCloseGripper(){
        gripper.closeGripper();
        verify(solenoid).set(true);
    }

    @Test
    public void canOpenGripper(){
        gripper.openGripper();
        verify(solenoid).set(false);
    }

    @Test
    public void determinesIfPneumaticsAreFullyCharged(){
        when(compressor.getPressureSwitchValue()).thenReturn(false);
        assertTrue(gripper.arePneumaticsFullyCharged());

        when(compressor.getPressureSwitchValue()).thenReturn(true);
        assertFalse(gripper.arePneumaticsFullyCharged());
    }

}