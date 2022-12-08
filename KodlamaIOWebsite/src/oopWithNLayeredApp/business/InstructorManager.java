package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.instructorDao.InstructorDao;
import oopWithNLayeredApp.entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;
    public InstructorManager(InstructorDao instructorDao,Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers=loggers;
    }

    public void add(Instructor instructor){
        instructorDao.add(instructor);

        for (Logger logger:loggers) {
            logger.instructorLog(instructor.getFirstName()+" "+instructor.getLastName()+" eğitmen kadrosuna eklenmiştir.");
        }
    }
    public void remove(Instructor instructor){
        instructorDao.remove(instructor);

        for (Logger logger:loggers) {
            logger.instructorLog(instructor.getFirstName()+" "+instructor.getLastName()+" eğitmen kadrosundan silinmiştir.");
        }
    }
    public void update(Instructor instructor){
        instructorDao.update(instructor);

        for (Logger logger:loggers) {
            logger.instructorLog(instructor.getFirstName()+" "+instructor.getLastName()+" eğitmen kadrosunda güncellenmiştir.");
        }
    }
}
