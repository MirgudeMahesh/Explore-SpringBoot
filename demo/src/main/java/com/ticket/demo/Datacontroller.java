package com.ticket.demo;
import java.util.*;
import com.ticket.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin

@RestController
@RequestMapping("open")

public class Datacontroller {

    @Autowired
    Dataservice dataservice;
    @PostMapping("getprice1")
    public int getticketprice(@RequestBody  Point point ){
        return dataservice.getticketprice(point);
    }
    @GetMapping("spoints")
    public List<String> getallstartingpoints(){
        return dataservice.getallstartingpoints();
    }
    @GetMapping("dpoints")
    public List<String> getalldestinationpoints(){
        return dataservice.getalldestinationpoints();
    }
@PostMapping("sendall")
    public String senddata(@RequestBody Alldata alldata){
       return  dataservice.senddata(alldata);

}
@GetMapping("getall")
    public List<Alldata> getentiredata(){
        return dataservice.getentiredata();
}
@PostMapping("saveinfo")
    public String saveuserinfo(@RequestBody Pinfo pinfo){
        return dataservice.saveuserinfo(pinfo);
}
    @GetMapping("getinfo")
    public List<Pinfo> getuserinfo(){
        return dataservice.getuserinfo();
    }




//@PostMapping("sendp")
//public String sendpdata(@RequestBody mytable9999 my){
//        return dataservice.sendpdata(my);
//}
//@GetMapping("getall")
//    public List<Tdata> getalldata(){
//        return dataservice.getalldata();
//}
//    @GetMapping("getp")
//    public List<mytable9999> getpdata(){
//        return dataservice.getpdata();
//    }

}
