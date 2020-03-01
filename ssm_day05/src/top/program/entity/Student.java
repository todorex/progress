//映射的对象
package top.program.entity;

public class Student {
    private Integer sid;
    private Integer sage;
    private Integer tId;
    private String sname;
    private String ssex;

    public Integer getId() {
        return sid;
    }

    public void setId(Integer id) {
        this.sid = id;
    }

    public Integer getAge() {
        return sage;
    }

    public void setAge(Integer age) {
        this.sage = age;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String getName() {
        return sname;
    }

    public void setName(String name) {
        this.sname = name;
    }

    public String getSex() {
        return ssex;
    }

    public void setSex(String sex) {
        this.ssex = sex;
    }
}
