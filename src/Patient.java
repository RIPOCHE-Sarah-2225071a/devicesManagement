public class Patient {

    /**
     * Name of the patient
     */
    private String name;

    /**
     * Related device
     */
    private Device device;

    /**
     * Simplest constructor, only the name is required. The other attributes can be set later.
     *
     * @param name name of the patient
     */
    public Patient(String name) {
        this.name = name;
    }

    public Patient(String name, Device device) {
        this.name = name;
        this.device = device;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", device=" + device.getName() +
                '}';
    }
}
