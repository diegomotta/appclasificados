
package wp_adlisting;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Post {

    private Integer id;
    private String date;
    private String dateGmt;
    private Guid guid;
    private String modified;
    private String modifiedGmt;
    private String slug;
    private String type;
    private String link;
    private Title title;
    private Content content;
    private Excerpt excerpt;
    private Integer author;
    private String commentStatus;
    private String pingStatus;
    private List<Integer> adCat = new ArrayList<Integer>();
    private Links links;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Post() {
    }

    /**
     * 
     * @param commentStatus
     * @param excerpt
     * @param link
     * @param links
     * @param dateGmt
     * @param date
     * @param type
     * @param pingStatus
     * @param adCat
     * @param modified
     * @param id
     * @param guid
     * @param modifiedGmt
     * @param content
     * @param author
     * @param title
     * @param slug
     */
    public Post(Integer id, String date, String dateGmt, Guid guid, String modified, String modifiedGmt, String slug, String type, String link, Title title, Content content, Excerpt excerpt, Integer author, String commentStatus, String pingStatus, List<Integer> adCat, Links links) {
        this.id = id;
        this.date = date;
        this.dateGmt = dateGmt;
        this.guid = guid;
        this.modified = modified;
        this.modifiedGmt = modifiedGmt;
        this.slug = slug;
        this.type = type;
        this.link = link;
        this.title = title;
        this.content = content;
        this.excerpt = excerpt;
        this.author = author;
        this.commentStatus = commentStatus;
        this.pingStatus = pingStatus;
        this.adCat = adCat;
        this.links = links;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The date
     */
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The dateGmt
     */
    public String getDateGmt() {
        return dateGmt;
    }

    /**
     * 
     * @param dateGmt
     *     The date_gmt
     */
    public void setDateGmt(String dateGmt) {
        this.dateGmt = dateGmt;
    }

    /**
     * 
     * @return
     *     The guid
     */
    public Guid getGuid() {
        return guid;
    }

    /**
     * 
     * @param guid
     *     The guid
     */
    public void setGuid(Guid guid) {
        this.guid = guid;
    }

    /**
     * 
     * @return
     *     The modified
     */
    public String getModified() {
        return modified;
    }

    /**
     * 
     * @param modified
     *     The modified
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * 
     * @return
     *     The modifiedGmt
     */
    public String getModifiedGmt() {
        return modifiedGmt;
    }

    /**
     * 
     * @param modifiedGmt
     *     The modified_gmt
     */
    public void setModifiedGmt(String modifiedGmt) {
        this.modifiedGmt = modifiedGmt;
    }

    /**
     * 
     * @return
     *     The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 
     * @param slug
     *     The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The link
     */
    public String getLink() {
        return link;
    }

    /**
     * 
     * @param link
     *     The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 
     * @return
     *     The title
     */
    public Title getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(Title title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The content
     */
    public Content getContent() {
        return content;
    }

    /**
     * 
     * @param content
     *     The content
     */
    public void setContent(Content content) {
        this.content = content;
    }

    /**
     * 
     * @return
     *     The excerpt
     */
    public Excerpt getExcerpt() {
        return excerpt;
    }

    /**
     * 
     * @param excerpt
     *     The excerpt
     */
    public void setExcerpt(Excerpt excerpt) {
        this.excerpt = excerpt;
    }

    /**
     * 
     * @return
     *     The author
     */
    public Integer getAuthor() {
        return author;
    }

    /**
     * 
     * @param author
     *     The author
     */
    public void setAuthor(Integer author) {
        this.author = author;
    }

    /**
     * 
     * @return
     *     The commentStatus
     */
    public String getCommentStatus() {
        return commentStatus;
    }

    /**
     * 
     * @param commentStatus
     *     The comment_status
     */
    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    /**
     * 
     * @return
     *     The pingStatus
     */
    public String getPingStatus() {
        return pingStatus;
    }

    /**
     * 
     * @param pingStatus
     *     The ping_status
     */
    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    /**
     * 
     * @return
     *     The adCat
     */
    public List<Integer> getAdCat() {
        return adCat;
    }

    /**
     * 
     * @param adCat
     *     The ad_cat
     */
    public void setAdCat(List<Integer> adCat) {
        this.adCat = adCat;
    }

    /**
     * 
     * @return
     *     The links
     */
    public Links getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The _links
     */
    public void setLinks(Links links) {
        this.links = links;
    }

}
