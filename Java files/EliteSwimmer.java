public class EliteSwimmer extends Member {

    private boolean butterfly;
    private boolean breast;
    private boolean crawl;
    private boolean backCrawl;
    private boolean backStroke;
    private boolean medley200Women;
    private boolean medley200Men;
    private boolean marathon10K;
    private boolean winterSwim;
    private boolean dogPaddle;

    public EliteSwimmer() {

    }

    public void setIsActive() {
        isActive = true;
    }

    public boolean getButterfly() {
        return butterfly;
    }

    public boolean getBreast() {
        return breast;
    }

    public boolean getCrawl() {
        return crawl;
    }

    public boolean getBackCrawl() {
        return backCrawl;
    }

    public boolean getBackStroke() {
        return backStroke;
    }

    public boolean getMedley200Women() {
        return medley200Women;
    }

    public boolean getMedley200Men() {
        return medley200Men;
    }

    public boolean getMarathon10K() {
        return marathon10K;
    }

    public boolean getWinterSwim() {
        return winterSwim;
    }

    public boolean getDogPaddle() {
        return dogPaddle;
    }

}