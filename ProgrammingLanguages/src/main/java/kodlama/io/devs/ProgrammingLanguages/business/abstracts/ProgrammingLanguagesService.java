package kodlama.io.devs.ProgrammingLanguages.business.abstracts;

import kodlama.io.devs.ProgrammingLanguages.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguagesService {
    void add(ProgrammingLanguage programmingLanguage) throws Exception;
    void remove(ProgrammingLanguage programmingLanguage);
    void update(ProgrammingLanguage programmingLanguage,ProgrammingLanguage newProgrammingLanguage) throws Exception;
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id);
}
