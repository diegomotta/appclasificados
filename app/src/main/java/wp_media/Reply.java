
package wp_media;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Reply {

    private boolean embeddable;
    private String href;

    /**
     * 
     * @return
     *     The embeddable
     */
    public boolean isEmbeddable() {
        return embeddable;
    }

    /**
     * 
     * @param embeddable
     *     The embeddable
     */
    public void setEmbeddable(boolean embeddable) {
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
