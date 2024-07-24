public class NurseRobot extends Robot implements MedicalReboot {

    /**
     * Xay dung NurseRobot voi ten duoc chi dinh.
     * @param name ten Robot
     */
    public NurseRobot(String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println(getName() + " is assisting in patient care.");
    }
}