package uan.edu.co;

import org.springframework.web.bind.annotation.RestController;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	   @Autowired
       private IHelloService helloService;
	   
   
       
    
  
  
}