package com.mydoctor.appointments.endpoints;

import com.mydoctor.appointments.model.Arrangement;
import com.mydoctor.appointments.model.exception.MyDoctorException;
import com.mydoctor.appointments.model.request.ArrangementRequest;
import com.mydoctor.appointments.model.response.ArrangementResponse;
import com.mydoctor.appointments.model.util.ArrangementBeanConvertionUtil;
import com.mydoctor.appointments.service.ArrangementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@RestController
@RequestMapping("/")
public class ArrangementEndpoint {

    @Autowired
    private ArrangementService arrangementService;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

    @RequestMapping(method = RequestMethod.PUT)
    public Long create(@RequestBody ArrangementRequest request) throws Exception{
        return arrangementService.create(request);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ArrangementResponse get(@PathVariable("id") Long id){
        Arrangement arrangement = arrangementService.get(id);
        return ArrangementBeanConvertionUtil.convertToResponse(arrangement);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public Long update(@PathVariable("id") Long id, @RequestBody ArrangementRequest request){
        Arrangement arrangement = arrangementService.get(id);
        arrangement = updateModelFromRequest(arrangement,request);
        return arrangementService.update(arrangement);
    }

    private Arrangement updateModelFromRequest(Arrangement arrangement, ArrangementRequest request) {
        try {
            if (!StringUtils.isEmpty(request.getDoctorId()))
                arrangement.setDoctorId(request.getDoctorId());
            if (!StringUtils.isEmpty(request.getPatientId()))
                arrangement.setPatientId(request.getPatientId());
            if (request.getType() != null)
                arrangement.setType(request.getType());
            if (request.getArrangementDate() != null)
                arrangement.setArrangementDate(sdf.parse(request.getArrangementDate()));
            if (request.getStatus() != null)
                arrangement.setStatus(request.getStatus());
        }catch(ParseException pe){
            throw new MyDoctorException();
        }

        return arrangement;
    }
}
