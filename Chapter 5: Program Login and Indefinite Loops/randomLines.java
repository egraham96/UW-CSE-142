/* Write a method called randomLines that prints between 5 and 10 random strings of letters (between "a" and "z"), one per line. 
Each string should have random length of up to 80 characters.

rlcuhubm
ilons
ahidbxonunonheuxudxrcgdp
xmkmkmmmmwmwqjbaeeeerceheelciheihcreidercdeehiuhhhn
hdcrphdidcrydxgtkdhoendgcidgxfidgfufdgfuuuuuu
(Because this problem uses random numbers, our test cases check only the general format of your output. 
You must still examine the output yourself to make sure the answer is correct.) */


public static void randomLines() {
    Random random = new Random();
    int numberLines = random.nextInt(5) + 5;
    
    for (int i = 0; i < numberLines; i++) {
        System.out.println();
        int randomLength = random.nextInt(80);
        for (int j = 0; j < randomLength; j++){
            int randomChar = random.nextInt(26) + 97;
            System.out.print((char)randomChar);
        }
    } 
}
