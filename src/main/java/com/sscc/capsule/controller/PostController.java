package com.sscc.capsule.controller;
import com.sscc.capsule.DTO.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {
    @PostMapping("/sign/login")
    public ResponseEntity<String> postLoginInfo(@RequestBody LoginRequest loginRequest){
        String id = loginRequest.getId();
        String pw = loginRequest.getPw();

        // id 와 pw 를 검증하고, 이에 대한 jwt token 반환 해야 함
        // 명세서 메모
        //'jwt' : 'string'
        //'message' : 'string'
        String tokenValue = " this should be a token value ";
        return new ResponseEntity<>(tokenValue , HttpStatus.OK);
    }

    @PostMapping(value ="/api/userId")
    public ResponseEntity<String> getTotalEssayById(@RequestBody IdRequest request){
        int id = request.getId();
        // id 사용하여 로직 작성 가능
        // 조회된 데이터를 클라이언트에게 반환하고자 할 때는 ResponseEntity를 사용해야 함
        // ResponseEntity의 생성자에 반환하고자 하는 데이터와 상태 코드를 전달합니다.
        String responseTotalEssay = "api test.. this is your id :" + id;
        return new ResponseEntity<>(responseTotalEssay, HttpStatus.OK);
    }
}
