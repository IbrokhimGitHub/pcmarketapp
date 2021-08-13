//package uz.pdp.pcmarketrestapp.controller;
//
//import lombok.SneakyThrows;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.util.FileCopyUtils;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartHttpServletRequest;
//import uz.pdp.pcmarketrestapp.entity.AttachmentContent;
//import uz.pdp.pcmarketrestapp.payload.Result;
//import uz.pdp.pcmarketrestapp.service.AttachmentService;
//
//import javax.servlet.http.HttpServletResponse;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/attachmentController")
//public class AttachmentController {
//    @Autowired
//    AttachmentService attachmentService;
//    @PostMapping("/upload")
//    public Result upload(MultipartHttpServletRequest request){
//        Result result = attachmentService.add(request);
//        return result;
//    }
//    @GetMapping("/{id}")
//    @SneakyThrows
//    public void get(@PathVariable Integer id, HttpServletResponse response){
//        List<AttachmentContent> photos = attachmentService.getPhotos(id);
//        for (AttachmentContent photo : photos) {
//            FileCopyUtils.copy(photo.getBytes(),response.getOutputStream());
//           }
//    }
//}
