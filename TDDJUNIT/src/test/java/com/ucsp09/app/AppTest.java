package com.ucsp09.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    App obj;

    @BeforeEach
    void setup()
    {
        obj=new App();
    }
    @Test
    public void test0chars()
    {
        assertEquals("",obj.removeA(""));
    }
    @Test
    public void test1chars()
    {
        assertEquals("",obj.removeA("A"));
    }
    @Test
    public void test2chars()
    {
        assertEquals("",obj.removeA("AA"));
    }
    @Test
    public void test3chars()
    {
        assertEquals("A",obj.removeA("AAA"));
    }
    @Test
    public void test4chars()
    {
        assertEquals("AA",obj.removeA("AAAA"));
    }
    @Test
    public void test5chars()
    {
        assertEquals("AAA",obj.removeA("AAAAA"));
    }
    @Test
    public void testnchars()
    {
        assertEquals("AAAAAAAAAAAAAAAAAAAA",obj.removeA("AAAAAAAAAAAAAAAAAAAAAA"));
    }
}
