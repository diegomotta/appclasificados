
package wp_adlisting;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Title {
    @SerializedName("rendered")
    private String rendered;

    /**
     * No args constructor for use in serialization
     *
     */
    public Title() {
    }

    /**
     *
     * @param rendered
     */
    public Title(String rendered) {
        this.rendered = rendered;
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

}
