package com.example;

public class Graduate {

    private final String graduateName;
    private final String email;
    private final String phoneNumber;
    private final String companyName;
    private final String jobTitle;
    private final String currentCityLivedIn;
    private final int GraduationYear;
    private final String socialMediaHandle;

    public Graduate(String graduateName, String email, String phoneNumber, String companyName, String jobTitle, String currentCityLivedIn, int GraduationYear, String socialMediaHandle) {
        this.graduateName = graduateName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.currentCityLivedIn = currentCityLivedIn;
        this.GraduationYear = GraduationYear;
        this.socialMediaHandle = socialMediaHandle;
    }

    public void addNewGraduate(String graduateName, String email, String phoneNumber, String companyName, String jobTitle, String currentCityLivedIn, int GraduationYear, String socialMediaHandle) {

    }
}
