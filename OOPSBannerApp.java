/**
* 00PSBannerApp Use Map for Character Patterns and Render via Function
* This use case extends UC7 by utilizing advanced Object-Oriented Programming concepts
* such as the Collections Framework to manage character patterns in a more flexible
* and efficient manner. The application retrieves and displays the "00PS" banner
using a HashMap there by enhancing code organization and modularity.
* @author Tarun S
* @version 8.0
*/

// Extend the User Story 7 to utilize advanced Object-Oriented Programming concepts
// such as the Collections Framework to manage character patterns in a more flexible
// and efficient manner. The application retrieves and displays the "00PS" banner
// using these mappings.
// Key Requirements:
// 1. Use HashMap to store ASCII art patterns for characters
// 2. Create methods to generate and retrieve character patterns
// 3. Retrieve and display patterns for the message "00PS"
// 4. Implement modular and reusable character pattern system
// 5. Utilize Collections Framework for pattern management

import java.util.HashMap;

public class OOPSBannerApp {
    public static HashMap<Character, String[]> getCharacterPatternMap() {
        HashMap<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
            "  *** ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            "  *** "
        });

        patternMap.put('P', new String[]{
            " ***** ",
            " *   *",
            " *   *",
            " ***** ",
            " * ",
            " * ",
            " * "
        });

        patternMap.put('S', new String[]{
            "  **** ",
            " * ",
            " * ",
            "  *** ",
            "      * ",
            "      * ",
            " **** "
        });

        return patternMap;
    }

    public static void displayBanner(String word, HashMap<Character, String[]> patternMap) {
        // A banner consists of 7 horizontal rows
        for (int i = 0; i < 7; i++) {
            StringBuilder row = new StringBuilder();
            
            // Convert word to char array and process each letter
            for (char c : word.toUpperCase().toCharArray()) {
                if (patternMap.containsKey(c)) {
                    // Append the specific row index (i) for the current character
                    row.append(patternMap.get(c)[i]).append("  ");
                }
            }
            // Print the completed horizontal line
            System.out.println(row.toString());
        }
    }

    public static void main(String[] args) {
        HashMap<Character, String[]> patterns = getCharacterPatternMap();

        String message = "OOPS";

        System.out.println("--- OOPS Banner (UC8: Direct HashMap) ---");
        displayBanner(message, patterns);
    }
}
