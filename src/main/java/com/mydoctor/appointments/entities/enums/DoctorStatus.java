package com.mydoctor.appointments.entities.enums;

/**
 * Created by emrah.bektas on 06/05/16.
 */
public enum DoctorStatus {
    ACTIVE(1), BLOCKED(2), PASSIVE(3);

    private final int value;

    DoctorStatus(int value){
        this.value = value;
    }

    public static DoctorStatus of(int val){
        for(DoctorStatus status : DoctorStatus.values()){
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
