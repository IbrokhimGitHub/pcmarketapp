//package uz.pdp.pcmarketrestapp.service;
//
//import lombok.SneakyThrows;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.multipart.MultipartHttpServletRequest;
//import uz.pdp.pcmarketrestapp.entity.Attachment;
//import uz.pdp.pcmarketrestapp.entity.AttachmentContent;
//import uz.pdp.pcmarketrestapp.repository.AttachmentContentRepository;
//import uz.pdp.pcmarketrestapp.repository.AttachmentRepository;
//import uz.pdp.pcmarketrestapp.payload.Result;
//
//import javax.servlet.http.HttpServletResponse;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class AttachmentService {
//    @Autowired
//    AttachmentRepository attachmentRepository;
//
//    @Autowired
//    AttachmentContentRepository attachmentContentRepository;
//
//    @SneakyThrows
//    public Result add(MultipartHttpServletRequest request) {
//        Iterator<String> fileNames = request.getFileNames();
//        List<MultipartFile> files = request.getFiles(fileNames.next());
//        String returnerStr = "";
//        boolean bool = false;
//        for (MultipartFile multipartFile : files) {
//
//
//            if (multipartFile != null) {
//                String originalFilename = multipartFile.getOriginalFilename();
//                long size = multipartFile.getSize();
//                String contentType = multipartFile.getContentType();
//                Attachment attachment = new Attachment();
//                attachment.setContentType(contentType);
//                attachment.setName(originalFilename);
//                attachment.setSize(size);
//                Attachment savedAttachment = attachmentRepository.save(attachment);
//
//                AttachmentContent attachmentContent = new AttachmentContent();
//                attachmentContent.setAttachment(savedAttachment);
//                attachmentContent.setBytes(multipartFile.getBytes());
//                attachmentContentRepository.save(attachmentContent);
//                returnerStr += "file saved. ID : " + savedAttachment.getId();
//                bool = true;
//            }
//        }
//        if (bool) {
//            return new Result(returnerStr, true);
//        } else {
//            return new Result("something went wrong, file not saved", false);
//        }
//
//
//    }
//
//    public List<AttachmentContent> getPhotos(Integer id) {
//        Optional<Attachment> optionalAttachment = attachmentRepository.findById(id);
//        if (optionalAttachment.isPresent()) {
//            Attachment attachment = optionalAttachment.get();
//            List<AttachmentContent> attachmentContentByAttachment_id = attachmentContentRepository.getAttachmentContentByAttachment_Id(attachment.getId());
//            return attachmentContentByAttachment_id;
//
//        }
//        return null;
//    }
//
//
//}
