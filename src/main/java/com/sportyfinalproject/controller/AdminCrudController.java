package com.sportyfinalproject.controller;

import com.sportyfinalproject.model.Admin;
import com.sportyfinalproject.model.Category;
import com.sportyfinalproject.model.Users;
import com.sportyfinalproject.service.AdminCrudService;
import com.sportyfinalproject.service.CategoryCrudService;
import com.sportyfinalproject.service.impl.CategoryCrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminCrudController {

    @Autowired
    private AdminCrudService adminCrudService;

    @PostMapping("/admin")
    public Admin autheticateAdmin(@RequestBody Admin admin){

        return adminCrudService.authenticate(admin);
    }

    @GetMapping("/admin/{id}")
    public Admin getAdminById(@PathVariable int id){

        return adminCrudService.getAdminById(id);
    }

    @PutMapping("/admin")
    public Admin updateUser(@RequestBody Admin admin) {
        return adminCrudService.UpdatedAdminByPasswordId(admin);
    }


    @RequestMapping(value = "/admincategories")
	    public String categories(ModelMap map, javax.servlet.http.HttpServletRequest request)
	    {
		  // check if session is still alive
		  //HttpSession session = request.getSession();
		  //if (session.getAttribute("admin_id") == null) {
		//	  return "admin/login";
		  //}

		  //List<Category> list = CategoryCrudService;
		  //map.addAttribute("list", list);
		  //map.addAttribute("pageTitle", "ADMIN SETUP PRODUCT CATEGORIES");
	        return "admin/categories";
	    }

}
