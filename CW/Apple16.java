/*Apple16 has selling price compute operation which accepts MRP & discount from user and return selling price to caller method */


public class Apple16 {
    int computeSellingPrice(int MRP, int discount)
    {
        int sellingPrice = MRP - (MRP*discount/100);
        System.out.println(sellingPrice);
        return sellingPrice;
    }
}
