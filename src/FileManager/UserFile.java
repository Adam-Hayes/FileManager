package FileManager;

import java.io.*;

public class UserFile {
    public void writeUser(String name, UserContainer userContainer) {
        File file = new File(name);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(userContainer);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readUser(String name ){
        try {
            FileInputStream fileInputStream = new FileInputStream(name);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            UserContainer userContainer = (UserContainer) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (IOException|ClassNotFoundException e) {
            System.out.println("something wrong");

        }

    }
}
