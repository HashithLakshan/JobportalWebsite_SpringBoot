package com.example.Ceylone.Snippers.Back.End.controller;

import com.example.Ceylone.Snippers.Back.End.dto.BookingsDto;
import com.example.Ceylone.Snippers.Back.End.dto.UserToPhotographerFeedbacksDto;
import com.example.Ceylone.Snippers.Back.End.services.UserToPhotographerFeedbacksService;
import com.example.Ceylone.Snippers.Back.End.utill.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/userToPhotographerFeedbacks")
@CrossOrigin
public class UserToPhotographerFeedbacksController {

    private final UserToPhotographerFeedbacksService userToPhotographerFeedbacksService;

@Autowired
    public UserToPhotographerFeedbacksController(UserToPhotographerFeedbacksService userToPhotographerFeedbacksService) {
        this.userToPhotographerFeedbacksService = userToPhotographerFeedbacksService;
    }

    @GetMapping("/getUserToPhotographerFeedbacksActive/{PhotographerID}")
    private CommonResponse getAllPhotographerFeedbacksActive(@PathVariable String PhotographerID){
        return userToPhotographerFeedbacksService.getAllPhotographerFeedbacksActive(PhotographerID);
    }

    @GetMapping("/getFeedbacksAllSatisfied/{PhotographerID}")
    private CommonResponse getFeedbacksAllSatisfied(@PathVariable String PhotographerID){
    return userToPhotographerFeedbacksService.getallStaisfied(PhotographerID);
    }
    @PostMapping("/saveUserToPhotographerFeedbacks")
    public CommonResponse saveFeedback(@RequestBody UserToPhotographerFeedbacksDto userToPhotographerFeedbacksDto){
        return userToPhotographerFeedbacksService.saveFeedback(userToPhotographerFeedbacksDto);

    }
    @GetMapping("/getUserToPhotographerFeedbacksInactive/{PhotographerID}")
    private CommonResponse getAllPhotographerFeedbacksInactive(@PathVariable String PhotographerID){
        return userToPhotographerFeedbacksService.getAllPhotographerFeedbacksInactive(PhotographerID);
    }
    @PutMapping("/InactiveFeedbackUToP/{uToPFeedbackID}")
    public  CommonResponse updateInactive(@PathVariable String uToPFeedbackID ){
        return userToPhotographerFeedbacksService.updateInactive(uToPFeedbackID);
    }
    @PutMapping("/activeFeedbackUToP/{uToPFeedbackID}")
    public  CommonResponse updateActive(@PathVariable String uToPFeedbackID ){
        return userToPhotographerFeedbacksService.updateActive(uToPFeedbackID);
    }
    @PutMapping("/DeleteFeedbackUToP/{uToPFeedbackID}")
    public  CommonResponse updateDelete(@PathVariable String uToPFeedbackID ){
        return userToPhotographerFeedbacksService.updateDelete(uToPFeedbackID);
    }
    @PutMapping("/FeedbackUToPYesmark/{uToPFeedbackID}")
    public  CommonResponse updateYes(@PathVariable String uToPFeedbackID ){
        return userToPhotographerFeedbacksService.updateYes(uToPFeedbackID);
    }

    @GetMapping("/getFeedbackByUserName/{userName}/{photographerID}")
    public  CommonResponse getFeedabacksSearchName(@PathVariable String userName,@PathVariable String photographerID){
        return userToPhotographerFeedbacksService.getFeedabacksSearchName( userName,photographerID);
    }

    @GetMapping("/getFeedbacksByUserID/{userID}/{photographerID}")
    public  CommonResponse getFeedabacksSearchID(@PathVariable String userID,@PathVariable String photographerID){
        return userToPhotographerFeedbacksService.getFeedabacksSearchID( userID,photographerID);
    }
    @GetMapping("/getFeedbackByUserNameSatisfied/{userName}/{photographerID}")
    public CommonResponse getFeedbackByUserNameSatisfied(@PathVariable String userName,@PathVariable String photographerID){
    return userToPhotographerFeedbacksService.satisfiedByUserName(userName,photographerID);
    }

    @GetMapping("/getFeedbackByUserIDSatisfied/{userID}/{photographerID}")
    public  CommonResponse getFeedbackByUserIDSatisfied(@PathVariable String userID,@PathVariable String photographerID){
    return  userToPhotographerFeedbacksService.getFeedbacksSatisfiedUserID(userID,photographerID);
    }
    @GetMapping("/getFeedBackIDDetails/{uToPFeedbackID}")
    public  CommonResponse getFeedBackIDDetails(@PathVariable String uToPFeedbackID ){
    return userToPhotographerFeedbacksService.getFeedBackIDDetailss(uToPFeedbackID);
    }


}
