class Main {
  
  static boolean isPalindrome(String testString) {

    int reverseString = 0;
    int inputString = testString.length() - 1;

    for(int i = 0; i < testString.length(); i++) {
      if(testString.charAt(reverseString) == testString.charAt(inputString)) {
        /*If the charAt() each starting and end position equal each other,
          then it is a palindrome*/

        System.out.println(testString + " is a palindrome.");
        return true; //Says that the inserted word is a palindrome
      }

      inputString--; //Starts at the end of the inserted string's length and counts down
      reverseString++; //Starts at 0 and counts up
    }

    System.out.println(testString + " is not a palindrome.");
    return false; //Says that the inserted word is not a palindrome
  }
  public static void main(String[] args) {
    isPalindrome("racecar");
    isPalindrome("spam");
  }
}