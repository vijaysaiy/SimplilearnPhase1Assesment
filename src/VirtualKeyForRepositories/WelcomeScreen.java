package VirtualKeyForRepositories;
import java.util.Scanner;


public class WelcomeScreen {
    public void Intro(){
        String AppName = "Virtual Key For Your Repositories";
        String DeveloperName = "Vijaysai Yekbote";
        System.out.println("*****************************************************************");
        System.out.println("* Welcome to the " + AppName + " applicaiton! *");
        System.out.println("* Developer: " + DeveloperName +"                                   *");
        System.out.println("*****************************************************************");
    }

   public void MainMenu() {
       System.out.println("\nMain Menu");
       System.out.println("1.Show files\n2.File Options Menu\n3.Exit the application\n");
       boolean running = true;
       Scanner option = new Scanner(System.in);
       do {
           try {
               int input = option.nextInt();
               switch (input) {
                   case 1:
                       this.ShowFiles();
                       this.MainMenu();
                       break;
                   case 2: //pending
                       FileOptionsMenu FileMenu = new FileOptionsMenu();
                       FileMenu.show();
                       break;
                   case 3:
                       System.out.println("Quitting the application....");
                       System.out.println("Are you sure? Y/N");
                       Scanner sure = new Scanner(System.in);
                       String s = sure.nextLine();
                       if(s.equals("y") || s.equals("Y")) {
                           System.out.println("Applicaiton terminated");
                       running = false;
                       System.exit(0);}
                       else {
                           MainMenu();
                       }
                   default:
                       System.out.println("Invalid option,please enter invalid option");
                       break;
               }
           } catch (Exception e) {
               System.out.println(e.getClass().getName() + ": Please enter a valid option");
               MainMenu();

           }
       }
       while (running == true) ;
   }

    private void ShowFiles() {
        Directory obj = new Directory(); //Retrieve files from directory
        obj.getFiles();
    }
    }




