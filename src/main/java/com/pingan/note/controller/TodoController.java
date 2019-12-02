package com.pingan.note.controller;

import com.pingan.note.dao.Todo;
import com.pingan.note.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author: 焦立伟
 * @PackageName: com.pingan.note.controller
 * @ClassName: TodoController
 * @Description:
 * @date: 2019/11/24 11:01
 */
@Controller
public class TodoController {

    @Autowired
    private TodoService todoService;

    @RequestMapping("addTodo")
    public String addTodo(Todo todo){
        System.out.println("进入了添加todo方法："+todo.toString());

        Todo todo1 = todoService.addNOte(todo);

        return "redirect:findAll";
    }

    @RequestMapping("update")
    public String update(Todo todo){
        System.out.println("进入了update方法"+todo);

        Todo todo1 = todoService.addNOte(todo);

        return "redirect:findAll";
    }

    @RequestMapping("findOne")
    public String findOne(Long id, Model model){
        System.out.println("进入了查询一个方法："+id);

        Todo one = todoService.findOne(id);

        model.addAttribute("todo",one);

        return "edit";

    }

    @RequestMapping("findAll")
    public String findAll(Model model,  @RequestParam(value = "pageNum", defaultValue = "0") int pageNum, @RequestParam(value = "pageSize", defaultValue = "5") int pageSize){
        System.out.println("进入了查询所有方法：");

        Page<Todo> all = todoService.findAll(pageNum,pageSize);

        model.addAttribute("todos",all);

        return "index";

    }

    @RequestMapping("delete")
    public String delete(Long id){

        todoService.delete(id);

        return "redirect:findAll";
    }


}
