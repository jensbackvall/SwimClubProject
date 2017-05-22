public class 60PlusExerciseSwimmer extends SeniorExerciseSwimmer {

    public 60PlusExerciseSwimmer(String firstName, String surName, String email, String birthDate, String memberID,
                        String password, boolean isFemale, boolean isTrainer, boolean isActive, double fee,) {
        super(firstName, surName, email, birthDate, memberID, password, isFemale, isTrainer, isActive, fee);
    }

    public double getFee() {
        return super.getFee() * 0.75;
    }

}