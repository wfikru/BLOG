
package com.web.blog.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.blog.domain.Reader;
import com.web.blog.domain.Reader_Roles;
import com.web.blog.domain.Role;
import com.web.blog.serviceImpl.Reader_Service;


@Controller
public class ReaderController {

    public ReaderController() {
    }
    
    
    @Resource
    private Reader_Service readerService;
    
     public void setReaderService(Reader_Service readerService) {
        this.readerService = readerService;
    }

     
      @RequestMapping(value="/signup",method=RequestMethod.POST)
     public String readerSignup(@Valid Reader reader, BindingResult result, 
             Model model, HttpSession session){
         
         String view = "redirect:/home2";
         if(!result.hasErrors()) {
            
              reader.addReader_role(new Reader_Roles(reader, new Role("ADMIN_ROLE")));

              reader.addReader_role(new Reader_Roles(reader, new Role("USER_ROLE")));
             try{
                
                 readerService.add(reader);
                 model.addAttribute("errorMessage", null);
             }catch(Exception e){
//                e.printStackTrace();
                 model.addAttribute("errorMessage", "The username exists, try another");
                 view = "readerSignup";
             }
             
         } else{
             view = "readerSignup";
         }
         
         return view;
     }
     
     @RequestMapping(value="/readerSignup",method=RequestMethod.GET)
     public String goToReaderSignUp(@ModelAttribute("reader") Reader reader){
         
         return "readerSignup";
     }
      
     
     @RequestMapping(value="/addArticle",method=RequestMethod.GET)
     public String goToAddArticle(){
         
         return "addArticle";
     }
     
     @RequestMapping(value="/login" , method=RequestMethod.POST)
     public String readerLogin(String username, String password, HttpSession session){

         return "redirect:/login";
     }
     
     @RequestMapping(value="/logoutsuccess" , method=RequestMethod.POST)
     public String succesfulLogout(String username, String password, HttpSession session){
         session.setAttribute("isloggedin", false);
         return "redirect:/home2";
     }
     
     @RequestMapping(value="/continue" , method=RequestMethod.POST)
     public String continueToHome(Model model , HttpSession session){
        UserDetails userDetails = (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        session.setAttribute("isloggedin", true);
        Reader theCurrentReader = readerService.getReader(userDetails.getUsername());
         System.out.println(userDetails.getUsername()+"################################");
        session.setAttribute("currentReader", theCurrentReader);
        model.addAttribute("currentReader", theCurrentReader);
        return "redirect:/home2";
     }
     
     @RequestMapping(value="/loginsuccess",method=RequestMethod.GET)
     public String goToLoginsuccess(){
         
         return "loginsuccess";
     }
     
     @RequestMapping(value="/login",method=RequestMethod.GET)
     public String goToLogIn(String username, Model model, HttpSession session){
         
         return "login";
     }
     @RequestMapping(value="/loginfailed",method=RequestMethod.GET)
     public String goToLogInFailed(){
         
         return "loginfailed";
     }
}
