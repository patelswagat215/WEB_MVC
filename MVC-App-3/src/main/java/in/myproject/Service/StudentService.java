package in.myproject.Service; 

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import in.myproject.binding.Student;
import in.myproject.entity.StudentEntity;
import in.myproject.repository.StudentRepository;
import jakarta.persistence.Entity;
import lombok.Data;
@Data
@Component
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	@Autowired
	private StudentEntity entity;
	
	List<String> timings=Arrays.asList("Morning","Afternoon","Evening");
	List<String> courses=Arrays.asList("Python","Java","HTML");
	
    public boolean saveStudent(Student student)
    {
    	BeanUtils.copyProperties(student,entity);
    	entity.setTimings(Arrays.toString(student.getTimings()));
    	repo.save(entity);
    	return true;
    }
}
