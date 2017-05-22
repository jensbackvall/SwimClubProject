public class Coach extends Member {

    public Coach(String firstName, String surName, String email, String birthDate, String memberID,
                 String password, boolean isFemale, double fee) {
        super(firstName, surName, email, birthDate, memberID, password, isFemale, fee);
    }

    public double getFee() {
        return super.getFee() * -1;
    }

}