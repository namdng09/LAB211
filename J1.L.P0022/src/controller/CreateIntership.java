/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Candidate;
import model.Internship;
import model.manager.CandidateManager;
import view.CandidateManagementView;

/**
 *
 * @author namdng09
 */
public class CreateIntership extends Form {
    CandidateManagementView view = new CandidateManagementView();
    
    public CreateIntership() {
    }

    @Override
    public STATUS_PROGRAM setup() {
        CandidateManager manager = CandidateManager.getInstance();
        Candidate candidate = view.inputCandidate("---------- Input Experience ----------", 1);
        Internship internship = view.inputInternship(candidate);
        
        try {
            manager.insert(internship);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        
        int choice = view.inputYesNoOption("Do you want to continue YES/NO (1/0)?: ");
        switch (choice) {
            case CandidateManagementView.YES_OPTION:
                return STATUS_PROGRAM.CONTINUE_LOOP;
            case CandidateManagementView.NO_OPTION:
                return STATUS_PROGRAM.EXIT_LOOP;
        }
        
        return STATUS_PROGRAM.EXIT_LOOP;
    }
    
}
