
package wp_adlisting;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class WpTerm {

    private String taxonomy;
    private Boolean embeddable;
    private String href;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WpTerm() {
    }

    /**
     * 
     * @param embeddable
     * @param taxonomy
     * @param href
     */
    public WpTerm(String taxonomy, Boolean embeddable, String href) {
        this.taxonomy = taxonomy;
        this.embeddable = embeddable;
        this.href = href;
    }

    /**
     * 
     * @return
     *     The taxonomy
     */
    public String getTaxonomy() {
        return taxonomy;
    }

    /**
     * 
     * @param taxonomy
     *     The taxonomy
     */
    public void setTaxonomy(String taxonomy) {
        this.taxonomy = taxonomy;
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
