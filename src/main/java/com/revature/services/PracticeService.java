package com.revature.services;

import com.revature.models.PracticeUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.revature.repositories.PracticeRepo;

@Service
public class PracticeService {

    private PracticeRepo practiceRepo;
    @Autowired
    public PracticeService(PracticeRepo practiceRepo){
        this.practiceRepo = practiceRepo;
    }

    public void register(PracticeUser practiceUser){
        practiceRepo.save(practiceUser);
    }
}
