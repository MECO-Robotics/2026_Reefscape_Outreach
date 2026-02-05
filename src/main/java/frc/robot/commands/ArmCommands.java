package frc.robot.commands;

<<<<<<< HEAD
import edu.wpi.first.math.util.Units;
=======
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.position_joint.PositionJoint;
>>>>>>> 61fac42f6983831e1b818baaf96bd939512122c6
import frc.robot.util.mechanical_advantage.LoggedTunableNumber;

public class ArmCommands {

  public static final class ARM_PRESETS {
<<<<<<< HEAD

    public static final LoggedTunableNumber ARM_STOWED =
        new LoggedTunableNumber("ArmPresets/ArmStowed", 0.0);

    public static final LoggedTunableNumber ARM_SHOOT =
        new LoggedTunableNumber("ArmPresets/ArmShoot", Units.degreesToRadians(0));
=======
    public static final LoggedTunableNumber STOW = new LoggedTunableNumber("ArmPresets/Stow", 0.0);
    public static final LoggedTunableNumber FERRY = new LoggedTunableNumber("ArmPresets/Ferry", 45.0);
    public static final LoggedTunableNumber SHOOT = new LoggedTunableNumber("ArmPresets/Shoot", 90.0);
>>>>>>> 61fac42f6983831e1b818baaf96bd939512122c6
  }

  /** Command factory to set the arm to a specific preset. */
  public static Command setSetpoint(PositionJoint arm, LoggedTunableNumber preset) {
    return PositionJoint.setPosition(arm, preset::get);
  }

  private ArmCommands() {}
}
