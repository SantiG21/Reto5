package usa.mintic.retos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usa.mintic.retos.model.Motorbike;
import usa.mintic.retos.repository.MotorbikeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MotorbikeService {

    @Autowired
    private MotorbikeRepository motorbikeRepository;

    public List<Motorbike> getAll(){
        return motorbikeRepository.getAll();
    }

    public Optional<Motorbike>getById(int id){
        return motorbikeRepository.getById(id);
    }

    public Motorbike save(Motorbike c){
        if(c.getId()==null){
            return motorbikeRepository.save(c);
        }
        return c;
    }
    public boolean delete(int id){
        Optional<Motorbike> cOp= motorbikeRepository.getById(id);
        if(cOp.isPresent()){
            motorbikeRepository.delete(cOp.get());
            return true;
        }
        return false;
    }
    public Motorbike update(Motorbike c){
        if(c.getId()!=null){
            Optional<Motorbike> old= motorbikeRepository.getById(c.getId());
            if(old.isPresent()){
                Motorbike k=old.get();
                if(c.getName()!=null){
                    k.setName(c.getName());
                }
                if(c.getDescription()!=null){
                    k.setDescription(c.getDescription());
                }
                if(c.getDescription()!=null){
                    k.setDescription(c.getDescription());
                }
                if(c.getCategory()!=null){
                    k.setCategory(c.getCategory());
                }
                return motorbikeRepository.save(k);
            }
        }
        return c;
    }
}
