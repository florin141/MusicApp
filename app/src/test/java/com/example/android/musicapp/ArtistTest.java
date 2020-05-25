package com.example.android.musicapp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArtistTest {
    private static final String artistName1 = "Hans Zimmer";
    private static final String artistName2 = "Thomas Bergersen";
    private static final String artistName3 = "Ivan Torrent";

    private Artist artist1;
    private Artist artist2;
    private Artist artist3;

    @Test
    public void addCollaborators() {
        artist1.addCollaborator(artist2);

        Assert.assertEquals(1, artist1.getCollaborators().size());

        artist1.addCollaborator(artist3);

        Assert.assertEquals(2, artist1.getCollaborators().size());
    }

    @Test
    public void test1ToString() {
        Assert.assertEquals(artistName1, artist1.toString());

        artist1.addCollaborator(artist2);
        String expected = artistName1 + ", " + artistName2;
        Assert.assertEquals(expected, artist1.toString());

        artist1.addCollaborator(artist3);
        expected += ", " + artistName3;
        Assert.assertEquals(expected, artist1.toString());
    }

    @Before
    public void setUp() throws Exception {
        artist1 = new Artist(artistName1);
        artist2 = new Artist(artistName2);
        artist3 = new Artist(artistName3);
    }
}