public class Member {

    private String firstName;
    private String surName;
    private String email;
    private String birthDate;
    private String memberID;
    private String password;
    private boolean isFemale;
    private double fee;
    private boolean hasPayed;

    public Member(String firstName, String surName, String email, String birthDate, String memberID,
                  String password, boolean isFemale, double fee) {
    }

    public String getFirstName() {
        return firstName;
    }

    public String setFirstName(String newFirstName) {
        firstName = newFirstname;
    }

    public String getSurName() {
        return surName;
    }

    public String setSurName(String newSurName) {
        surName = newSurname;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String newEmail) {
        email = newEmail;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String setBirthDate(String newBirthDate) {
        birthDate = newBirthDate;
    }

    public String getMemberID() {
        return memberID;
    }

    public String setMemberID(String newMemberID) {
        memberID = newMemberID;
    }

    public String getPassword() {
        return password;
    }

    public String setPassword(String newPassword) {
        password = newPassword;
    }

    public boolean getIsFemale() {
        return isFemale;
    }

    public boolean setIsFemale(boolean newIsFemale) {
        isFemale = newIsFemale;
    }

    public double getFee() {
        return 1600;
    }

    public double setFee(double newFee) {
        fee = newFee;
    }

    public boolean getHasPayed() {
        return hasPayed;
    }

    public boolean setHasPayed(boolean newHasPayed) {
        hasPayed = newHasPayed;
    }

}