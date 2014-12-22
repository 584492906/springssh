package com.shinowit.entity;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


public class StuInfoValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        if (aClass == StuInfo.class) {
            return true;
        }
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {

        StuInfo stu = (StuInfo) o;
        if (stu == null) {
            return;
        } else if ((stu.getStuName().trim().length() < 3) || (stu.getStuName() == null)) {
            errors.rejectValue("stuname", null, "不能少于三个字符");
        }
    }
}
