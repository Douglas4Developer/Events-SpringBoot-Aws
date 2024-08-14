package com.eventostec.api.sevices;

import com.eventostec.api.domain.event.Event;
import com.eventostec.api.domain.event.EventRequestDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class EventService {


    public Event createEvent(EventRequestDTO data){
        String imgUrl = null;


    if (data.image() != null){
        imgUrl = this.uploadImg(data.image());
    }
    Event newEvent = new Event();

    }

    public String uploadImg(MultipartFile multipartFile){
        return "";

    }


}
