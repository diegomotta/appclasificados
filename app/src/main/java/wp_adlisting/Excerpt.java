
package wp_adlisting;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Excerpt {

    private String rendered;
    private Boolean _protected;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Excerpt() {
    }

    /**
     * 
     * @param rendered
     * @param _protected
     */
    public Excerpt(String rendered, Boolean _protected) {
        this.rendered = rendered;
        this._protected = _protected;
    }

    /**
     * 
     * @return
     *     The rendered
     */
    public String getRendered() {
        return rendered;
    }

    /**
     * 
     * @param rendered
     *     The rendered
     */
    public void setRendered(String rendered) {
        this.rendered = rendered;
    }

    /**
     * 
     * @return
     *     The _protected
     */
    public Boolean getProtected() {
        return _protected;
    }

    /**
     * 
     * @param _protected
     *     The protected
     */
    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

}
