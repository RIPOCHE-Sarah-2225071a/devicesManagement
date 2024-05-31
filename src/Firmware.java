public class Firmware {

    /**
     * Name of the firmware
     */
    private String name;

    /**
     * Simple constructor, only the name is required. The other attributes can be set later.
     *
     * @param name name of the firmware
     */
    public Firmware(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Firmware{" +
                "name='" + name + '\'' +
                '}';
    }
}
