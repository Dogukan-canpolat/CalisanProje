package com.kanka.calisanProje.service;


import com.kanka.calisanProje.model.calisan;
import com.kanka.calisanProje.repository.calisanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class calisanService {

    @Autowired
    private calisanRepository calisanRepository;


    public List<calisan> getAll(){
        return calisanRepository.findAll();
    }
    public calisan save(calisan calisan){
        return calisanRepository.save(calisan);
    }

    public calisan update(Long id, calisan yeni) {
        Optional<calisan> varMi = calisanRepository.findById(id);
        if (varMi.isPresent()) {
            calisan mevcut = varMi.get();
            mevcut.setIsim(yeni.getIsim());
            mevcut.setSoyisim(yeni.getSoyisim());
            mevcut.setEmail(yeni.getEmail());
            mevcut.setPozisyon(yeni.getPozisyon());
            return calisanRepository.save(mevcut);
        }
        return null;
    }

    public void delete(Long id) {
        calisanRepository.deleteById(id);
    }
}
