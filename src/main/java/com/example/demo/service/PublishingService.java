package com.example.demo.service;

import com.example.demo.entity.PublisherEntity;

import java.util.List;

public interface PublishingService{
    List<PublisherEntity> getAllPublishing();
    PublisherEntity createPublishing(PublisherEntity p);
}
