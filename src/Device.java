public class Device {

    /**
     * Name of the device
     */
    private String name;

    /**
     * Related firmware
     */
    private Firmware firmware;

    /**
     * Related patient
     */
    private Patient patient;

    /**
     * Simplest constructor, only the name is required. The other attributes can be set later.
     *
     * @param name name of the device
     */
    public Device(String name) {
        this.name = name;
    }

    public Device(String name, Firmware firmware) {
        this.name = name;
        this.firmware = firmware;
    }

    public Device(String name, Patient patient) {
        this.name = name;
        this.patient = patient;
    }

    public Device(String name, Firmware firmware, Patient patient) {
        this.name = name;
        this.firmware = firmware;
        this.patient = patient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Firmware getFirmware() {
        return firmware;
    }

    public void updateFirmware(Firmware firmware) {
        this.firmware = firmware;
    }

    public Patient getPatient() {
        return patient;
    }

    public void unbindPatient(Patient patient) {
        if (patient == this.patient) {
            this.patient = null;
            System.out.println("Le patient " + patient.getName() + " a ete dissocie du device " + this.name);
            patient.setDevice(null);
            return;
        }
        System.out.println("Aucun patient n'a ete dissocie du device " + this.name);
    }

    public void bindPatient(Patient patient) {
        if (this.patient == null) {
            this.patient = patient;
            patient.setDevice(this);
            System.out.println("Le patient " + patient.getName() + " a ete associe au device " + this.name);
            return;
        }
        System.out.println("Le patient " + patient.getName() + " n'a pas ete associe au device " + this.name);
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", firmware=" + firmware.getName() +
                ", patient=" + patient.getName() +
                '}';
    }
}
