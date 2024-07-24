public class DoctorRobot extends Robot implements MedicalReboot {

    /**
     * Xay dung DoctorRobot voi ten duoc chi dinh.
     * @param name ten Robot
     */
    public DoctorRobot(String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println(getName() + " is caring for patients.");
    }
}