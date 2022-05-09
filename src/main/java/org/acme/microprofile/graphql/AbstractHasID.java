package org.acme.microprofile.graphql;

public abstract class AbstractHasID<I extends ID<I>> {
    protected I id;

    public I getId() {
        return this.id;
    }

    public void setId(I id) {
        this.id = id;
    }
}
