/* 00PSBannerApp UC7 Store Character Pattern in a Class
This use case extends UC6 by implementing a CharacterPatternMap class to encapsulate
* character-to-pattern mappings. The application retrieves and displays the "00PS"
* banner using these mappings. This approach enhances code organization and modularity.
*
* @author Tarun S
* @version 7.0
*/
// Extend the User Story 6 to implement a CharacterPatternMap class to encapsulate
// character-to-pattern mappings. The application retrieves and displays the "00PS" // centralized character pattern management system.
// banner using these mappings. Thereby addressing the drawback of not having
// Key Requirements:
// 1. Create CharacterPatternMap class to hold character and its pattern
// 2. Implement methods to create and retrieve character patterns
// 3. Use CharacterPatternMap to display the "00PS" banner
// 4. Implement modular and reusable character pattern management

public class OOPSBannerApp {
    public static class CharacterPattern {
        private char character;
        private String[] pattern;
        
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static StringBuilder[] buildBanner(CharacterPattern[] patterns) {
        StringBuilder[] lines = new StringBuilder[7];
        for (int i = 0; i < 7; i++) {
            lines[i] = new StringBuilder();
        }

        for (CharacterPattern cp : patterns) {
            String[] p = cp.getPattern();
            for (int i = 0; i < 7; i++) {
                lines[i].append(p[i]).append("  ");
            }
        }
        return lines;
    }

    public static void main(String[] args) {
        String[] patternO = {
            "  *** ",
            " *    * ",
            " *    * ",
            " *    * ",
            " *    * ",
            " *    * ",
            "  *** "
        };

        String[] patternP = {
            " ***** ",
            " *    *",
            " *    *",
            " ***** ",
            " * ",
            " * ",
            " * "
        };

        String[] patternS = {
            "  **** ",
            " * ",
            " * ",
            "  *** ",
            "     * ",
            "     * ",
            " **** "
        };

        CharacterPattern charO = new CharacterPattern('O', patternO);
        CharacterPattern charP = new CharacterPattern('P', patternP);
        CharacterPattern charS = new CharacterPattern('S', patternS);

        CharacterPattern[] oops = { charO, charO, charP, charS };

        StringBuilder[] bannerLines = buildBanner(oops);
        
        for (StringBuilder line : bannerLines) {
            System.out.println(line.toString());
        }
    }
}
