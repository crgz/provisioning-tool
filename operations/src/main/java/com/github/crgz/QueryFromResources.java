package com.github.crgz;

import org.jpl7.Atom;
import org.jpl7.Query;
import org.jpl7.Term;

public class QueryFromResources {

    private final Query query;

    public QueryFromResources(String resourceName) {
        this.query = new Query("consult", new Term[]{new Atom(resourceName)});
    }

    public boolean hasSolution() {
        return this.query.hasSolution();
    }
}
