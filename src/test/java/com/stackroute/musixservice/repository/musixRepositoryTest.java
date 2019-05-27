package com.stackroute.musixservice.repository;

import com.stackroute.musixservice.model.Track;
import com.stackroute.musixservice.service.TrackService;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class musixRepositoryTest
{
    @Autowired
    private TrackRepository trackRepository;
    private Track track;


    @Before
    public void setUp()
    {
       track = new Track();
        track.setTrackName("Tere liye");
        track.setComment("Good");

    }

    @After
    public void tearDown(){

        trackRepository.deleteAll();
    }




}
