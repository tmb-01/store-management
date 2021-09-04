package uz.storemanagement.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.storemanagement.store.entity.Attachment;

import java.util.UUID;

public interface AttachmentRepository extends JpaRepository<Attachment, UUID> {
}
