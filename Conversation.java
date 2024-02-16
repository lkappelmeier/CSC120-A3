import java.util.Scanner;
import java.util.Arrays;
class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
  Scanner sc = new Scanner(System.in);
  String userTranscript[] = new String[0];
  System.out.println("How many iterations of conversation?");
  userTranscript = Arrays.copyOf(userTranscript, userTranscript.length + 1);
  userTranscript[userTranscript.length - 1] = "How many iterations of conversation?";
  String rounds = sc.nextLine();
  userTranscript = Arrays.copyOf(userTranscript, userTranscript.length + 1);
  userTranscript[userTranscript.length - 1] = rounds;
  int roundsInt = Integer.parseInt(rounds);
  System.out.println("Hello! What do you want to talk about?");  
  userTranscript = Arrays.copyOf(userTranscript, userTranscript.length + 1);
  userTranscript[userTranscript.length - 1] = "Hello! What do you want to talk about?";
  int i = 0;
 
  while (i < roundsInt) {
   
    String userInput = sc.nextLine();
    userTranscript = Arrays.copyOf(userTranscript, userTranscript.length + 1);
  userTranscript[userTranscript.length - 1] = userInput;
    if (userInput.contains("Happy")){
      System.out.println("Thank you!");
      userTranscript = Arrays.copyOf(userTranscript, userTranscript.length + 1);
      userTranscript[userTranscript.length - 1] = "Thank you!";
    } else if(userInput.contains("Thank you")||userInput.contains("thank you")) {
  System.out.println("You're welcome!");
  userTranscript = Arrays.copyOf(userTranscript, userTranscript.length + 1);
  userTranscript[userTranscript.length - 1] = "You're welcome!";
    } else if(userInput.contains("music")){
      System.out.println("I love music!");
      userTranscript = Arrays.copyOf(userTranscript, userTranscript.length + 1);
  userTranscript[userTranscript.length - 1] = "I love music!";
    } else if(userInput.contains("grade")){
      System.out.println("Yes! You will get a good grade on assignment 3 in CSC 120!");
      userTranscript = Arrays.copyOf(userTranscript, userTranscript.length + 1);
  userTranscript[userTranscript.length - 1] = "Yes! You will get a good grade on assignment 3 in CSC 120!";
    } else if(userInput.contains("I")) {
      System.out.println("Do you do that often?");
      userTranscript = Arrays.copyOf(userTranscript, userTranscript.length + 1);
  userTranscript[userTranscript.length - 1] = "Do you do that often?";
    } else if (userInput.contains("me")){
    System.out.println("And what do you expect me to do about that?");
    userTranscript = Arrays.copyOf(userTranscript, userTranscript.length + 1);
  userTranscript[userTranscript.length - 1] = "And what do you expect me to do about that";
    } else if(userInput.contains("am")){
      System.out.println("You are doing that a lot these days!");
      userTranscript = Arrays.copyOf(userTranscript, userTranscript.length + 1);
  userTranscript[userTranscript.length - 1] = "You are doing that a lot these days!";
    } else if (userInput.contains("you")){
      System.out.println("I agree!");
      userTranscript = Arrays.copyOf(userTranscript, userTranscript.length + 1);
  userTranscript[userTranscript.length - 1] = "I agree!";
    } else if(userInput.contains("my")){
      System.out.println("Yours is very nice, yes!");
      userTranscript = Arrays.copyOf(userTranscript, userTranscript.length + 1);
  userTranscript[userTranscript.length - 1] = "Yours is very nice, yes!";
    } else if (userInput.contains("your")){
      System.out.println("I am just a program, and therefore do not have possession over things!");
      userTranscript = Arrays.copyOf(userTranscript, userTranscript.length + 1);
  userTranscript[userTranscript.length - 1] = "I am just a program, and therefore do not have possession over things!";
    } else if (i == 1||i == 4){
      System.out.println("Well, I think that is lovely!");
      userTranscript = Arrays.copyOf(userTranscript, userTranscript.length + 1);
  userTranscript[userTranscript.length - 1] = "Well, I think that is lovely";
    } else if (i==2 || i == 5){
      System.out.println("How fascinating!");
      userTranscript = Arrays.copyOf(userTranscript, userTranscript.length + 1);
  userTranscript[userTranscript.length - 1] = "How fascinating!";
    } else if (i==0 || i==3 || i == 6) {
        System.out.println("I would love to hear more!");
        userTranscript = Arrays.copyOf(userTranscript, userTranscript.length + 1);
  userTranscript[userTranscript.length - 1] = "I would love to hear more!";
    } else {
        System.out.println("You're still talking?");
        userTranscript = Arrays.copyOf(userTranscript, userTranscript.length + 1);
        userTranscript[userTranscript.length - 1] = "You're still talking?";
      };
      i++;
    };
  System.out.println("Alrighty! Goodbye!");
  userTranscript = Arrays.copyOf(userTranscript, userTranscript.length + 1);
  userTranscript[userTranscript.length - 1] = "Alrighty! Goodbye!";
  sc.close();
  for (String arr : userTranscript) {
    System.out.println(arr);
  }
};
};
