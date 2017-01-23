package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bbest on 23/01/17.
 */
public abstract class Tweet implements Tweetable {

    private String text;
    private Date date;

    public Tweet(String text) {
        this.text = text;
        this.date = new Date();
    }

    public Tweet(String text, Date date){
        this.text = text;
        this.date = date;

    }
    public abstract Boolean isImportant();

    public String getText() {
        return text;
    }

    public void setText(String text) throws TweetTooLongException {

        if(text.length() <= 140) {
            this.text = text;
        }
        else {
            throw new TweetTooLongException();
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
