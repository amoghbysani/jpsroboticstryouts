// ROBOTBUILDER TYPE: Command.

package frc.robot.commands;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Drivetrain;


/**
 *
 */
public class TankDrive extends CommandBase {

   
    private final MotorController m_leftMotor = new PWMSparkMax(0);
    private final MotorController m_rightMotor = new PWMSparkMax(1);
    private DifferentialDrive m_myRobot = new DifferentialDrive(m_leftMotor, m_rightMotor);
    private Joystick m_leftStick = new Joystick(0);
    private Joystick m_rightStick = new Joystick(1);
    public TankDrive() {}

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        m_myRobot.tankDrive(m_leftStick.getY(), m_rightStick.getY())
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        m_drivetrain.drive(0.0, 0.0);
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public boolean runsWhenDisabled() {
        return false;

    }
}
