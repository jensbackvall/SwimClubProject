public class Coach extends Member {

    public Coach(String firstName, String surName, String email, String birthDate, String memberID,
                 String password, boolean isFemale, boolean isTrainer, double fee,) {
        super(firstName, surName, email, birthDate, memberID, password, isFemale, isTrainer fee);
    }

    public double getFee() {
        return super.getFee() * -1;
    }

}