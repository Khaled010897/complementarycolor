package at.fhtechnikum.complementarycolor.controller;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class FarbControllerTest {
    @Test
    void getComplementaryColorTest() {
        assertEquals("Die komplementär Farbe von Rot ist Grün", FarbController.ComplementaryColor("red"));
        assertEquals("Die komplementär Farbe von Grün ist Rot", FarbController.ComplementaryColor("green"));
        assertEquals("Die komplementär Farbe von Gelb ist Violett", FarbController.ComplementaryColor("yellow"));
        assertEquals("Die komplementär Farbe von violett ist Gelb", FarbController.ComplementaryColor("purble"));
        assertEquals("Die komplementär Farbe von Orange ist Blau", FarbController.ComplementaryColor("orange"));
        assertEquals("Die komplementär Farbe von Blau ist Orange", FarbController.ComplementaryColor("blue"));



    }