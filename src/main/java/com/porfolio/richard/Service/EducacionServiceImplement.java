ackage com.porfolio.richard.Service;

import com.porfolio.richard.Dao.EducacionDao;
import com.porfolio.richard.Model.Educacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class EducacionServiceImplement  implements EducacionService{
    @Autowired
    private EducacionDao educacionDao;

    @Override
    @Transactional(readOnly=true)
    public List<Educacion> findAll()
    {
        return (List<Educacion>) educacionDao.findAll();
    }

    @Override
     @Transactional(readOnly=false)
    public Educacion save(Educacion educacion)
    {
        return educacionDao.save(educacion);
    }
   
    @Override
     @Transactional(readOnly=true)
    public Educacion findById(Integer id)
    {
        return educacionDao.findById(id).orElse(null);
    }

    @Override
     @Transactional(readOnly=false)
    public void delete(Integer id)
    {
       educacionDao.deleteById(id);
    }
}


