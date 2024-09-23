package com.p0rtz.demo.services;

import com.p0rtz.demo.domain.User;
import com.p0rtz.demo.dto.UserDTO;
import com.p0rtz.demo.repository.UserRepository;
import com.p0rtz.demo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return  repo.findAll();
    }
     public User findById(String id){
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
     }

     public User insert(User obj){
        return repo.insert(obj);
     }

     public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
     }

     public void  delete(String id){
        findById(id);
        repo.deleteById(id);
     }

}
