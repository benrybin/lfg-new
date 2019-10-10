package com.lfg.lfg.Controllers;

import com.lfg.lfg.Models.Group;
import com.lfg.lfg.Services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GroupController {
    @Autowired
    private GroupService groupService;

    @PostMapping(path="groups/add")
    public String addnewGroup(@RequestBody Group group){

        if(groupService.saveGroup(group)){
            return "Group created Succesfully";
        }else{
            return "Group add failed";
        }

    }
}
