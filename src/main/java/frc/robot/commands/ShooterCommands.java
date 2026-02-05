package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
// import frc.robot.commands.IntakeCommands.ROLLER_VOLTS;
import frc.robot.commands.flywheel.FlywheelVelocityCommand;
import frc.robot.subsystems.flywheel.Flywheel;
import frc.robot.util.mechanical_advantage.LoggedTunableNumber;
import java.util.function.DoubleSupplier;

public class ShooterCommands {

  public static final class SHOOTER_SPEED {
    public static final LoggedTunableNumber SHOOTER_TARGET_RPM =
        new LoggedTunableNumber("Shooter/TargetRPM", 3000.0);
  }

  public final class SHOOTER_VOLTS {
    public static final LoggedTunableNumber SHOOTER_SHOOT =
        new LoggedTunableNumber("ShooterVolts/ShooterShoot", 6.0);
  }

  private ShooterCommands() {}

  public static Command setShooterRPM(Flywheel shooter, DoubleSupplier rpm) {
    return new FlywheelVelocityCommand(shooter, () -> rpm.getAsDouble() / 60.0);
  }
}
