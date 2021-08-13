package uz.pdp.pcmarketrestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.pcmarketrestapp.entity.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
