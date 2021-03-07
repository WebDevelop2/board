package com.board.demo.service;

import com.board.demo.domain.Board;
import com.board.demo.mapper.BoardMapper;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class BoardService {
    private final BoardMapper boardMapper;
    public BoardService(@Lazy BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    public int boardCount(){
        return boardMapper.boardCount();
    }

    public List<Board> boardList(){
        return boardMapper.getList();
    }
}
