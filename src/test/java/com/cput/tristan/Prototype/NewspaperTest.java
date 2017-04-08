package com.cput.tristan.Prototype;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/04/08.
 */
public class NewspaperTest {

    Newspaper son;

    @Before
    public void setUp()
    {
        son = new Newspaper(30, "Die Son", 30);
    }

    @Test
    public void photoCopy() throws Exception {
        Photocopier sonCopy = son.photoCopy();
        assertEquals("com.cput.tristan.Prototype.Newspaper@5b80350b", son.toString());
    }

    @Test
    public void getIssueNo() throws Exception {
        assertEquals(30, son.getIssueNo());
    }

    @Test
    public void getPaperName() throws Exception {
        assertEquals("Die Son", son.getPaperName());
    }

    @Test
    public void getPages() throws Exception {
        assertEquals(30, son.getPages());
    }

}