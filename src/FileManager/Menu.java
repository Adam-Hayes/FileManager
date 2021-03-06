package FileManager;


import java.util.InputMismatchException;

public class Menu {
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
                "6 - Save the information \n" +
                "7 - Print  help menu \n" +
                "0 - Exit  ");
    }

    public Menu(UserContainer userContainer, PhotoContainer photoContainer) {
        this.userContainer = userContainer;
        this.photoContainer = photoContainer;
    }

    public void start() throws InputMismatchException {
        Menu.printHelp();
        try {
            int i = -1;
            while (i != 0) {
                i = scanner.readInt();

                switch (i) {

                    case 1:
                        addUser();
                        Menu.printHelp();
                        break;
                    case 2:
                        addPhoto();
                        Menu.printHelp();
                        break;
                    case 3:
                        deleteUser();
                        Menu.printHelp();
                        break;
                    case 4:
                        show();
                        Menu.printHelp();
                        break;

                    case 0:
                        return;

                }
            }

        } catch (InputMismatchException imo) {
            System.out.println("input a number");
        }
    }


    public void addUser() {
        System.out.println("Enter the name");
        String name = scanner.readLine();
        System.out.println("Enter the login");
        String login = scanner.readLine();
        System.out.println("Enter the password");
        String password = scanner.readLine();
        User user = new User(name, login, password);
        userContainer.add(user);
    }

    public void addPhoto() {
        System.out.println("Enter the photo id");
        long id = scanner.readInt();
        System.out.println("Enter the weight");
        int weight = scanner.readInt();
        System.out.println("Enter the height");
        int height = scanner.readInt();
        Photo photo = new Photo(id, weight, height);
        photoContainer.add(photo);

    }

    public void deleteUser() {
        System.out.println("Enter the login");
        String login = scanner.readLine();
        userContainer.delete(login);
        System.out.println("User has been deleted");
    }

    public void show() {
        userContainer.showAll();
    }
}


