public class AnagramChecker implements IAnagramChecker {
    public boolean isAnagram(String word1, String word2) {

        int tab1[] = new int[36];
        int tab2[] = new int[36];

        int temp;

        for(int i = 0; i < word1.length(); i++) {
            temp = (int) word1.charAt(i);
            if(temp > 64 && temp < 91) temp += 32;
            switch (temp) {
                case 48:
                    tab1[0]++;
                    break;
                case 49:
                    tab1[1]++;
                    break;
                case 50:
                    tab1[2]++;
                    break;
                case 51:
                    tab1[3]++;
                    break;
                case 52:
                    tab1[4]++;
                    break;
                case 53:
                    tab1[5]++;
                    break;
                case 54:
                    tab1[6]++;
                    break;
                case 55:
                    tab1[7]++;
                    break;
                case 56:
                    tab1[8]++;
                    break;
                case 57:
                    tab1[9]++;
                    break;
                default:
                    if(temp > 96 && temp < 123) tab1[132 - temp]++;
                    break;

            }
        }

        for(int i = 0; i < word2.length(); i++) {
            temp = (int) word2.charAt(i);
            if(temp > 64 && temp < 91) temp += 32;
            switch (temp) {
                case 48:
                    tab2[0]++;
                    break;
                case 49:
                    tab2[1]++;
                    break;
                case 50:
                    tab2[2]++;
                    break;
                case 51:
                    tab2[3]++;
                    break;
                case 52:
                    tab2[4]++;
                    break;
                case 53:
                    tab2[5]++;
                    break;
                case 54:
                    tab2[6]++;
                    break;
                case 55:
                    tab2[7]++;
                    break;
                case 56:
                    tab2[8]++;
                    break;
                case 57:
                    tab2[9]++;
                    break;
                default:
                    if(temp > 96 && temp < 123) tab2[132 - temp]++;
                    break;

            }
        }

        for(int i = 0; i < 36; i++) {
            if(tab1[i] != tab2[i]) return false;
        }

        return true;
    }
}
