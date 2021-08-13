package uz.pdp.pcmarketrestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.pcmarketrestapp.entity.AttachmentContent;

import java.util.List;

public interface AttachmentContentRepository extends JpaRepository <AttachmentContent,Integer> {
    List<AttachmentContent> getAttachmentContentByAttachment_Id(Integer attachment_id);

}
