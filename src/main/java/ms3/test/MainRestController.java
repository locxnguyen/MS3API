package ms3.test;

import ms3.test.entity.Identification;
import ms3.test.repository.IdentificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/ms3test")
public class MainRestController {
    @Autowired
    private IdentificationRepository identificationRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody
    Identification addNew (@RequestBody Identification identification) {
        return identificationRepository.save(identification);
    }

    @PutMapping(path="/update")
    public @ResponseBody String update (@RequestBody Identification identification) {

        if( identificationRepository.findById(identification.getId()) !=null ){

            try{
                identificationRepository.save(identification);
                return "OK";
            }
            catch (Exception e){
                return "Failed!" + e.getMessage();
            }
        }
        else{
            return "Failed, no record found";
        }
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Identification> getAllIdentifications() {
        return identificationRepository.findAll();
    }

    @GetMapping(path="/id/{id}")
    public @ResponseBody Identification getById(@PathVariable long id) {
        return identificationRepository.findById(id);
    }

    @DeleteMapping(path="/id/{id}")
    public @ResponseBody String removeById(@PathVariable long id) {

        try{
            identificationRepository.deleteById(id);
            return "OK";
        }
        catch(Exception e){
            return "Failed!" + e.getMessage();
        }

    }
}