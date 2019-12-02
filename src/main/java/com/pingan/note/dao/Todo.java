package com.pingan.note.dao;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

/**
 * @author: 焦立伟
 * @PackageName: com.pingan.note.dao
 * @ClassName: Todo
 * @Description:
 * @date: 2019/11/24 10:42
 */
@Entity
@Table(name = "t_todo")
public class Todo {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String note;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    private String level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Temporal(TemporalType.DATE)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", note='" + note + '\'' +
                ", date=" + date +
                ", level='" + level + '\'' +
                '}';
    }
}
