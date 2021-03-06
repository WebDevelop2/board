package com.board.demo.controller;

import com.board.demo.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/**")
public class BoardController {
    private final BoardService service;

    public BoardController(BoardService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public String Hello(){
        return "boards/hello";
    }

    @GetMapping("/test")
    public String test(Model model){
        model.addAttribute("cnt", service.boardCount());
        model.addAttribute("test", service.boardList());
        return "boards/hello";
    }

    @GetMapping("/main")
    public String main(Model model){
        model.addAttribute("list", service.boardList());
        return "boards/main";
    }
}
