public class Main {
    public static void main(String[] args) {
        // Part 1
        Firmware fw01 = new Firmware("FW-01");
        Device slb01 = new Device("SLB_01", fw01);

        Device slb02 = new Device("SLB-02", fw01);

        // Part 2
        System.out.println("--- PART 2 ---");
        Patient user01 = new Patient("User-01");
        Patient user02 = new Patient("User-02");
        slb01.bindPatient(user01);

        slb01.bindPatient(user02); // Does not work because slb01 is already bound to user01

        System.out.println(slb01);

        // Part 3
        System.out.println("--- PART 3 ---");
        slb01.unbindPatient(user01);

        Patient user03 = new Patient("User-03");
        Device slb03 = new Device("SLB-03");
        slb03.unbindPatient(user03);

        // Part 4
        System.out.println("--- PART 4 ---");
        Firmware fw02 = new Firmware("FW-02");
        slb01.updateFirmware(fw02);
        slb02.updateFirmware(fw02);
        System.out.println("Le device " + slb01.getName() + " a le firmware " + slb01.getFirmware().getName());
        System.out.println("Le device " + slb02.getName() + " a le firmware " + slb02.getFirmware().getName());
    }
}