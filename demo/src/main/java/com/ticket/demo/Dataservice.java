package com.ticket.demo;
import com.ticket.demo.dao.*;
import com.ticket.demo.model.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Dataservice {
    @Autowired
   Datadao datadao;
    @Autowired
    Pricedao pricedao;
    @Autowired
    Statusdao statusdao;
    int res;
    public int getticketprice(Point point) {
        List<Tdata> d1=datadao.findAll();
        String startpoint1=point.getCity();
        String destination1=point.getCity1();

        for(Tdata d:d1){
            if(d.getStartpoint().equals(startpoint1) && d.getDestination().equals(destination1)){
                 res=d.getTrainno();
                 break;

            }
        }
       mytable9999 p1= pricedao.getpricebytrainno(res);
        if(p1!=
                null){
        return p1.getPrice();}
        else{return 0;}


    }
//    public String senddata(Tdata tdata){
//        datadao.save(tdata);
//        return "success";
//    }
//    public List<Tdata> getalldata(){
//        return datadao.findAll();
//    }
//
//    public String sendpdata(mytable9999 my) {
//         pricedao.save(my);
//         return "suxxess1";
//    }
//
//    public Lis<mytable9999> getpdata() {
//        return pricedao.findAll();
//    }
    public String senddata(Alldata alldata){
        int tn=alldata.getTrainno();

        mytable9999 my1=new mytable9999(tn,alldata.getPrice());
        Tdata td=new Tdata(tn,alldata.getStartpoint(),alldata.getEndpoint());
        datadao.save(td);
        pricedao.save(my1);

        return "Yes";

    }


    public List<Alldata> getentiredata() {
        List<Tdata> td=datadao.findAll();
        List<Alldata> xx=new ArrayList<>();

        List<mytable9999> pd=pricedao.findAll();
        for(Tdata res: td){
            mytable9999 m11=pricedao.findbytrainno(res.getTrainno());
            Alldata fres=new Alldata(res.getTrainno(), m11.getPrice(), res.getStartpoint(),res.getDestination());
            xx.add(fres);
        }


        return xx;
    }

    public List<String> getallstartingpoints() {
        return datadao.getallstartingpoints();
    }
    public List<String> getalldestinationpoints() {
        return datadao.getalldestinationpoints();
    }

    public String saveuserinfo(Pinfo pinfo) {
        statusdao.save(pinfo);
        return  "savedinfo";
    }
    public List<Pinfo> getuserinfo(){
        return statusdao.findAll();
    }
}
