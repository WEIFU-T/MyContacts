package cn.edu.gdmec.s07150836.mycontacts;

import android.content.ContentValues;
import android.content.Context;

/**
 * Created by Administrator on 2016/10/18 0018.
 */
public class ContactsTable {
    private final static String TABLENAME="contactsTable";
    private MyDB db;
    public ContactsTable(Context context){
        db=new MyDB(context);
        if (!db.isTableExits(TABLENAME)){
            String createTableSql="create table if not exits"+TABLENAME+"(id_DB integer " +
                    "primary key AUTOINCREMENT," +
                    User.NAME+"VARCHAR," +
                    User.MOBLIE+"VARCHAR," +
                    User.QQ+"VARCHAR," +
                    User.DANWEI+"VARCHAR," +
                    User.ADDRESS+"VARCHAR)";
            db.creatTable(createTableSql);
        }
    }

    public boolean addData(User user){
        ContentValues values=new ContentValues();
        values.put(User.NAME,user.getName());
        values.put(User.MOBLIE,user.getMoblie());
        values.put(User.QQ,user.getQq());
        values.put(User.DANWEI,user.getDanwei());
        values.put(User.ADDRESS,user.getAddress());
        return db.save(TABLENAME,values);
    }
}
