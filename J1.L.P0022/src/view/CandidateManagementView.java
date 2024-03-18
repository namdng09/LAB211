/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.OPTIONS;
import java.util.Calendar;
import model.Candidate;
import model.Experience;
import model.Fresher;
import model.Internship;
import model.manager.CandidateManager;
import utility.Utility;

/**
 *
 * @author namdng09
 */
public class CandidateManagementView {
    private Utility utils = new Utility();
    
    public static final int YES_OPTION = 1;
    public static final int NO_OPTION = 0;
    
    public void displayMenu(OPTIONS[] options) {
        System.out.println("WELCOME TO STUDENT MANAGEMENT");
        for (OPTIONS option : options) {
            System.out.println(option.getKey() + ". " + option.getMessage());
        }
    }
    
    public Object inputOption(String message, Object[] options) {
        Object option;
        //
        option = options[utils.getInteger(message, 1, options.length) - 1];
        return option;
    }
    
    public int inputYesNoOption(String message){
        return utils.getInteger(message, NO_OPTION, YES_OPTION);
    }
    
    public Candidate inputCandidate(String message, int typeCandidate) {
        System.out.println(message);
        return new Candidate(
                utils.getValidID("Enter ID (CAxxx): "), 
                utils.getNameString("Enter the First Name: "), 
                utils.getNameString("Enter the Last Name: "),
                utils.getInteger("Enter the birth date: ", 
                        1900, 
                        Calendar.getInstance().get(Calendar.YEAR)), 
                utils.getNameString("Enter the Address: "), 
                utils.getValidPhoneNumber("Enter the phone number: "), 
                utils.getValidEmail("Enter the email: "), 
                typeCandidate);
    }
    
    public Experience intputExperience(Candidate candidate) {
        return new Experience(
                utils.getValidYear("Enter the experience year: ", candidate.getBirthDate()), 
                utils.getNameString("Enter the Professional Skill: "), 
                candidate);
    }
    
    public Fresher inputFresher(Candidate candidate) {
        int maxDateGraduate = Calendar.getInstance().get(Calendar.YEAR) + 10;
        return new Fresher(
                utils.getInteger("Enter the birth date: ", 
                        candidate.getBirthDate(), 
                        maxDateGraduate),
                utils.getNameString("Enter the Rank of Graduation: "), 
                candidate);
    }
    
    public Internship inputInternship(Candidate candidate) {
        return new Internship(
                utils.getNameString("Enter the major: "), 
                utils.getNameString("Enter the semester: "), 
                utils.getNameString("Enter the name of university: "), 
                candidate);
    }
    
    public void displayAllNameCandidate(CandidateManager manager) {
        System.out.println("===========EXPERIENCE CANDIDATE============");
        for (Candidate candidate : manager) {
            if (candidate instanceof Experience) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
        System.out.println("===========FRESHER CANDIDATE============");
        for (Candidate candidate : manager) {
            if (candidate instanceof Fresher) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
        System.out.println("===========INTERN CANDIDATE============");
        for (Candidate candidate : manager) {
            if (candidate instanceof Internship) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
    }
}
