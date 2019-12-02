package com.pingan.note.jpa;

import com.pingan.note.dao.Todo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: 焦立伟
 * @PackageName: com.pingan.note.jpa
 * @ClassName: TodoJpa
 * @Description:
 * @date: 2019/11/24 10:45
 */
@Repository
public interface TodoJpa  extends PagingAndSortingRepository<Todo,Long> {

    @Override
    Page<Todo> findAll(Pageable pageable);
}
