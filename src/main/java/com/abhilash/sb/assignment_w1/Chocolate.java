package com.abhilash.sb.assignment_w1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@ConditionalOnProperty(name="cake_type",havingValue ="Chocolate" )
public class Chocolate implements Frosting,Syrup{

    public String getCakeType(){
        return getClass().getSimpleName()+" Cake with ";
    }
    @Override
    public String getFrostingType() {
        return getCakeType()+"buttercream frosting";
    }

    @Override
    public String getSyruptype() {
        return "hershey's syrup";
    }
}
