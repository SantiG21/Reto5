package usa.mintic.retos.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usa.mintic.retos.model.Motorbike;
import usa.mintic.retos.repository.crud.MotorbikeCrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public class MotorbikeRepository {

    @Autowired
    private MotorbikeCrudRepository motorbikeCrudRepository;

    public List<Motorbike> getAll(){
        return (List<Motorbike>) motorbikeCrudRepository.findAll();
    }
    public Optional<Motorbike> getById(int id){
        return motorbikeCrudRepository.findById(id);
    }
    public Motorbike save(Motorbike c){
        return motorbikeCrudRepository.save(c);
    }
    public void delete(Motorbike c){
        motorbikeCrudRepository.delete(c);
    }

}
