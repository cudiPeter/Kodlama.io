package kodlama.io.devs.ProgrammingLanguages.webApi;

import kodlama.io.devs.ProgrammingLanguages.business.abstracts.ProgrammingLanguagesService;
import kodlama.io.devs.ProgrammingLanguages.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/programminglanguage")
public class ProgrammingLanguagesController {
    private ProgrammingLanguagesService programmingLanguagesService;

    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguagesService programmingLanguagesService) {
        this.programmingLanguagesService = programmingLanguagesService;
    }
    @GetMapping("/add")
    public void add(ProgrammingLanguage programmingLanguage) throws Exception{
        programmingLanguagesService.add(programmingLanguage);
    }
    @GetMapping("/remove")
    public void remove(ProgrammingLanguage programmingLanguage){
        programmingLanguagesService.remove(programmingLanguage);
    }
    @GetMapping("/update")
    public void update(ProgrammingLanguage programmingLanguage,ProgrammingLanguage newProgrammingLanguage) throws Exception{
        programmingLanguagesService.update(programmingLanguage,newProgrammingLanguage);
    }
    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll(){
        return programmingLanguagesService.getAll();
    }
    @GetMapping("/getbyid")
    public ProgrammingLanguage getById(int id){
        return programmingLanguagesService.getById(id);
    }
}
