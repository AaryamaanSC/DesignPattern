public class Main {

    public static void main(String args[]){
        // 1 abstract Product interface hota h jo ki Vehicle class hoga
        // 2 concrete products jisme different types of cars honge

        //3 abstractFactory intergace hoga jo Vehicle Factory h
        //4 concreteFactories class hoga jisme Normal Vehicle and Luxury vehicle hoga

        //5 Client hoga jo ki retail industry hoga jisme based on condition mai LuxuryVehicleFactory and
        // normal vehicle factory return krunga and isme constructor hoga vehicleFactory ka

        RetailIndustry retailIndustry = new RetailIndustry();
        VehicleFactory vehicleFactory = retailIndustry.getMyVehicle("normal");
        Vehicle myVehicle = vehicleFactory.getVehicle(25);
        myVehicle.average();
    }
}
