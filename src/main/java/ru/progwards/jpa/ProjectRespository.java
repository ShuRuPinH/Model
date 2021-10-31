package ru.progwards.jpa;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.progwards.model.Project;

@Transactional
@Component
public interface ProjectRespository extends JpaRepository <Project, Long> {

}
