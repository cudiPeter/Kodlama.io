package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.courseDao.CourseDao;
import oopWithNLayeredApp.entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public CourseManager(CourseDao courseDao, Logger loggers) {
        this.courseDao = courseDao;

    }
    public void add(Course course) throws Exception {
        if (course.getPrice()<0){
            throw new Exception("Kurs ücreti 0'dan küçük olamaz.");
        }
        courseDao.add(course);

        for (Logger logger:loggers) {
            logger.courseLog(course.getCourseName()+" eklenmiştir.");
        }
    }
    public void remove(Course course){
        courseDao.remove(course);

        for (Logger logger:loggers) {
            logger.courseLog(course.getCourseName()+" silinmiştir.");
        }
    }
    public void update(Course course) throws Exception {
        if (course.getPrice()<0){
            throw new Exception("Kurs ücreti 0'dan küçük olamaz.");
        }
        courseDao.update(course);

        for (Logger logger:loggers) {
            logger.courseLog(course.getCourseName()+" güncellenmiştir.");
        }
    }

}
