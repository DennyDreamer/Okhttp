package com.ansen.okhttp;

/**
 * Created by Denny on 2017/11/13.
 */

public class SendCommentIds {
    String commentIds;
    String typeId="2";
    public void setCommentIds(String  commentIds)
    {
        this.commentIds=commentIds;
    }
    public void setTypeId(String typeId)
    {
        this.typeId=typeId;
    }
    public String getCommentIds()
    {
        return commentIds;
    }
    public String getTypeId()
    {
        return typeId;
    }
}
