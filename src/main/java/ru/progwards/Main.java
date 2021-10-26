package ru.progwards;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.progwards.model.Task;

@SpringBootApplication
public class Main {

    private static final SessionFactory sessionFactory;

    static {
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();

    }

public static void main(String[]args){

    ApplicationContext context = SpringApplication.run(Main.class, args);
            createTask(" .. bla bla ..");
        }

      static   void createTask(String text){
        Task task =new Task();

        task.setText("New Task from method with text: "+ text);

            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
          System.out.println(task.getText());
            session.persist(task);
            transaction.commit();
            session.close();



        }


}
