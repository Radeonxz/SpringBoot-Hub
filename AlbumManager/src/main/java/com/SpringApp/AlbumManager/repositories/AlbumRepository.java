package com.SpringApp.AlbumManager.repositories;

import com.SpringApp.AlbumManager.domain.Album;
import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Long> {
}
