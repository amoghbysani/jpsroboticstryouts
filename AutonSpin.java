package frc.robot;

import edu.wpi.first.wpilibj.templates.commandbased.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;


public class AutonSpin extends CommandBase {

  // COPY PASTE TANK DRIVE HEADERS OTHER THAN JOYSTICKS

  public SpinCommand() {

  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
      m_myRobot.tankDrive(-1,1) // adjust and scale with range of values to alter spin speed
  }

}
