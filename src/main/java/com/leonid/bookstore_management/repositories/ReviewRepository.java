package com.leonid.bookstore_management.repositories;

import com.leonid.bookstore_management.models.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, String> { }