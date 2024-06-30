package com.abhilash.sb.assignment_w1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="cake_type",havingValue ="Strawberry" )
public class Strawberry implements Frosting,Syrup{
    public String getCakeType(){
        return getClass().getSimpleName()+" Cake with ";
    }
    @Override
    public String getFrostingType() {
        return getCakeType()+"whipped cream frosting";
    }

    @Override
    public String getSyruptype() {
        return "lemon-pepper syrup";
    }
}
