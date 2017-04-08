package com.cput.tristan.Prototype;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/04/08.
 */
public class BookTest {

    Book dc;

    @Before
    public void setUp()
    {
        dc = new Book("Da Vinci Code, The", "Dan Brown", 523);
    }

    @Test
    public void photoCopy() throws Exception {
        Photocopier dcCopy = dc.photoCopy();
        assertEquals("Da Vinci Code, The", dc.getName());
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Da Vinci Code, The", dc.getName());
    }

    @Test
    public void getAuthor() throws Exception {
        assertEquals("Dan Brown", dc.getAuthor());
    }

    @Test
    public void getPages() throws Exception {
        assertEquals(523, dc.getPages());
    }

}