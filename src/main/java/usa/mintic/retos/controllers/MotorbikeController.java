package usa.mintic.retos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import usa.mintic.retos.model.Motorbike;
import usa.mintic.retos.services.MotorbikeService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/Motorbike")
public class MotorbikeController {

    @Autowired
    private MotorbikeService motorbikeService;

    @GetMapping("/all")
    public List<Motorbike> getAll(){
        return motorbikeService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Motorbike> getById(@PathVariable("id") int id){
        return motorbikeService.getById(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Motorbike save(@RequestBody Motorbike c){
        return motorbikeService.save(c);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Motorbike update(@RequestBody Motorbike c){
        return motorbikeService.update(c);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id){
        return motorbikeService.delete(id);
    }




}
