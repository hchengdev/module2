public class SocialMediaFacade {
    private Facebook facebook;
    private Twitter twitter;
    private LinkedIn linkedIn;

    public SocialMediaFacade(Twitter twitter, Facebook facebook, LinkedIn linkedIn) {
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedIn = linkedIn;
    }

    public void share(String msg) {
        this.twitter.setMessage(msg);
        this.facebook.setMessage(msg);
        this.linkedIn.setMessage(msg);
        this.twitter.share();
        this.facebook.share();
        this.linkedIn.share();
    }
}
