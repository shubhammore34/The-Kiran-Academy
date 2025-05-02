public class AadharCard {
    int aadhar_no;
    String name;
    String address;

    AadharCard(int aadhar, String n, String add) {
        aadhar_no = aadhar;
        name = n;
        address = add;

        System.out.println(aadhar_no);
        System.out.println(name);
        System.out.println(address);
    }
}
