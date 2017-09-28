package FileManager;

import java.util.ArrayList;
import java.util.List;

public class PhotoContainer {
    public int counter;
    List<Photo> photos = new ArrayList<>();

    public void add(Photo photo) {
        Photo newPhoto = new Photo();
       photos.add(newPhoto);

    }
}
