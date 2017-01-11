package com.mydoctor.appointments.endpoints;

import com.mydoctor.appointments.model.Patient;
import com.mydoctor.appointments.model.request.PatientRequest;
import com.mydoctor.appointments.model.response.PatientResponse;
import com.mydoctor.appointments.model.util.PatientBeanConvertionUtil;
import com.mydoctor.appointments.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientEndpoint {

    @Autowired
    private PatientService patientService;

    @RequestMapping(method = RequestMethod.PUT)
    public Long create(@RequestBody PatientRequest request){
        return patientService.create(request);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public PatientResponse getPatient(@PathVariable("id") Long id){
        Patient patient = patientService.get(id);
        return PatientBeanConvertionUtil.convertToResponse(patient);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public Long update(@PathVariable("id") Long id){
        Patient patient = patientService.get(id);
        return patientService.update(patient);
    }
}
