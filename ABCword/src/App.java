
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        System.out.println("Hello, World!");
        String path = "ABCword\\src\\first.txt";
        String path2 = "ABCword\\src\\second.txt";
        File firstFile = new File(path2);

        try {
           // File file = new File(fileName);
            
            
            BufferedReader br = new BufferedReader(new FileReader(firstFile));
            Scanner sc = new Scanner(br);
            // Array to store letter frequencies (26 letters, A-Z)
            int[] frequency = new int[26];

            // Read the file line by line
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                char[] charArray = line.toCharArray();

                for (char c : charArray) {
                    if (Character.isLetter(c)) {
                        char lowerChar = Character.toLowerCase(c);
                        int index = lowerChar - 'a';
                        frequency[index]++;
                    }
                }
            }
            sc.close();

            // Print letter frequencies
            for (int i = 0; i < 26; i++) {
                if (frequency[i] > 0) {
                    char letter = (char) (i + 'a');
                    System.out.println(letter + ": " + frequency[i]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + firstFile);
        }
        
    }
    }
