package com.example.demo.service;

import com.example.demo.entity.PublisherEntity;
import com.example.demo.repository.PublishingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublishingServiceImpl implements PublishingService{

    @Autowired
    PublishingRepo publishingRepo;

    @Override
    public List<PublisherEntity> getAllPublishing() {
        return publishingRepo.findAll();
    }

    @Override
    public PublisherEntity createPublishing(PublisherEntity p) {
        return publishingRepo.save(p);
    }
}
