package model;


/**
 *
 * @author THAYCACAC
 */
public class Fresher extends Candidate {

    private int graduationDate;
    private String graduationRank;

    public Fresher() {
        super();
    }

    public Fresher(int graduationDate, String graduationRank, String id,
            String firstName, String lastName, int birthDate, String address,
            String phone, String email, int typeCandidate) {
        super(id, firstName, lastName, birthDate, address, phone, email,
                typeCandidate);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }
    
    public Fresher(int graduationDate, String graduationRank, Candidate candidate) {
        super(candidate.getId(), candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(), candidate.getPhone(),
                candidate.getEmail(), candidate.getTypeCandidate());
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

}
