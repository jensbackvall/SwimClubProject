public class PassiveMember extends Member {

    public PassiveMember() {

    }

    public void setIsActive() {
        isActive = false;
    }

    public double getFee() {
        return super.getFee() * 0.3125;
    }

}