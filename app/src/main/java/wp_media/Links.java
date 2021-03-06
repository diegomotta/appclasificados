
package wp_media;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Links {

    private List<Self> self = new ArrayList<Self>();
    private List<Collection> collection = new ArrayList<Collection>();
    private List<About> about = new ArrayList<About>();
    private List<Author> author = new ArrayList<Author>();
    private List<Reply> replies = new ArrayList<Reply>();

    /**
     * 
     * @return
     *     The self
     */
    public List<Self> getSelf() {
        return self;
    }

    /**
     * 
     * @param self
     *     The self
     */
    public void setSelf(List<Self> self) {
        this.self = self;
    }

    /**
     * 
     * @return
     *     The collection
     */
    public List<Collection> getCollection() {
        return collection;
    }

    /**
     * 
     * @param collection
     *     The collection
     */
    public void setCollection(List<Collection> collection) {
        this.collection = collection;
    }

    /**
     * 
     * @return
     *     The about
     */
    public List<About> getAbout() {
        return about;
    }

    /**
     * 
     * @param about
     *     The about
     */
    public void setAbout(List<About> about) {
        this.about = about;
    }

    /**
     * 
     * @return
     *     The author
     */
    public List<Author> getAuthor() {
        return author;
    }

    /**
     * 
     * @param author
     *     The author
     */
    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    /**
     * 
     * @return
     *     The replies
     */
    public List<Reply> getReplies() {
        return replies;
    }

    /**
     * 
     * @param replies
     *     The replies
     */
    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }

}
