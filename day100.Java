public class Day100 {

    public static String cekStringCantik(String s) {
    
        boolean foundI = false;
        boolean foundS = false;
        boolean foundC = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'I') {
              
                foundI = true;
            } else if (ch == 'S') {
                
                if (foundI && !foundC) {
                    foundS = true;
                }
            } else if (ch == 'C') {
                
                if (foundI && foundS) {
                    foundC = true;
                    
                    break;
                }
            }
        }

        if (foundI && foundS && foundC) {
            return "CANTIK";
        } else {
            return "TIDAK CANTIK";
        }
    }

    public static void main(String[] args) {
       
        String[] inputs = {
            "INFORMATICSSTUDYCLUB",
            "ICSISS",
            "SATUHATISATUCINTA",
            "MIMIMIMIMISUSU"
        };

        for (String input : inputs) {
            System.out.println(cekStringCantik(input));
        }
    }
}
