package src.main.Lecture9;


import java.time.LocalDate;

abstract public class Person {
    protected final String name;
    protected final String gender;
    protected final String language;
    protected String job;
    protected final String nationality;
    protected final String EGN;
    protected final String birthDate;
    protected final Religion religion;
    protected String country;
    protected final int age;
    public Person(String name, String gender, String language, String job, String nationality, String EGN, String country, Religion religion) {
        checkEGN(EGN);
        this.gender = getGender(gender);
        this.EGN = EGN;
        this.name = name;
        this.language = language;
        this.job = job;
        this.nationality = nationality;
        this.country = country;
        this.religion = religion;
        this.age = calculateAge(this.EGN);
        this.birthDate = calculateBirthDay(EGN);
    }
    public Person(String name, String gender, String language, String nationality, String EGN, Religion religion, String country) {
        this(name, gender, language, null, nationality, EGN, country, religion);
    }
    public void checkEGN(String EGN) {
        int egnLength = EGN.length();
        if (!(egnLength == 10 && EGN.matches("\\d+"))) {
            throw new RuntimeException("The EGN must be exactly 10 digits.");
        }
    }
    public String getGender(String gender) {
        if (gender == "Female" || gender == "Male") {
            return gender;
        } else {
            System.out.println("Invalid gender provided!");
            return "Female";
        }
    }
    private int calculateAge(String EGN) {
        String birthYearString;

        int currentYear = LocalDate.now().getYear();

        String yearDigits = EGN.substring(0, 2);
        String monthDigits = EGN.substring(2, 4);

        int monthDigitsInt = Integer.parseInt(monthDigits);

        if (monthDigitsInt > 40) {
            birthYearString = "20" + yearDigits;
        } else {
            birthYearString = "19" + yearDigits;
        }
        int birthYear = Integer.parseInt(birthYearString);

        return currentYear - birthYear;
    }
    private String calculateBirthDay(String EGN) {
        String birthYearString;
        String yearDigits = EGN.substring(0, 2);
        String monthDigits = EGN.substring(2, 4);
        String dayDigits = EGN.substring(4, 6);

        int monthDigitsInt = Integer.parseInt(monthDigits);
        int monthNumber = monthDigitsInt;

        if (monthDigitsInt > 40) {
            birthYearString = "20" + yearDigits;
        } else {
            birthYearString = "19" + yearDigits;
        }
        int birthYear = Integer.parseInt(birthYearString);

        if (monthDigitsInt > 40) {
            monthNumber -= 40;
        }
        return dayDigits + "." + monthNumber + "." + birthYearString;
    }
    public void sayHello() {
        System.out.println("Hello!");
    }
    public void celebrateEaster() {
        if (this.religion == Religion.ORTHODOX || this.religion == Religion.CATHOLIC) {
            System.out.println("I celebrate Easter.");
        } else {
            System.out.println("I don't celebrate Easter.");
        }
    }
    abstract public Boolean isAdult();
    public Boolean canTakeLoan() {
        return (this.job != null && isAdult());
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getLanguage() {
        return language;
    }
    public String getJob() {
        return job;
    }
    public String getNationality() {
        return nationality;
    }
    public String getEGN() {
        return EGN;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public String getCountry() {
        return country;
    }
    public int getAge() {
        return age;
    }
    public String toString() {
        String toString =
                "Name: " + this.name + "\n"
                        + "Age: " + this.age + "\n"
                        + "EGN: " + this.EGN + "\n"
                        + "gender: " + this.gender + "\n"
                        + "Birth day: " + this.birthDate + "\n"
                        + "Religion: " + this.religion + "\n"
                        + "Nationality: " + this.nationality + "\n"
                        + "Country: " + this.country + "\n"
                        + "Language: " + this.language + "\n"
                        + "Job: " + this.job + "\n"
                        + "Adult: " + isAdult() + "\n"
                        + "Can Take Loan: " + canTakeLoan() + "\n";
        return toString;
    }
}