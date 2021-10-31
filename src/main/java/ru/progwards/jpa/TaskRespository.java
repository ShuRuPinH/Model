package ru.progwards.jpa;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import org.springframework.transaction.annotation.Transactional;
import ru.progwards.model.Task;

@Transactional
@Component
public interface TaskRespository extends JpaRepository <Task, Long> {

}
