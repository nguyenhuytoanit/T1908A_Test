package com.example.demo.repository;

import com.example.demo.entity.PublisherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublishingRepo extends JpaRepository<PublisherEntity, Integer> {
}
