public class Count {
    private int serialNumber;
    private static int counter = 0;
    
    public static int getTotalCount() {
        return counter;
    }
    
    public Count() {
        counter++;
        serialNumber = counter;
    }
    
    public String toString() {
        return "Count object: serial number is " + serialNumber +
                " counter is " + getTotalCount();
    }
}
