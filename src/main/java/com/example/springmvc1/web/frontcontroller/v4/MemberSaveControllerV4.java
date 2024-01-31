package com.example.springmvc1.web.frontcontroller.v4;

import com.example.springmvc1.domain.member.Member;
import com.example.springmvc1.domain.member.MemberRepository;
import com.example.springmvc1.web.frontcontroller.ModelView;

import java.util.Map;

public class MemberSaveControllerV4 implements ControllerV4 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public String process(final Map<String, String> paramMap,
                          final Map<String, Object> model) {
        String username = paramMap.get("username");
        int age = Integer.parseInt(paramMap.get("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);


        model.put("member", member);
        return "save-result";
    }
}
