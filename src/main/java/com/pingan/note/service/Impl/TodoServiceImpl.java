package com.pingan.note.service.Impl;

import com.pingan.note.dao.Todo;
import com.pingan.note.jpa.TodoJpa;
import com.pingan.note.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author: 焦立伟
 * @PackageName: com.pingan.note.service.Impl
 * @ClassName: TodoServiceImpl
 * @Description:
 * @date: 2019/11/24 10:51
 */
@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoJpa todoJpa;

    @Override
    public Todo addNOte(Todo todo) {

        Todo save = todoJpa.save(todo);

        return save;
    }

    @Override
    public Todo findOne(Long id) {

        Optional<Todo> findResult = todoJpa.findById(id);

        return findResult.get();
    }

    @Override
    public Page<Todo> findAll(int pageNum,int pageSize) {

        PageRequest pa = PageRequest.of(pageNum, pageSize);

        //List<Todo> all = todoJpa.findAll();

        Page<Todo> todoPage = todoJpa.findAll(pa);

        return todoPage;
    }

    @Override
    public void delete(Long id) {

        todoJpa.deleteById(id);

    }
}
