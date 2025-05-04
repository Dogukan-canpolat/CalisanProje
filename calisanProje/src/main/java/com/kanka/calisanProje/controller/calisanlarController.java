package com.kanka.calisanProje.controller;


import com.kanka.calisanProje.model.calisan;
import com.kanka.calisanProje.service.calisanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calisanlar/api")
public class calisanlarController {

    @Autowired
    private calisanService calisanService;

    @GetMapping
    public List<calisan> getAll(){
        return calisanService.getAll();
    }
    @PostMapping
    public calisan save(@RequestBody calisan calisan){
        return calisanService.save(calisan);
    }
    @PutMapping("/{id}")
    public calisan update(@PathVariable Long id, @RequestBody calisan yeni) {
        return calisanService.update(id, yeni);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        calisanService.delete(id);
    }
}
