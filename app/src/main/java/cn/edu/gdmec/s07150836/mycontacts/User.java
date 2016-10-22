package cn.edu.gdmec.s07150836.mycontacts;

/**
 * Created by Administrator on 2016/10/18 0018.
 */
public class User {
    public final static String NAME="name";
    public final static String MOBLIE="moblie";
    public final static String DANWEI="danwei";
    public final static String ADDRESS="address";
    public final static String QQ="qq";
    private  String name;
    private  String moblie;
    private  String danwei;
    private  String address;

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public static String getNAME() {
        return NAME;
    }

    public static String getMOBLIE() {
        return MOBLIE;
    }

    public static String getDANWEI() {
        return DANWEI;
    }

    public static String getADDRESS() {
        return ADDRESS;
    }

    public static String getQQ() {
        return QQ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoblie() {
        return moblie;
    }

    public void setMoblie(String moblie) {
        this.moblie = moblie;
    }

    public String getDanwei() {
        return danwei;
    }

    public void setDanwei(String danwei) {
        this.danwei = danwei;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId_DB() {
        return id_DB;
    }

    public void setId_DB(int id_DB) {
        this.id_DB = id_DB;
    }

    private  String qq;
    private  int id_DB=-1;

}
