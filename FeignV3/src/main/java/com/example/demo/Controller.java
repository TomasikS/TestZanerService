/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author stefan.tomasik
 */
@RestController
@RequestMapping("/api")
public class Controller {
    
    
    @Autowired
     public IClient  client;
   
  

    @GetMapping("/notes")
    public List<Zaner> getAllNotes() { return client.getZaners();}
     
   
    @GetMapping("/todos")
    public List<Zaner> getAllNotes2() { return client.getZaners2();}
     
   
  

}
