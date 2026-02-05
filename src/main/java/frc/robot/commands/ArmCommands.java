package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.position_joint.PositionJoint;
import frc.robot.util.mechanical_advantage.LoggedTunableNumber;

public class ArmCommands {

  public static final class ARM_PRESETS {

    public static final LoggedTunableNumber STOW = new LoggedTunableNumber("ArmPresets/Stow", 0.0);
    public static final LoggedTunableNumber FERRY =
        new LoggedTunableNumber("ArmPresets/Ferry", 45.0);
    public static final LoggedTunableNumber SHOOT =
        new LoggedTunableNumber("ArmPresets/Shoot", 90.0);
  }

  /** Command factory to set the arm to a specific preset. */
  public static Command setSetpoint(PositionJoint arm, LoggedTunableNumber preset) {
    return PositionJoint.setPosition(arm, preset::get);
  }

  private ArmCommands() {}
}
