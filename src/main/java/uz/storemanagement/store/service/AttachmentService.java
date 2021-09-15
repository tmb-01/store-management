package uz.storemanagement.store.service;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.storemanagement.store.entity.Attachment;
import uz.storemanagement.store.repository.AttachmentRepository;

import java.io.IOException;
import java.util.Optional;
import java.util.UUID;

@Service
public class AttachmentService {

    @Autowired
    AttachmentRepository attachmentRepository;

    public byte[] getById(UUID id) {
        Optional<Attachment> byId = attachmentRepository.findById(id);
        if (byId.isPresent()) {
            Attachment attachment = byId.get();
            return attachment.getData();
        }
        return null;
    }

    @SneakyThrows
    public String addAttachment(
//            MultipartHttpServletRequest multipartHttpServletRequest
            MultipartFile image
    ) {
//        MultipartFile image = multipartHttpServletRequest.getFile("image");
        System.out.println(image);
        if (image != null) {
            byte[] imageBytes = image.getBytes();
            Attachment attachment = new Attachment();
            attachment.setData(imageBytes);
            Attachment save = attachmentRepository.save(attachment);
            return String.valueOf(save.getId());
        }
        return "file not found";
    }
}
