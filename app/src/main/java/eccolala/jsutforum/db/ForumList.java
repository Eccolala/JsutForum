package eccolala.jsutforum.db;

import cn.bmob.v3.BmobObject;


public class ForumList extends BmobObject {
    private String forum_title;
    private String forum_content;
    private String forum_comments;

    public String getForum_title() {
        return forum_title;
    }

    public void setForum_title(String forum_title) {
        this.forum_title = forum_title;
    }

    public String getForum_content() {
        return forum_content;
    }

    public void setForum_content(String forum_content) {
        this.forum_content = forum_content;
    }

    public String getForum_comments() {
        return forum_comments;
    }

    public void setForum_comments(String forum_comments) {
        this.forum_comments = forum_comments;
    }


}
