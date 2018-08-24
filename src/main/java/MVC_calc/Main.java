package MVC_calc;

import MVC_calc.controller.Controller;
import MVC_calc.model.Model;
import MVC_calc.view.View;

public class Main {

    public static void main(String[] args) {

        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(view, model);
        view.setVisible(true);
    }
}
