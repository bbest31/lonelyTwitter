package ca.ualberta.cs.lonelytwitter;

/**
 * Created by bbest on 23/01/17.
 */

public class NormalTweet extends Tweet {

    public NormalTweet(String text) {
        super(text);
    }

    public Boolean isImportant() {

        return Boolean.FALSE;
    }
}
