package service;

import com.moduleone.dtos.Module1DTO;
import com.moduleone.service.Module1Service;
import dtos.Module2DTO;

public class Module2Service {

    private final Module1Service module1Service;

    public Module2Service(Module1Service module1Service) {
        this.module1Service = module1Service;
    }

    public Module2DTO retrieveData(){
        return new Module2DTO("Hello! This is from Module2");
    }

    public Module1DTO retrieveDataV2(){
        return module1Service.retrieveData();
    }
}
