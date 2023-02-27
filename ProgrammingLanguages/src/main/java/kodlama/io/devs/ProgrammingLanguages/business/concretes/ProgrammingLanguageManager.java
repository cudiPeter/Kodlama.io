package kodlama.io.devs.ProgrammingLanguages.business.concretes;

import kodlama.io.devs.ProgrammingLanguages.business.abstracts.ProgrammingLanguagesService;
import kodlama.io.devs.ProgrammingLanguages.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.ProgrammingLanguages.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProgrammingLanguageManager implements ProgrammingLanguagesService {
    private ProgrammingLanguageRepository programmingLanguageRepository;

    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
        if(programmingLanguageRepository.getAll().contains(programmingLanguage)){
            throw new Exception("Programlama Dili Mevcut.");
        }else {
            programmingLanguageRepository.add(programmingLanguage);
        }
    }

    @Override
    public void remove(ProgrammingLanguage programmingLanguage) {
        programmingLanguageRepository.remove(programmingLanguage);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage, ProgrammingLanguage newProgrammingLanguage) throws Exception {
        if(programmingLanguageRepository.getAll().contains(newProgrammingLanguage)) {
            throw new Exception("Önceki dil ismi kullanılamaz");
        }else{
                programmingLanguageRepository.update(programmingLanguage,newProgrammingLanguage);
            }
        }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return programmingLanguageRepository.getById(id);
    }
}
