package com.powernode.ph.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.powernode.ph.bean.User;
import com.powernode.ph.bean.Vip;
import com.powernode.ph.enums.CodeEnum;
import com.powernode.ph.result.R;
import com.powernode.ph.service.VipService;
import com.powernode.ph.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VipController {

    @Autowired
    private VipService vipService;

    // RESTFul编程风格
    /*@GetMapping("/list/{pageNo}")
    public PageInfo<Vip> list(@PathVariable int pageNo) {
        // 1. 设置当前页码和每页显示的记录条数。
        // 这行代码只要执行，将来执行sql语句的时候会自动添加 limit，比较方便。
        PageHelper.startPage(pageNo, Constant.PAGE_SIZE);
        // 2. 查询数据
        List<Vip> vips = vipService.findAll();
        // 3. 将数据封装到PageInfo对象当中即可。
        PageInfo<Vip> vipPageInfo = new PageInfo<>(vips);
        return vipPageInfo;
    }*/

    @GetMapping("/list/{pageNo}")
    public R<PageInfo<Vip>> list(@PathVariable int pageNo) {
        PageHelper.startPage(pageNo, Constant.PAGE_SIZE);
        List<Vip> vips = vipService.findAll();
        PageInfo<Vip> vipPageInfo = new PageInfo<>(vips);
        return R.OK(vipPageInfo);
    }

    @GetMapping("/detail")
    public R<User> detail(){
        // 这个数据是service返回的数据
        User user = new User("jackson", 20);
        // 响应给前端数据
        //return R.OK(user);
        //return R.OK(); // 不携带数据。
        //return R.FAIL();
        //return R.FAIL(404, "资源找不到");

        return R.FAIL(CodeEnum.NOT_FOUND);
    }
}
