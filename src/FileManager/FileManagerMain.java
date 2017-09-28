package FileManager;

import Exercise_1.ScannerWrapper;

import java.io.FileInputStream;

public class FileManagerMain {
    public static void main(String[] args) {
        ScannerWrapper scanner = new ScannerWrapper();
        UserContainer userContainer = new UserContainer();
        PhotoContainer photoContainer = new PhotoContainer();
        UserFile userFile = new UserFile();
        PhotoFile photoFile = new PhotoFile();
        Menu mainMenu = new Menu(userContainer,photoContainer);

        mainMenu.Start();

        }
}

