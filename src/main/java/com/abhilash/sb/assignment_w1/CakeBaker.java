package com.abhilash.sb.assignment_w1;

import org.springframework.stereotype.Service;

@Service
public class CakeBaker {

    private final Frosting frosting;
    private final Syrup syrup;
    CakeBaker(Frosting frosting,Syrup syrup){
        this.frosting=frosting;
        this.syrup=syrup;
    }

    public String bakeCake(){
        return "Baked "+frosting.getFrostingType()+" and "+syrup.getSyruptype()+"!!!\n"+"enjoy!";
    }
}
