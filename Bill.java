public class Bill {
    int no_of_units_consumed;
    int charge_per_unit;
    String billId;
    static int count;

    //default constructor
    public Bill(){
        count++;
    }

    //parametrised constructor
    public Bill(int no_of_units_consumed,int charge_per_unit,String billId){
        this.no_of_units_consumed=no_of_units_consumed;
        this.charge_per_unit=charge_per_unit;
        this.billId=billId;
        count++;
    }

    //copy constructor
    public Bill(Bill other) {
        this.no_of_units_consumed = other.no_of_units_consumed;
        this.charge_per_unit = other.charge_per_unit;
        this.billId = other.billId;
        count++;
    }

    //getter-setter methods
    public int get_no_of_units_consumed(){
        return no_of_units_consumed;
    }

      public int get_charge_per_unit(){
        return charge_per_unit;
    }

      public String get_billId(){
        return billId;
    }

    public void set_no_of_units_consumed(int no_of_units_consumed){
        this.no_of_units_consumed = no_of_units_consumed;
    }

    public void set_charge_per_unit(int charge_per_unit){
        this.charge_per_unit = charge_per_unit;
    }

    public void set_billId(String billId){
        this.billId = billId;
    }

    //instance methods
    //display bill details
    public void printBillDetails(){
        System.out.println("Bill Id:"+billId);
        System.out.println("No of units consumed:"+no_of_units_consumed);
        System.out.println("charge per unit"+charge_per_unit);
    }

    //calculate bill amount
    public double calculateBillAmount(){
        return no_of_units_consumed*charge_per_unit;
    }

    //total bill count
    public static int count(){
        return count;
    }
}

class ElectricityBill extends Bill{
    public ElectricityBill(int no_of_units_consumed, int charge_per_unit, String billId) {
        super(no_of_units_consumed, charge_per_unit, billId);
    }

    public double calculateBillAmount(){
        return super.calculateBillAmount() +0.02*(super.calculateBillAmount());
    }
}

class MilkBill extends Bill{
    int supplier_charge;

    public MilkBill(int no_of_units_consumed,int charge_per_unit,String billId,int supplier_charge){
       super(no_of_units_consumed, charge_per_unit, billId);
       this.supplier_charge = supplier_charge;
    }

    public void printBillDetails(){
        super.printBillDetails();
        System.out.println("supplier Charge:"+supplier_charge);
    }

    public double calculateBillAmount(){
        return super.calculateBillAmount()+supplier_charge;
    }
}

    class Main {
    public static void main(String[] args) {
        Bill bill = new Bill(100, 1, "B001");
        ElectricityBill electricityBill = new ElectricityBill(200, 2, "E001");
        MilkBill milkBill = new MilkBill(50, 3, "M001", 5);

        // Demonstrate runtime polymorphism
        Bill polymorphicBill = electricityBill;
        polymorphicBill.printBillDetails();
        System.out.println("Bill Amount: $" + polymorphicBill.calculateBillAmount());

        polymorphicBill = milkBill;
        polymorphicBill.printBillDetails();
        System.out.println("Bill Amount: $" + polymorphicBill.calculateBillAmount());

        System.out.println("Total Bill Instances Created: " + Bill.count());
    }
}
