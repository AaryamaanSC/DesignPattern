public class RetailIndustry {

    public VehicleFactory getMyVehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("normal")){
            return  new NormalVehicleFactory();
        }else if(vehicleType.equalsIgnoreCase("luxury")){
            return new LuxuryVehicleFactory();
        }else{
            System.out.println("Vehicle type not present");
            return null;
        }
    }
}
