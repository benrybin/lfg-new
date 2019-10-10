package com.lfg.lfg.Services;

import com.lfg.lfg.Models.Group;
import com.lfg.lfg.Repos.GroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {
    @Autowired
    private GroupRepo groupRepo;

    public Boolean saveGroup(Group group){

        groupRepo.save(group);

        return groupRepo.existsBygroupName(group.getGroupName());

    }

}
