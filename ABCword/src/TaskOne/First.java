package TaskOne;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class First {
        public static void main(String[] args) throws FileNotFoundException{
            File file = new File("ABCword\\src\\first.txt");
            Scanner sc = new Scanner(file);
            String str1 = sc.nextLine();
            char[] charArray = str1.toCharArray();
            int[] frequency = new int[26];

            
            for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                char lowerChar = Character.toLowerCase(charArray[i]);
                int index = lowerChar - 'a';
                frequency[index]++;
            }
        }

       
        for (int i = 0; i < 26; i++) {
            if (frequency[i] > 0) {
                char letter = (char) (i + 'a');
                System.out.println(letter + "" +  frequency[i]);
            }
        }
        }
}
