
package wp_adlisting;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Cury {

    private String name;
    private String href;
    private Boolean templated;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cury() {
    }

    /**
     * 
     * @param templated
     * @param name
     * @param href
     */
    public Cury(String name, String href, Boolean templated) {
        this.name = name;
        this.href = href;
        this.templated = templated;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
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

    /**
     * 
     * @return
     *     The templated
     */
    public Boolean getTemplated() {
        return templated;
    }

    /**
     * 
     * @param templated
     *     The templated
     */
    public void setTemplated(Boolean templated) {
        this.templated = templated;
    }

}
