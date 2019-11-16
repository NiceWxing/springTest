package com.yimi.spring.Factory.SimpleFactoryPattern;

public class CourseFactory {
    //第一版，不符合开闭原则
   /* public ICourse create(String name){
        if ("java".equals(name)){
            return new JavaCourse();
        }else if ("python".equals(name)){
            return new PythonCourse();
        }else {
            return null;
        }
    }*/


    /**
     * 第二版问题
     * 产品不断丰富的过程中不需要修改CourseFactory 中的代码。但还有个问题是，方法参数是字符串，可控性有待提升，
     * 而且还需要强制转型。
     * @param className
     * @return
     */
   /* public ICourse create(String className){
        try {
            if (!(null == className||"".equals(className))){
                return (ICourse) Class.forName(className).newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }*/


   //第三版
   public ICourse create(Class<? extends ICourse> clazz){
       try {
           if (null!=clazz){
               return clazz.newInstance();
           }
       } catch (InstantiationException e) {
           e.printStackTrace();
       } catch (IllegalAccessException e) {
           e.printStackTrace();
       }
       return null;
   }

    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        //第一版
        /*factory.create("java");*/
        //第二版
        /*ICourse course =
                factory.create("com.yimi.spring.Factory.SimpleFactoryPattern.JavaCourse");*/
        ICourse course = factory.create(JavaCourse.class);
        course.record();
    }

}
