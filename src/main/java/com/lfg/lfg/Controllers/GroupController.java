package com.lfg.lfg.Controllers;

import com.lfg.lfg.Models.GamerGroup;
import com.lfg.lfg.Models.User;
import com.lfg.lfg.Services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class GroupController {
    @Autowired
    private GroupService groupService;

    @PostMapping(path="groups/add")
    public String addnewGroup(@RequestBody GamerGroup gamerGroup){

        if(groupService.saveGroup(gamerGroup)){
            return "GamerGroup created Succesfully";
        }else{
            return "GamerGroup add failed";
        }

    }
    @RequestMapping("group/adduser")
    public String addUsertoGroup(@RequestParam String userName,@RequestParam String groupName){
       groupService.addUsertoGroup(userName,groupName);

       return "Yes";



    }
    @RequestMapping(path="group/getusers")
        public List<User> getUsersfromGroup(@RequestParam String groupName){
        return groupService.getUsers(groupName);
    }
}
