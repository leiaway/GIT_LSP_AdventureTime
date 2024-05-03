package org.howard.edu.lsp.oopfinal.question1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

public class SongsDatabaseTest {
    private SongsDatabase db;

    @BeforeEach
    public void setUp() {
        db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");
    }

    @Test
    void testAddSong() {
        db.addSong("Rap", "Gin and Juice");
        assertTrue(db.getSongs("Rap").contains("Gin and Juice"));
    }

    @Test
    void testGetGenreOfSong() {
        assertEquals("Rap", db.getGenreOfSong("Savage"));
        assertEquals("Country", db.getGenreOfSong("Sweet Alabama"));
        assertEquals("Jazz", db.getGenreOfSong("Always There"));
        assertNull(db.getGenreOfSong("Unknown Song"));
    }

    @Test
    void testGetSongs() {
        Set<String> rapSongs = db.getSongs("Rap");
        assertNotNull(rapSongs);
        assertTrue(rapSongs.contains("Savage"));
        assertEquals(1, rapSongs.size());

        Set<String> countrySongs = db.getSongs("Country");
        assertNotNull(countrySongs);
        assertTrue(countrySongs.contains("Sweet Alabama"));
        assertEquals(1, countrySongs.size());

        Set<String> jazzSongs = db.getSongs("Jazz");
        assertNotNull(jazzSongs);
        assertTrue(jazzSongs.contains("Always There"));
        assertEquals(1, jazzSongs.size());

        assertNull(db.getSongs("Genre doesn't exist in database"));
    }
}