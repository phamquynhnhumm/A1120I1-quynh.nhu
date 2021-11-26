package grandemonstration.controller;

import grandemonstration.model.Customer;
import grandemonstration.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("customers/list");
        List<Customer> customers = customerService.findAll();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/customers/{id}")
    public ModelAndView showInformation(@PathVariable long id) {
        ModelAndView modelAndView = new ModelAndView("customers/info");
        Customer customers = customerService.findOne(id);
        System.out.println("dang chi tiets" + customers);
        modelAndView.addObject("customer", customers);
        return modelAndView;
    }

    @PostMapping("/customers" )
    public String updateCustomer(
            @RequestParam Long id,
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String address
    ){
        Customer customer = new Customer(id, name, email, address);
        customerService.save(customer);
        return "redirect:/customers";
    }








}


