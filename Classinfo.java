
    public class Classinfo{
        String classname;
        String grade;
        int number;
        String speciality;
        String department;
        String classCharger;

    void dy(){
        System.out.println("班级名称"+classname);
        System.out.println("所属年级"+grade);
        System.out.println("班级人数"+number);
        System.out.println("所属专业"+speciality);
        System.out.println("所属系别"+department);
        System.out.println("班主任姓名"+classCharger);
    }
        Classinfo(){
        classname="22软工2班";
        grade="22级";
        number=36;
        speciality="软件工程";
        department="信息技术";
        classCharger="朱翠红";
    }

    public void main(String[] args) {
        Classinfo c =new Classinfo();
        System.out.println("班级名称"+c.classname);
        System.out.println("所属年级"+c.grade);
        System.out.println("班级人数"+c.number);
        System.out.println("所属专业"+c.speciality);
        System.out.println("所属系别"+c.department);
        System.out.println("班主任姓名"+c.classCharger);
    }
}
