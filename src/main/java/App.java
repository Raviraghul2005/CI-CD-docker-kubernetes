public class App{
    public static boolean isValidMedicine(String name){
        return name != null && !name.isEmpty();
    }

    public static boolean isValidDosage(int dosage){
        return dosage>0 && dosage<500;
    }

    public static void main(String[] args){
        System.out.println("Prescription System Running");
    }
}