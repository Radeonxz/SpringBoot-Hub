package com.SpringApp.AlbumManager.bootstrap;

import com.SpringApp.AlbumManager.domain.Album;
import com.SpringApp.AlbumManager.domain.Holder;
import com.SpringApp.AlbumManager.domain.Publisher;
import com.SpringApp.AlbumManager.repositories.AlbumRepository;
import com.SpringApp.AlbumManager.repositories.HolderRepository;
import com.SpringApp.AlbumManager.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final PublisherRepository publisherRepository;
    private final AlbumRepository albumRepository;
    private final HolderRepository holderRepository;

    public BootStrapData(PublisherRepository publisherRepository, AlbumRepository albumRepository, HolderRepository holderRepository) {
        this.publisherRepository = publisherRepository;
        this.albumRepository = albumRepository;
        this.holderRepository = holderRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in Bootstrap...");

        Holder holderA = new Holder();
        holderA.setName("HolderA");
        holderA.setAddress("AddressA");
        holderA.setCity("CityA");
        holderA.setProvince("ProvinceA");
        holderA.setPostalCode("PostalCodeA");

        holderRepository.save(holderA);

        System.out.println("Number of Holders: " + holderRepository.count());

        Publisher publisherA = new Publisher("FirstNameA", "LastNameA");
        Album albumA = new Album("AlbumA", "A123");
        publisherA.getAlbums().add(albumA);
        albumA.getPublishers().add(publisherA);
        albumA.setHolder(holderA);
        holderA.getAlbums().add(albumA);

        publisherRepository.save(publisherA);
        albumRepository.save(albumA);
        holderRepository.save(holderA);

        Publisher publisherB = new Publisher("FirstNameB", "LastNameB");
        Album albumB = new Album("AlbumB", "B123");
        publisherB.getAlbums().add(albumB);
        albumB.getPublishers().add(publisherB);
        albumB.setHolder(holderA);
        holderA.getAlbums().add(albumB);

        publisherRepository.save(publisherB);
        albumRepository.save(albumB);
        holderRepository.save(holderA);

        System.out.println("Number of Albums: " + albumRepository.count());
        System.out.println("Holder number of albums: " + holderA.getAlbums().size());
    }
}
