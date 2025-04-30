//Find a datatype which are capable of holding Phone Number;
class PhoneNumberDatatype {
    public static void main(String[] args) {
        //int a = 8764532101; //error: integer number too large
        long b = 8764532101L; //8764532101
        double c = 8764532101D; // 8.764532101E9
        float d = 8764532101f; //8.764532E9

        //System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
