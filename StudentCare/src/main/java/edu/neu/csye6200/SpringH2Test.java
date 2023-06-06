package edu.neu.csye6200;

import edu.neu.csye6200.controller.ControllerTeacher;
import edu.neu.csye6200.views.AllDashboard;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;



//@SpringBootApplication
public class SpringH2Test {

    public static void demo(String[] args) {
        ConfigurableApplicationContext c = SpringApplication.run(SpringH2Test.class, args);
        ControllerTeacher teachController = c.getBean(ControllerTeacher.class);
        //teachController.
        //teachController.addDummyData();
        teachController.getAllTeachers();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllDashboard().setVisible(true);
            }
        });
    }
}
