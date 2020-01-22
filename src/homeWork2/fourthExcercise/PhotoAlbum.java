package homeWork2.fourthExcercise;

import java.util.ArrayList;

public class PhotoAlbum {
    private ArrayList<Photo> photos;

    public PhotoAlbum(){

    }
    public PhotoAlbum(ArrayList<Photo> photos) {
        this.photos = photos;
    }

    public ArrayList<Photo> getPhotos() {
        int n = this.photos.size();
        ArrayList<Photo> photos = new ArrayList<Photo>();
        for(int i = 0; i < n; i++){
            photos.add(this.photos.get(i).copy());
        }
        return photos;
    }

    public void setPhotos(ArrayList<Photo> photos) {
        int n = photos.size();
        this.photos = new ArrayList<Photo>();
        for(int i = 0; i < n; i++){
            this.photos.add(photos.get(i).copy());
        }
    }

    public void addPhoto(Photo photo){
        Photo photo1 = photo.copy();
        photos.add(photo);
    }
    public void givePhotoNameByIndex(int i, String name){
        Photo photo = photos.get(i);
        photo.setName(name);
    }
    public void printQuantityOfPhotos(){
        photos.size();
    }
}
