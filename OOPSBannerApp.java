/**
* 00PSBannerApp UC3 00PS Banner Application (Use Case 3)
* This class extends the functionality of Use Case 2 by improving the way the "00PS" banner * 
* is constructed and displayed. It focuses on enhancing code readability and efficiency by utilizing the String.join() method to create each line of the banner. 
* This approach * overcomes the drawbacks of using the operator for string concatenation, which can lead
* to code inefficiency due to the creation of multiple intermediate String objects in memory.
*
* @author Mohammed Rezin
* @version 3.0
*/
// Extend use case UC2 to use String.join() method to create each line of the "00PS" banner
// instead of concatenating strings with the operator. This is essentially to overcome the
// drawbacks of using the operator for string concatenation which essentially creates
// multiple intermediate String objects in memory leading to inefficiency.

public class OOPSBannerApp{
    public static void main(String[] args) {
        System.out.println(String.join(" ******** " + " ******** " + " ******** " + " ******** "));
        System.out.println(String.join("*        *" + "*        *" + "*        *" + "*        "));
        System.out.println(String.join("*        *" + "*        *" + "*        *" + "*        "));
        System.out.println(String.join("*        *" + "*        *" + " ******** " + " ******** "));
        System.out.println(String.join("*        *" + "*        *" + "*        " + "        *"));
        System.out.println(String.join("*        *" + "*        *" + "*        " + "        *"));
        System.out.println(String.join(" ******** " + " ******** " + "*        " + " ******** "));
    }
}
