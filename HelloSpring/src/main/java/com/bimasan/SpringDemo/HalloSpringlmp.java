package com.bimasan.SpringDemo;

import org.springframework.stereotype.Component;

//@Component
public class HalloSpringlmp implements HalloSpringService {

    @Override
    public void sayHallo(){
        System.out.println("hallo bima lagi belajar");
}

   @Override
    public void sayIye(){System.out.println("print menggunakan setter");} {

    }

}

