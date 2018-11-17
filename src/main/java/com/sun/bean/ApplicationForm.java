package com.sun.bean;

/**
 * create by qiulisun on 2018/11/17.<br>
 */
public class ApplicationForm {
    //	id	bigint	11	0	0	0	-1	0				id					0	0	0	0	-1	0	0
    private long id;
    //	name	varchar	20	0	-1	0	0	0				姓名			utf8	utf8_general_ci	0	0	0	0	0	0	0
    private String name;
    //	qq	varchar	20	0	-1	0	0	0				qq号			utf8	utf8_general_ci	0	0	0	0	0	0	0
    private String qq;
    //	type	varchar	20	0	-1	0	0	0				修真类型			utf8	utf8_general_ci	0	0	0	0	0	0	0
    private String type;
    //	admission_time	bigit	6	0	-1	0	0	0				预计入学时间					0	0	0	0	0	0	0
    private long admissionTime;
    //	graduate_school	varchar	50	0	-1	0	0	0				毕业院校			utf8	utf8_general_ci	0	0	0	0	0	0	0
    private String graduateSchool;
    //	studentIdOnWeb	varchar	20	0	-1	0	0	0				线上学号			utf8	utf8_general_ci	0	0	0	0	0	0	0
    private String studentIdOnWeb;
    //	daily_link	varchar	50	0	-1	0	0	0				日报链接			utf8	utf8_general_ci	0	0	0	0	0	0	0
    private String dailyLink;
    //	slogan	varchar	50	0	-1	0	0	0				口号			utf8	utf8_general_ci	0	0	0	0	0	0	0
    private String slogan;
    //	brother	varchar	20	0	-1	0	0	0				师兄			utf8	utf8_general_ci	0	0	0	0	0	0	0
    private String brother;
    //	message_channel	varchar	50	0	-1	0	0	0				从何处了解到修真院			utf8	utf8_general_ci	0	0	0	0	0	0	0
    private String messageChannel;
    //	create_at	bigint	6	0	-1	0	0	0				创建时间					0	0	0	0	0	0	0
    private long createAt;
    //	update_at	bigint	6	0	-1	0	0	0				最后修改时间					0	0	0	0	0	0	0
    private long updateAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getAdmissionTime() {
        return admissionTime;
    }

    public void setAdmissionTime(long admissionTime) {
        this.admissionTime = admissionTime;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    public String getStudentIdOnWeb() {
        return studentIdOnWeb;
    }

    public void setStudentIdOnWeb(String studentIdOnWeb) {
        this.studentIdOnWeb = studentIdOnWeb;
    }

    public String getDailyLink() {
        return dailyLink;
    }

    public void setDailyLink(String dailyLink) {
        this.dailyLink = dailyLink;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getBrother() {
        return brother;
    }

    public void setBrother(String brother) {
        this.brother = brother;
    }

    public String getMessageChannel() {
        return messageChannel;
    }

    public void setMessageChannel(String messageChannel) {
        this.messageChannel = messageChannel;
    }

    public long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(long createAt) {
        this.createAt = createAt;
    }

    public long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(long updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "ApplicationForm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qq='" + qq + '\'' +
                ", type='" + type + '\'' +
                ", admissionTime=" + admissionTime +
                ", graduateSchool='" + graduateSchool + '\'' +
                ", studentIdOnWeb='" + studentIdOnWeb + '\'' +
                ", dailyLink='" + dailyLink + '\'' +
                ", slogan='" + slogan + '\'' +
                ", brother='" + brother + '\'' +
                ", messageChannel='" + messageChannel + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
