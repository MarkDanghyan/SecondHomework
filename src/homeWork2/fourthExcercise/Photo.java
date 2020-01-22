package homeWork2.fourthExcercise;

public class Photo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Photo copy(){
        Photo photo = new Photo();
        photo.name = this.name;
        return photo;
    }
}
