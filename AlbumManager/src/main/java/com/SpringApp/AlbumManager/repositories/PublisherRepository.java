package com.SpringApp.AlbumManager.repositories;

import com.SpringApp.AlbumManager.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
