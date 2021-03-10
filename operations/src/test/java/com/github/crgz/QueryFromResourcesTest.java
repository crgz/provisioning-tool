package com.github.crgz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class QueryFromResourcesTest {

    private QueryFromResources query;

    @BeforeEach
    void setUp() {
        URL resource = getClass().getClassLoader().getResource("tutorial.pl");
        assert resource != null;
        query = new QueryFromResources(resource.getPath());
    }

    @Test
    void hasSolution() {
        assertTrue(query.hasSolution());
    }
}
