package com.example.demo.controller;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Book;
import com.example.demo.model.Demand;
import com.example.demo.repo.BookRepo;
import com.example.demo.repo.DemandRepo;


@Controller
public class MyController {
	
	
	 @Autowired  
	  private  BookRepo stu;
	 
	 
	 @Autowired
	 private DemandRepo drp;
	  
	//////////////////////////////////////////////////////////////////////////////////////  
	    @RequestMapping("/test")
	    String myfun(Model m) {
	        Book s = new Book();

	        System.out.println("Data in	 u object from " + s);
	        m.addAttribute("obj", s);

	        return "index.html";
	    }
	    
	    
	    
	    
	    @RequestMapping("/indexx")
	    String myfun1(Model m) {
	        Book s = new Book();

	        System.out.println("Data in	 u object from " + s);
	        m.addAttribute("obj", s);

	        return "add.html";
	    }
	    
	    
	    

	    @RequestMapping("/insert")
	    ModelAndView myfun2(@ModelAttribute("obj") Book s1) {
	        System.out.println("Data in u object from After " + s1);
	        
	        stu.save(s1);
	        
	        
	        
	        ModelAndView mv = new ModelAndView("index.html");
	        mv.addObject("ob", s1);

	        return mv; 
	    }
	    
	    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    
	    
	    @RequestMapping("/show")
	    ModelAndView myfun246(@ModelAttribute("obj") Book s1) {
	        System.out.println("Data in u object from After " + s1);

	        // Assuming stu.findAll() returns a List of Students
	        List<Book> slist = stu.findAll();

	        ModelAndView mv = new ModelAndView("show.html");
	        mv.addObject("show", slist);

	        return mv; 
	    }
//////////////////////////////////////////////////////
	    
	    @RequestMapping("/showhistory")
	    ModelAndView myfun24(@ModelAttribute("obj") Book s1) {
	        System.out.println("Data in u object from After " + s1);

	        // Assuming stu.findAll() returns a List of Students
	        List<Book> slist = stu.findAll(Sort.by(Sort.Direction.DESC, "id"));

	        ModelAndView mv = new ModelAndView("showHistory.html");
	        mv.addObject("show", slist);

	        return mv; 
	    }
	    
	    //////////////////////////////////////////////////////////////////////////////////////////////////////////
	    
	

	    @GetMapping("/delete/{id}")
	    public String myfun4(@PathVariable("id") Integer id) {

	        stu.deleteById(id);

	      
	        return "redirect:/show";
	    }
	    
	    
	    /////////////////////////////////////////////////////
	    
	    


@RequestMapping("/update/{id}")
public ModelAndView showUpdateForm(@PathVariable("id") Integer id) {
    Optional<Book> book = stu.findById(id);

    ModelAndView mv = new ModelAndView("updatedata.html");
    mv.addObject("book", book.orElse(null)); // Pass the student to the update form
    return mv;
}


@PostMapping("/updatee")
public String updateStudent(@ModelAttribute Book updatedStudent) {
    stu.save(updatedStudent); // Save the updated student data
    return "redirect:/show"; // Redirect to the student list page after update
}

	    //////////////////////////////////////////

@RequestMapping("/search")
public ModelAndView searchBooks(@RequestParam("title") String title) {
    List<Book> searchResults = stu.findByTitleContaining(title);

    ModelAndView mv = new ModelAndView("searchdata.html");
    mv.addObject("searchob", searchResults);
    return mv;
}

////////////////////////////////////////////////////////////////////////////////////////////





@RequestMapping("/outofstockk")
ModelAndView myfun244(@ModelAttribute("obj") Book s1) {
    System.out.println("Data in u object from After " + s1);

    // Assuming stu.findAll() returns a List of Students
    List<Book> slist = stu.findAllByQuantityLessThanEqual(5, Sort.by(Sort.Direction.DESC, "id"));

    ModelAndView mv = new ModelAndView("outofstock.html");
    mv.addObject("ofs", slist);

    return mv; 
}


//////////////////////////////////////////////////////////////////////////////////////////////////////////


@RequestMapping("/demands")
String myfun178(Model m) {

    Demand d = new Demand();
    
    System.out.println("Data in	 u object from " + d);
    m.addAttribute("obj", d);

    return "addDemands.html";
}


@RequestMapping("/adddemand")
ModelAndView myfun25(@ModelAttribute("obj") Demand d1) {
    System.out.println("Data in u object from After " + d1);
    
    drp.save(d1);
    
    
    
    ModelAndView mv = new ModelAndView("index.html");
    mv.addObject("ob", d1);

    return mv; 
}


////////////////////////////////////////////////////////////////////////


@RequestMapping("/showdemands")
ModelAndView myfun242(@ModelAttribute("obj") Demand s1) {
    System.out.println("Data in u object from After " + s1);

    // Assuming stu.findAll() returns a List of Students
    List<Demand> slist = drp.findAll();

    ModelAndView mv = new ModelAndView("showDemands.html");
    mv.addObject("show", slist);

    return mv; 
}

///////////////////////////////////////////////////////////////////////////////////



@GetMapping("/deletedemands/{id}")
public String myfun43(@PathVariable("id") Integer id) {

    drp.deleteById(id);

  
    return "redirect:/showdemands";
}





	    
	    
}
