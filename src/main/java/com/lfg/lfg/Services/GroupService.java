package com.lfg.lfg.Services;

import com.lfg.lfg.Models.GamerGroup;
import com.lfg.lfg.Models.User;
import com.lfg.lfg.Repos.GroupRepo;
import com.lfg.lfg.Repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    @Autowired
    private GroupRepo groupRepo;
    @Autowired
    private UserRepo userRepo;

    public Boolean saveGroup(GamerGroup gamerGroup){
        if(groupRepo.existsBygroupName(gamerGroup.getGroupName())){

            return false;
        }else {
            groupRepo.save(gamerGroup);
            return groupRepo.existsBygroupName(gamerGroup.getGroupName());
        }


    }
    public Boolean addUsertoGroup(String userName,String groupName){
        User tempUser = userRepo.findByuserName(userName);
        GamerGroup tempGamerGroup = groupRepo.findBygroupName(groupName);
        System.out.println(tempUser.getUserName());
        System.out.println(tempGamerGroup.getGroupName());
        tempGamerGroup.getUsers().add(tempUser);
        tempUser.getGroups().add(tempGamerGroup);
        userRepo.save(tempUser);
        groupRepo.save(tempGamerGroup);
        return true;
    }
    public List<User> getUsers(String groupName){
        return groupRepo.findBygroupName(groupName).getUsers();

    }
}
