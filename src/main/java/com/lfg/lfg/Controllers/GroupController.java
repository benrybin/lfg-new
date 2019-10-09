package com.lfg.lfg.Controllers;

import com.lfg.lfg.Services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GroupController {
    @Autowired
    private GroupService groupService;
}
