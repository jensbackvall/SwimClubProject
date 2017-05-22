public class 60PlusExerciseSwimmer extends SeniorExerciseSwimmer {

    public 60PlusExerciseSwimmer(String firstName, String surName, String email, String birthDate, String memberID,
                        String password, boolean isFemale, double fee) {
        super(firstName, surName, email, birthDate, memberID, password, isFemale, fee);
    }

    public double getFee() {
        return super.getFee() * 0.75;
    }

}