package model;


/**
 *
 * @author THAYCACAC
 */
public class Experience extends Candidate {

    private int yearExperience;
    private String professionalSkill;

    public Experience() {
        super();
    }

    public Experience(int yearExperience, String professionalSkill,
            String id, String firstName, String lastName, int birthDate,
            String address, String phone, String email, int typeCandidate) {
        super(id, firstName, lastName, birthDate, address, phone, email,
                typeCandidate);
        this.yearExperience = yearExperience;
        this.professionalSkill = professionalSkill;
    }
    
    public Experience(int yearExperience, String professionalSkill, Candidate candidate) {
        super(candidate.getId(), candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(), candidate.getPhone(),
                candidate.getEmail(), candidate.getTypeCandidate());
        this.yearExperience = yearExperience;
        this.professionalSkill = professionalSkill;
    }

    public int getYearExperience() {
        return yearExperience;
    }

    public void setYearExperience(int yearExperience) {
        this.yearExperience = yearExperience;
    }

    public String getProfessionalSkill() {
        return professionalSkill;
    }

    public void setProfessionalSkill(String professionalSkill) {
        this.professionalSkill = professionalSkill;
    }

}
