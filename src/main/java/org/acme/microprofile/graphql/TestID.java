package org.acme.microprofile.graphql;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TestID extends AbstractID<TestID> implements ID<TestID> {

    public TestID() {
        super("test");
    }

    @JsonCreator
    public TestID(@JsonProperty("value") String id) {
        super(id);
    }

    @Override
    public String getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(String id) {
        super.setValue(id);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    // some other test
    // ------------------------------------------------
    // public Uni<TestID> getTestID() {
    // return Uni.createFrom().item(this);
    // }

    // public Uni<TestID> reflect(TestID testID) {
    // return Uni.createFrom().item(testID);
    // }
    // ------------------------------------------------
}
