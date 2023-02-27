package kodlama.io.devs.ProgrammingLanguages.dataAccess.abstracts;

import kodlama.io.devs.ProgrammingLanguages.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
    void add(ProgrammingLanguage programmingLanguage);
    void remove(ProgrammingLanguage programmingLanguage);
    void update(ProgrammingLanguage programmingLanguage,ProgrammingLanguage newProgrammingLanguage);
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id);
}
