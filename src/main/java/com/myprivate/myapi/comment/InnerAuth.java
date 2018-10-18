package com.myprivate.myapi.comment;

import com.myprivate.myapi.domain.Person;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author 黄志强
 * @data 2018/9/6 16:21
 */
@Aspect
@Component
public class InnerAuth {

    @Pointcut(value = "@annotation(com.myprivate.myapi.comment.AnnoInner)")
    public void pointCut(){}

    @Before(value = "pointCut() && @annotation(annoInner)")
    public void before(JoinPoint joinPoint,AnnoInner annoInner ){
        String name1 = joinPoint.getSignature().getName();
        Long id=22L;
        String name="你哈";
        Long age=23L;

        //获取方法参数
        Object[] args = joinPoint.getArgs();
        if (args != null && args.length>0){
            for (int i=0;i<args.length;i++) {
                if (args[i] instanceof Person){
                    Person arg = (Person) args[i];
                    arg.setAge(age);
                    arg.setId(id);
                    arg.setName(name);
                }
            }

        }
    }

}
