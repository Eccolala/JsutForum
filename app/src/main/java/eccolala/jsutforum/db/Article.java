package eccolala.jsutforum.db;


public class Article {

    private String article_title;
    private String article_content;
    private String article_comments;

    public String getArticle_title() {
        return article_title;
    }

    public void setArticle_title(String article_title) {
        this.article_title = article_title;
    }

    public String getArticle_content() {
        return article_content;
    }

    public void setArticle_content(String article_content) {
        this.article_content = article_content;
    }

    public String getArticle_comments() {
        return article_comments;
    }

    public void setArticle_comments(String article_comments) {
        this.article_comments = article_comments;
    }
}
