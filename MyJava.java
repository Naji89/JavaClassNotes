public class MyJava {
 public static void main (String[] args) {

    byte b = 1;
    short s = 11;
    int i = 111;
    long l = 1111L;
    float f = 1.1111111F;
    double  d = 1.1111111111;

    boolean isTrue = true;
    char a = 'a';

    // {data type} {variable name};
    // {data type} {variable name} = {value};

    //String baxa = "Bakhtiyour";
    //String baxa = new  String("Bakhtiyour");

    String str = "Taj iki stan 19 91";

    str = str.replaceAll(" ", "");
    System.out.println(str);

    String stringNumber = "12345";

    int thisIsInteger = Integer.parseInt(stringNumber);

    System.out.println(thisIsInteger);


    String firstName = "Najib Rahmatulloev";

    //String firstString = firstName.substing(0);
    //String lastString = firstName.charAt(6);

   // String newString = firstName.charAt(0) + firstName.charAt(6);

   int newLastName = firstName.indexOf(" ") + 1;
   System.out.println(firstName.charAt(0) + "." + firstName.charAt(newLastName));






    }

}   