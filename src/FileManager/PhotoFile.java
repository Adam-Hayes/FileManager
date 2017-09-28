package FileManager;

import Exercise_1.ScannerWrapper;

import java.io.*;

public class PhotoFile {
    public void writePhoto(String name, PhotoContainer photoContainer) {
        File file = new File(name);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(photoContainer);
            objectOutputStream.close();
            fileOutputStream.close();
        }
         catch (IOException e) {
            e.printStackTrace();
        }

    }
    public  void readPhoto(String name){
        File file = new File(name);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            PhotoContainer photoContainer =(PhotoContainer) objectInputStream.readObject();
            System.out.println(photoContainer.toString());
            fileInputStream.close();
            objectInputStream.close();
        } catch (IOException |ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
