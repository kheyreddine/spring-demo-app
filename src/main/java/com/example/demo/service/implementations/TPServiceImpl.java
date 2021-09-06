package com.example.demo.service.implementations;

import com.example.demo.entity.TP;
import com.example.demo.repository.TPRepository;
import com.example.demo.service.interfaces.TPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TPServiceImpl implements TPService {

    @Autowired
    TPRepository tpRepository;

    @Override
    public List<TP> getTPs() {
        return tpRepository.findAll();
    }
}
