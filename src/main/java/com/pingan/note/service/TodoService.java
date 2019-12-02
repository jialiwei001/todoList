package com.pingan.note.service;

import com.pingan.note.dao.Todo;
import com.pingan.note.dao.User;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author: 焦立伟
 * @PackageName: com.pingan.note.service
 * @ClassName: TodoService
 * @Description:
 * @date: 2019/11/24 10:47
 */

public interface TodoService {

    Todo  addNOte(Todo todo);

    Todo  findOne(Long id);

    Page<Todo> findAll(int pageNum,int pageSize);

    void  delete(Long id);

}
