/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.CandidateManagementView;


/**
 *
 * @author namdng09
 */
public class MainForm extends Form{
    private final CandidateManagementView view = new CandidateManagementView();
    Form newForm = null;
    @Override
    public STATUS_PROGRAM setup() {
        while (true) {
            view.displayMenu(OPTIONS.values());

            OPTIONS choice = (OPTIONS) view.inputOption("Your choice: ", OPTIONS.values());
            switch (choice) {
                case EXPERIENCE:
                    newForm = new CreateExperience();
                    break;
                case FRESHER:
                    newForm = new CreateFresher();
                    break;
                case INTERNSHIP:
                    newForm = new CreateIntership();
                    break;
                case SEARCHING:
                    newForm = new SearchCandidate();
                    break;
                default:
                    System.exit(0);
            }
            newForm.loop();

            return STATUS_PROGRAM.CONTINUE_LOOP;
        }
        
    }

    
}
