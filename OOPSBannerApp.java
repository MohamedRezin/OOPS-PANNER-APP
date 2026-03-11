/**
* 00PSBannerApp UC6 00PS Banner Application (Use Case 6)
* This use case extends UC5 by implementing a modular approach to generate each
* letter's pattern through dedicated methods. This enhances code reusability and
* maintainability by separating pattern generation logic from the main display logic.
* @author Tarun S
* @version 6.0
*/
// Extend the User Story 5 to display the OOPS banner using a modular approach -

public class OOPSBannerApp{
    public static void main(String[] args) {
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) 
        {
            banner[i] = String.join("  ",
                    oPattern[i],
                    oPattern[i],
                    pPattern[i],
                    sPattern[i]);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    public static String[] getOPattern() {
        return new String[]{
                " ******** ",
                "*        *",
                "*        *",
                "*        *",
                "*        *",
                "*        *",
                " ******** "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
                " ******** ",
                "*        *",
                "*        *",
                " ******** ",
                "*        ",
                "*        ",
                "*        "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
                " ******** ",
                "*        ",
                "*        ",
                " ******** ",
                "        *",
                "        *",
                " ******** "
        };
    }
}
