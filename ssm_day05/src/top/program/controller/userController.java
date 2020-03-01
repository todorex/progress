package top.program.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.program.entity.Student;
import top.program.service.StudentService;

@Controller
@RequestMapping("user")//请求路径
public class userController {
    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "/test")

    public String testUser(@RequestBody Student student){
    studentService.creatStudent(student);
        return "user";
    }


//    @RequestMapping("/test")
//    public String testUser() {
//        return "user";//jsp的名称
//    }






////网页面丢数据---请求转发
//    @RequestMapping("/test")
    //1.利用modelAndView
//    public ModelAndView testUser(){
//        ModelAndView model=new ModelAndView();
//        model.setViewName("user");
//        user use = new user();
//        use.getId(28);
//        model.addObject("user",use);
//        return model;//jsp的名称
//    }
//2.利用ModelMap对象
//        public String testUser(ModelMap modelMap, HttpServletRequest request){
//        String id=request.getParameter("id");
//        String name=request.getParameter("name");
//        User user =new User();
//        user.setId(28);
//        user.setName("xiaxai");
//        modelMap.addAttribute("user",user);
//        // 重定向redirect
//        return "redirect:/user/demo";
//




//请求后  后端重新获取前端返回的数据
    //方法1
//@RequestMapping("/test/{id}/{name}")
//    public String testUser(ModelMap modelMap, @PathVariable Integer id, @PathVariable String name){
//    System.out.println(id);
//    System.out.println(name);
//    User user=new User();
////    user.setName("xiaxai");
////    user.getId(18);
////    modelMap.addAttribute("user",user);
//    return "user";
//方法2
//@RequestMapping("/test")
//    public String testUser(ModelMap modelMap, User user){
//      modelMap.addAttribute("user",user);
//        return "user";
//}
//@RequestMapping("/demo")
//public String demoUser() {
//    return "demo";//jsp的名称
//}





//json







//拦截器
@RequestMapping(value = "/demo")
public String demoUser(){
    return "demo";
}


}
