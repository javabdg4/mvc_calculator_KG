package MVC_calc.controller;

import MVC_calc.model.Model;
import MVC_calc.view.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;

        view.addMultiplyListener(new MultiplyListener());
//        view.addClearListener();
    }

    class MultiplyListener implements ActionListener{

        @Override
        public void  actionPerformed(ActionEvent e){
            String userInput = "";

            userInput = view.getUserInput();
            System.out.println(userInput);
        }
    }

    }
