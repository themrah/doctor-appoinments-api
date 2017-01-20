package com.mydoctor.appointments.entities.enums;

public enum ArrangementStatus {
    INITIAL(0), APPROVED(1), CANCELLED(2);

    private final int value;

    ArrangementStatus(int value){
        this.value = value;
    }

    public static ArrangementStatus of(int value){
        for(ArrangementStatus status : ArrangementStatus.values()){
            if(value == status.value){
                return status;
            }
        }
        throw new IllegalArgumentException("Illegal status value: "+ value);
    }

    public int getValue(){
        return this.value;
    }
}
