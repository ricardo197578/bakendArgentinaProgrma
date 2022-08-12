ackage com.porfolio.richard.Service;

import com.porfolio.richard.Dao.PersonaDao;
import com.porfolio.richard.Model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class PersonaServiceImplement  implements PersonaService{
    @Autowired
    private PersonaDao personaDao;

    @Override
    @Transactional(readOnly=true)
    public List<Persona> findAll()
    {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
     @Transactional(readOnly=false)
    public Persona save(Persona persona)
    {
        return personaDao.save(persona);
    }

    @Override
     @Transactional(readOnly=true)
    public Persona findById(Integer id)
    {
        return PersonaDao.findById(id).orElse(null);
    }

    @Override
     @Transactional(readOnly=false)
    public void delete(Integer id)
    {
        personaDao.deleteById(id);
    }

}

