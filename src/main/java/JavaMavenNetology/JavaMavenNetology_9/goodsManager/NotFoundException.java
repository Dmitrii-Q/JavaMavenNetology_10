package JavaMavenNetology.JavaMavenNetology_9.goodsManager;

public class NotFoundException extends RuntimeException {
    public NotFoundException(int ID) {
        super("Element with id: " + ID + " not found");
    }
}
