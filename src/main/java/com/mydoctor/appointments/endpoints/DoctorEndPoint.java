package com.mydoctor.appointments.endpoints;


import com.mydoctor.appointments.model.Doctor;
import com.mydoctor.appointments.model.request.DoctorRequest;
import com.mydoctor.appointments.model.response.DoctorResponse;
import com.mydoctor.appointments.model.util.DoctorBeanConvertionUtil;
import com.mydoctor.appointments.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctor")
public class DoctorEndPoint {

    @Autowired
    private DoctorService doctorService;

    @RequestMapping(method = RequestMethod.PUT)
    public Long create(@RequestBody DoctorRequest request){
        return doctorService.create(request);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public DoctorResponse getDoctor(@PathVariable("id") Long id){
        Doctor doctor = doctorService.get(id);
        return DoctorBeanConvertionUtil.convertToResponse(doctor);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public Long update(@PathVariable("id") Long id, @RequestBody DoctorRequest request){
        Doctor doctor = doctorService.get(id);
        doctor = updateModelFromRequest(doctor,request);
        return doctorService.update(doctor);
    }

    private Doctor updateModelFromRequest(Doctor doctor, DoctorRequest request) {
        if(!StringUtils.isEmpty(request.getEmail()))
            doctor.setEmail(request.getEmail());
        if(!StringUtils.isEmpty(request.getMsisdn()))
            doctor.setMsisdn(request.getMsisdn());
        if(!StringUtils.isEmpty(request.getName()))
            doctor.setName(request.getName());
        if(!StringUtils.isEmpty(request.getSurName()))
            doctor.setSurName(request.getSurName());
        if(!StringUtils.isEmpty(request.getUsername()))
            doctor.setUsername(request.getUsername());
        if(!StringUtils.isEmpty(request.getPassword()))
            doctor.setPassword(request.getPassword());
        if(request.getStatus() != null)
            doctor.setStatus(request.getStatus());

        return doctor;
    }

}
