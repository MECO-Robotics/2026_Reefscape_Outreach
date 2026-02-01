package frc.robot.subsystems.flywheel;

public class FlywheelConstants {
  public record FlywheelGains(
      double kP,
      double kI,
      double kD,
      double kS,
      double kV,
      double kA,
      double kMaxAccel,
      double kTolerance) {}

  public record FlywheelHardwareConfig(
      int[] canIds, boolean[] reversed, double gearRatio, int currentLimit, String canBus) {}

  public static final FlywheelHardwareConfig EXAMPLE_CONFIG =
      new FlywheelHardwareConfig(new int[] {1}, new boolean[] {true}, 2.0, 40, "");

  public static final FlywheelGains EXAMPLE_GAINS =
      new FlywheelGains(0.2, 0.0, 0.0, 0.0, 0.065, 0.0, 1.0, 1.0);

  // ------------------
  // Shooter
  // ------------------
  public static final FlywheelHardwareConfig LEFT_FLYWHEEL_CONFIG =
      new FlywheelHardwareConfig(new int[] {11}, new boolean[] {false}, 4.0, 40, "");

  public static final FlywheelGains LEFT_FLYWHEEL_GAINS =
      new FlywheelGains(0.1, 0.0, 0.0, 0.0, 0.05, 0.0, 1.0, 1.0);

  public static final FlywheelHardwareConfig RIGHT_FLYWHEEL_CONFIG =
      new FlywheelHardwareConfig(new int[] {12}, new boolean[] {true}, 4.0, 40, "");

  public static final FlywheelGains RIGHT_FLYWHEEL_GAINS =
      new FlywheelGains(0.1, 0.0, 0.0, 0.0, 0.05, 0.0, 1.0, 1.0);

  public static final FlywheelHardwareConfig INDEXER_CONFIG =
      new FlywheelHardwareConfig(new int[] {13}, new boolean[] {false}, 1.0, 20, "");

  public static final FlywheelGains INDEXER_GAINS =
      new FlywheelGains(0.2, 0.0, 0.0, 0.0, 0.1, 0.0, 1.0, 1.0);
}
