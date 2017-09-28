package FileManager;

import Exercise_1.ScannerWrapper;

import java.util.Scanner;


public class Menu  {
    UserContainer userContainer;
    PhotoContainer photoContainer;
    ScannerWrapper scanner = new ScannerWrapper();

    public static void printHelp() {
        System.out.println("Hello,please select operation \n" +
                "1 - Create new user \n" +
                "2 - Create new photo \n" +
                "3 - Delete user\n" +
                "4 - Update user infomation\n" +
                "5 - Show user's photos\n" +
                "6 - Save the information" +
                "7 - Print  help menu \n" +
                "0 - Exit ");
    }

    public Menu(UserContainer userContainer,PhotoContainer photoContainer) {
        this.userContainer = userContainer;
        this.photoContainer = photoContainer;
    }

    public void Start(){
        Menu.printHelp();
        int i = -1;
        while (i!=0){
            i = scanner.readInt();

            switch (i){

                case 1 : addUser();
                        break;
                case 2 : addPhoto();
                        break;
                case 3 : deleteUser();
                        break;
                case 4 : show();
                        break;


                case 0 : return;
            }
        }
    }
    public  void addUser(){
        System.out.println("Enter the name");
        String name = scanner.readLine();
        System.out.println("Enter the user id");
        String id = scanner.readLine();
        System.out.println("Enter the login");
        String login = scanner.readLine();
        System.out.println("Enter the password");
        String password = scanner.readLine();
        User user = new User(name,id,login,password);
        userContainer.add(user);
    }
    public void addPhoto(){
        System.out.println("Enter the photo id");
        long id = scanner.readInt();
        System.out.println("Enter the weight");
        int weight = scanner.readInt();
        System.out.println("Enter the height");
        int height = scanner.readInt();
        Photo photo = new Photo(id,weight,height);
        photoContainer.add(photo);

    }
    public void deleteUser(){
        System.out.println("Enter the id");
        String id = scanner.readLine();
        userContainer.delete(id);
        System.out.println("Users has been deleted");
    }
    public  void  show(){
        userContainer.showAll();
    }
}


