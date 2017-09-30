package FileManager;

import java.io.FileInputStream;
import java.util.InputMismatchException;

public class FileManagerMain {
    public static void main(String[] args) {
        ScannerWrapper scanner = new ScannerWrapper();
        UserContainer userContainer = new UserContainer();
        PhotoContainer photoContainer = new PhotoContainer();
        UserFile userFile = new UserFile();
        PhotoFile photoFile = new PhotoFile();
        Menu mainMenu = new Menu(userContainer, photoContainer);

        try {
            mainMenu.start();
        } catch (InputMismatchException ime) {
            System.out.println("Input the number please");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

