package com.pi.departmentservice.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


import com.pi.departmentservice.repository.DepartmentRepository;
import com.pi.departmentservice.model.Department.Department;

@RestController
@RequestMapping("/department")

public class DepartmentController {
    private static final Logger LOGGER = LoggerFactory.getLogger(clazz:DepartmentController.class);
    @Autowired
    private DepartmentRepository repository;
    @PostMapping
    public Department add(@RequestBody Department department) {
        LOGGER.info(message:"Department add: {}", department);
        return repository.addDepartment(department);      
    }
    @GetMapping
    public List<Department> findAll() {
        LOGGER.info(message:"Department find");
        return repository.findAll();
    }
    @GetMapping("/{id}")
    public Department findById (@PathVariable Long id) {
        LOGGER.info(format:"Department find : id={}",id);
        return repository.findById(id);
    }
}
