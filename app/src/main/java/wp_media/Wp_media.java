package wp_media;

import com.google.gson.annotations.SerializedName;


/**
 * Created by diego on 31/10/16.
 */
public class Wp_media {
    @SerializedName("id")
    private Integer id;
    @SerializedName("date")
    private String date;
    @SerializedName("date_gmt")
    private String date_gmt;
    @SerializedName("guid")
    private Guid guid;
    @SerializedName("modified")
    private String modified;
    @SerializedName("modified_gmt")
    private String modified_gmt;
    @SerializedName("slug")
    private String slug;
    @SerializedName("type")
    private String type;
    @SerializedName("link")
    private String link;
    @SerializedName("title")
    private Title title;
    @SerializedName("author")
    private Integer author;
    @SerializedName("comment_status")
    private String comment_status;
    @SerializedName("ping_status")
    private String ping_status;
    @SerializedName("alt_text")
    private String alt_text;
    @SerializedName("caption")
    private String caption;
    @SerializedName("description")
    private String description;
    @SerializedName("media_type")
    private String media_type;
    @SerializedName("mime_type")
    private String mime_type;
    @SerializedName("media_details")
    private MediaDetails media_details;
    @SerializedName("post")
    private Integer post;
    @SerializedName("source_url")
    private String source_url;
    @SerializedName("_links")
    private Links _links;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate_gmt() {
        return date_gmt;
    }

    public void setDate_gmt(String date_gmt) {
        this.date_gmt = date_gmt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSource_url() {
        return source_url;
    }

    public void setSource_url(String source_url) {
        this.source_url = source_url;
    }

    public Links get_links() {
        return _links;
    }

    public void set_links(Links _links) {
        this._links = _links;
    }

    public Integer getPost() {
        return post;
    }

    public void setPost(Integer post) {
        this.post = post;
    }

    public String getMime_type() {
        return mime_type;
    }

    public void setMime_type(String mime_type) {
        this.mime_type = mime_type;
    }

    public MediaDetails getMedia_details() {
        return media_details;
    }

    public void setMedia_details(MediaDetails media_details) {
        this.media_details = media_details;
    }

    public String getMedia_type() {
        return media_type;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getAlt_text() {
        return alt_text;
    }

    public void setAlt_text(String alt_text) {
        this.alt_text = alt_text;
    }

    public String getPing_status() {
        return ping_status;
    }

    public void setPing_status(String ping_status) {
        this.ping_status = ping_status;
    }

    public String getComment_status() {
        return comment_status;
    }

    public void setComment_status(String comment_status) {
        this.comment_status = comment_status;
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Guid getGuid() {
        return guid;
    }

    public void setGuid(Guid guid) {
        this.guid = guid;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getModified_gmt() {
        return modified_gmt;
    }

    public void setModified_gmt(String modified_gmt) {
        this.modified_gmt = modified_gmt;
    }
}
