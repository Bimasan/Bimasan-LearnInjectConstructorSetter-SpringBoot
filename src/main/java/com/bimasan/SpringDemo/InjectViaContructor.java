package com.bimasan.SpringDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class InjectViaContructor {

    //menggunakan method constructor
    private HalloSpringService halloSpringService;

@Autowired
    public InjectViaContructor(HalloSpringService halloSpringService) {
        this.halloSpringService = halloSpringService;
    }

    public void getMessage(){
halloSpringService.sayHallo();

    }
}
