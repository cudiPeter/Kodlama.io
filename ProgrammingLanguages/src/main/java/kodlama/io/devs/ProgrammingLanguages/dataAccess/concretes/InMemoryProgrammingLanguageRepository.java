package kodlama.io.devs.ProgrammingLanguages.dataAccess.concretes;

import kodlama.io.devs.ProgrammingLanguages.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.ProgrammingLanguages.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
    List<ProgrammingLanguage> programmingLanguages;
    public InMemoryProgrammingLanguageRepository(){
        programmingLanguages = new ArrayList<ProgrammingLanguage>();
        programmingLanguages.add(new ProgrammingLanguage(1,"C#"));
        programmingLanguages.add(new ProgrammingLanguage(2,"Java"));
        programmingLanguages.add(new ProgrammingLanguage(3,"Python"));
    }
    @Override
    public void add(ProgrammingLanguage programmingLanguage) {

    }

    @Override
    public void remove(ProgrammingLanguage programmingLanguage) {

    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage, ProgrammingLanguage newProgrammingLanguage) {

    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return null;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return null;
    }
}
