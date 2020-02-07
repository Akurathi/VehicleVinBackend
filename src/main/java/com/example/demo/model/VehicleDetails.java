package com.example.demo.model;

public class VehicleDetails {

    private String value;
    private String valueId;
    private String Variable;
    private long  VariableId;

    public VehicleDetails() {

    }

    public VehicleDetails(String value, String valueId, String variable, long variableId) {
        this.value = value;
        this.valueId = valueId;
        Variable = variable;
        VariableId = variableId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueId() {
        return valueId;
    }

    public void setValueId(String valueId) {
        this.valueId = valueId;
    }

    public String getVariable() {
        return Variable;
    }

    public void setVariable(String variable) {
        Variable = variable;
    }

    public long getVariableId() {
        return VariableId;
    }

    public void setVariableId(long variableId) {
        VariableId = variableId;
    }

    @Override
    public String toString() {
        return "vehicleDetails{" +
                "Value='" + value + '\'' +
                ", ValueId='" + valueId + '\'' +
                ", Variable='" + Variable + '\'' +
                ", VariableId=" + VariableId +
                '}';
    }
}
