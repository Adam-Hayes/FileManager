package FileManager;

import java.io.Serializable;

public class Photo implements Serializable {
    private long id;
    private int weight;
    private int height;

    public Photo() {

    }

    public Photo(long id, int weight, int height) {
        this.id = id;
        this.weight = weight;
        this.height = height;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
