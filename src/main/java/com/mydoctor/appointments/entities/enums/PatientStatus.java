package com.mydoctor.appointments.entities.enums;

/**
 * Created by emrah.bektas on 09/05/16.
 */
public enum PatientStatus {

    ACTIVE(1), BLOCKED(2), PASSIVE(3);

    private final int value;

    PatientStatus(int value){
        this.value = value;
    }

    public static PatientStatus of(int val){
        for(PatientStatus status : PatientStatus.values()){
            if(val == status.value){
                return status;
            }
        }
        throw new IllegalArgumentException("Illegal status value: "+ val);
    }

    public int getValue(){
        return this.value;
    }

}
