package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private MemberService memberService;

    // 컨드롤러가 서비스랑 연결시킬 때 Autowired를 쓴다
    @Autowired
    public MemberController (MemberService memberService){
        this.memberService = memberService;
    }

}
