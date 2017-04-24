package edu.matc.entity;

/**
 * Created by student on 4/18/17.
 */
public class EventTypes {

    String category;
    String description;
    String photo;

    /**
     * Instantiates a new EventType.
     */
    public EventTypes() {
    }

    /**
     * Instantiates a new EventType.
     *
     * @param category   the first name
     * @param description    the last name
     * @param photo    the username
     */
    public EventTypes(String category, String description, String photo) {
        this.category = category;
        this.description = description;
        this.photo = photo;
    }

    /**
    * Gets Category.
     *
     * @return the Category
     */
    public String getCategory() {
        return category;
    }
    /**
     * Sets Category.
     *
     * @param category the Category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets Photo.
     *
     * @return the Photo location
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * Sets photo.
     *
     * @param photo the photo
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }


}
