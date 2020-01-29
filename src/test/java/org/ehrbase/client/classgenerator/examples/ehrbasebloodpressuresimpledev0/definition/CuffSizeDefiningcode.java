package org.ehrbase.client.classgenerator.examples.ehrbasebloodpressuresimpledev0.definition;

import org.ehrbase.client.classgenerator.EnumValueSet;

public enum CuffSizeDefiningcode implements EnumValueSet {
    NEONATAL("Neonatal", "A cuff used for a new born - bladder approx 3cm x 6cm", "local", "at1009"),

    ADULT("Adult", "A cuff that is standard for an adult - bladder approx 13cm x 30cm", "local", "at0015"),

    LARGEADULT("Large Adult", "A cuff for adults with larger arms - bladder approx 16cm x 38cm", "local", "at0016"),

    CHILD("Paediatric/Child", "A cuff that is appropriate for a child or thin arm - bladder approx 8cm x 21 cm", "local", "at0017"),

    ADULTTHIGH("Adult Thigh", "A cuff used for an adult thigh - bladder approx 20cm x 42 cm", "local", "at1008"),

    INFANT("Infant", "A cuff used for infants - bladder approx 5cm x 15cm", "local", "at1018"),

    SMALLADULT("Small Adult", "A cuff used for a small adult - bladder approx 10cm x 24 cm", "local", "at1019");

    private String value;

    private String description;

    private String terminologyId;

    private String code;

    CuffSizeDefiningcode(String value, String description, String terminologyId, String code) {
        this.value = value;
        this.description = description;
        this.terminologyId = terminologyId;
        this.code = code;
    }

    public String getValue() {
        return this.value;
    }

    public String getDescription() {
        return this.description;
    }

    public String getTerminologyId() {
        return this.terminologyId;
    }

    public String getCode() {
        return this.code;
    }
}
