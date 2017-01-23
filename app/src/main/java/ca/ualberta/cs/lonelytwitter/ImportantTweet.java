package ca.ualberta.cs.lonelytwitter;

/**
 * Created by bbest on 23/01/17.
 */

public class ImportantTweet extends Tweet {

    public ImportantTweet(String text) {
        super(text);
    }

    public Boolean isImportant() {
        return Boolean.TRUE;
    }
    @Override
    public String getText() {
        return super.getText()+"!!!";
    }

}
