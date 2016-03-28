package com.company;

import com.sun.javafx.css.FontUnits;

public class WeightWatchersAssociation {
    private double lowestWeightIndex;

    // Initialize instance of class
    public WeightWatchersAssociation(double indexLimit) {
        this.lowestWeightIndex = indexLimit;
    }

    // Check if a person is eligible for the association
    public boolean isAcceptedAsMember(Person person) {
        if (person.weightIndex() < this.lowestWeightIndex) {
            return false;
        }
        return true;
    }
}
