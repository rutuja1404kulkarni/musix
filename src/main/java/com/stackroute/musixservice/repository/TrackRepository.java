package com.stackroute.musixservice.repository;

import com.stackroute.musixservice.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends JpaRepository<Track,Integer> {
    public Track findByTrackId(int id);
   @Query(value = "select * from track where track_name = ?1", nativeQuery = true)
   public List<Track> getTrackByName(String trackName);
}
