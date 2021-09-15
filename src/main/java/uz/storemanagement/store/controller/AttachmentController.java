package uz.storemanagement.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.storemanagement.store.entity.Attachment;
import uz.storemanagement.store.service.AttachmentService;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/attachment")
@CrossOrigin
public class AttachmentController {

    @Autowired
    AttachmentService attachmentService;

    @GetMapping("{id}")
    public byte[] getById(@PathVariable UUID id) {
        return attachmentService.getById(id);
    }

    @PostMapping
    public String add(
//            @RequestBody MultipartHttpServletRequest multipartHttpServletRequest
            @RequestParam("image") MultipartFile file
    ) {
        return attachmentService.addAttachment(
                file
//                multipartHttpServletRequest
        );
    }

}
