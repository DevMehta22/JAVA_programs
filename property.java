public class property {
    String location;
    int pId;
    long areraInYard;
    int price_per_yard;
    static int PropertyCount;

    //default constructor
    public property(){
        PropertyCount++;
    }

    //parametrised constructor
    public property(String location,int pId,long areraInYard,int price_per_yard){
        this.location=location;
        this.pId=pId;
        this.areraInYard=areraInYard;
        this.price_per_yard=price_per_yard;
        PropertyCount++;
    }

    //copy constructor
    public property(property p1){
        location=p1.location;
        pId=p1.pId;
        areraInYard=p1.areraInYard;
        price_per_yard=p1.price_per_yard;
        PropertyCount++;
    }

    //getter--setter
    public String getlocation(){
        return location;
    }

    public int getpId(){
        return pId;
    }

    public long getareaInYard(){
        return areraInYard;
    }

    public int getpricePerYard(){
        return price_per_yard;
    }

    public void setlocation(String location){
         this.location=location;
    }

    public void setpId(int pId){
        this.pId=pId;   
    }

    public void setareaInYard(long areraInYard){
        this.areraInYard=areraInYard; 
    }   

    public void setpricePerYard(int price_per_yard){
        this.price_per_yard=price_per_yard;   
    }

    //methods

    public long calculatePriceOfProperty(){
        return areraInYard*price_per_yard;
    }
    
    public void printPropertyInfo(){
        System.out.println("Location:"+location);
        System.out.println("pId:"+pId);
        System.out.println("area of yard:"+areraInYard);
        System.out.println("price per yard:"+price_per_yard);
    }

    public int getTotalCount(){
        return PropertyCount;
    }
}

//inheritance
class FurnishedHome extends property{
    long furnitureCharge;

    public FurnishedHome(){

    }
    public FurnishedHome( String location,int pId,long areraInYard,int price_per_yard,int furnitureCharge){
        super(location,pId,areraInYard,price_per_yard);
        this.furnitureCharge=furnitureCharge;
    }
    public long getfurnishedcharge(){
        return furnitureCharge;
    }

    public long calculatePriceOfProperty(){
        long price = super.calculatePriceOfProperty();
        return price+ 5/100*price;
    }

    public void printPropertyInfo(){
        super.printPropertyInfo();
        System.out.println("Furniture Charge:"+furnitureCharge);
    }
}

class Shop extends property{
    public Shop(){

    }

    public Shop(String location,int pId,long areraInYard,int price_per_yard){
        super(location,pId,areraInYard,price_per_yard);
    }

     public long calculatePriceOfProperty(){
        long price = super.calculatePriceOfProperty();
        return price+ 4/100*price;
    }
}

class Main{

    public static long getTotalPrice(property[] rs){
        long totalprice=0;
        for(int i=0;i<rs.length;i++){
            totalprice+=rs[i].calculatePriceOfProperty();
        }
        return totalprice;
    }

    // public static long getTotalFurnishedPrice(property[] rs,FurnishedHome f1,FurnishedHome f2){
    //     long totalprice=0;
    //     for(int i=0;i<rs.length;i++){
    //         if(rs[i]==f1||rs[i]==f2){
    //             totalprice+=rs[i].getfurnishedcharge();
    //         }
            
    //     }
    //     return totalprice;
    // }

    public static void main(String[] args){
        property p1 = new property("Mumbai",101,250,2000);
        property p2 = new property("agra",104,311,2230);
        FurnishedHome f1 = new FurnishedHome("Delhi", 102, 300, 2500, 500);
        FurnishedHome f2 = new FurnishedHome("kutch", 105, 450, 4500, 1000);
        Shop s1 = new Shop("Ahmedabad", 103, 150, 1500);

        property polymorphicProperty = f1;
        polymorphicProperty.printPropertyInfo();

        polymorphicProperty=s1;
        polymorphicProperty.printPropertyInfo();
        
        property[] rs ={p1,p2,f1,f2,s1};

        System.out.println("Total price of properties:"+ getTotalPrice(rs));
        // System.out.println("Total furniture charge:"+getTotalFurnishedPrice(rs,f1,f2));

        System.out.println("Total count of instance created:"+property.PropertyCount);

    }
}
