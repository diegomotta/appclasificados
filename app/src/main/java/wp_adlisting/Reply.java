
package wp_adlisting;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Reply {

    private Boolean embeddable;
    private String href;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Reply() {
    }

    /**
     * 
     * @param embeddable
     * @param href
     */
    public Reply(Boolean embeddable, String href) {
        this.embeddable = embeddable;
        this.href = href;
    }

    /**
     * 
     * @return
     *     The embeddable
     */
    public Boolean getEmbeddable() {
        return embeddable;
    }

    /**
     * 
     * @param embeddable
     *     The embeddable
     */
    public void setEmbeddable(Boolean embeddable) {
        this.embeddable = embeddable;
    }

    /**
     * 
     * @return
     *     The href
     */
    public String getHref() {
        return href;
    }

    /**
     * 
     * @param href
     *     The href
     */
    public void setHref(String href) {
        this.href = href;
    }

}
