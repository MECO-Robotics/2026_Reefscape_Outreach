package frc.robot.subsystems.position_joint;

import edu.wpi.first.math.geometry.Rotation2d;
import frc.robot.util.mechanical_advantage.LoggedTunableNumber;

public class ArmPresets {
  private final LoggedTunableNumber armPos;

  public ArmPresets(String name, double armPoseRotation) {
    this.armPos = new LoggedTunableNumber(name + "/ArmPoseRotation", armPoseRotation);
  }

  public double getArmPoseRotation() {
    return armPos.get();
  }

  public Rotation2d getArmPoseRotation2d() {
    return Rotation2d.fromDegrees(armPos.get());
  }
}
