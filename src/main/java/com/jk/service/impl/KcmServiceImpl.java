package com.jk.service.impl;


import com.jk.dao.KcmDao;
import com.jk.dao.UserDao;
import com.jk.model.*;
import com.jk.service.KcmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class KcmServiceImpl implements KcmService {

    @Autowired
    private KcmDao userDao;

    @Override
    public List listuser() {
        return userDao.listuser();

    }

    @Override
    public Map<String, Object> loginUser(User user) {
        Map<String, Object> map = new HashMap<>();
        String flag = "0"; //0 : 用户名不存在   1： 密码错误  2： 登录成功
        List<User> user2 = userDao.loginUser(user.getUsername());
//		用户名是否真的存在
        if(user2 != null && user2.size() >0){
            flag = "1";
            User userObj = user2.get(0);
//			页面的密码 与 数据库查出来的密码是否一致
            if(userObj.getUserpass().equals(user.getUserpass())){
                flag = "2";
                map.put("user", userObj);
            }
        }
        map.put("flag", flag);
        return map;
    }

    @Override
    public List<Quan> queryTree(Integer userid) {
        List<Quan> treeAll = this.recursionTree("0",userid);
        return treeAll;
    }

    @Override
    public List<Courseproblem> queryWenList() {

        List<Courseproblem> list = userDao.queryWenList();

        List<ProblemType> typelist =  userDao.queryWenType();
        for (int i = 0;i < list.size();i++){
            String pinnames="";
            String sids=list.get(i).getQuestiontypeid();   //当前问题类型id
            String [] st=sids.split(",");
            for(int j=0;j<st.length;j++){//id集合数组1 2 3
                Integer oneid=Integer.parseInt(st[j]);//   1  2   3
                for(int k=0;k<typelist.size();k++){//第二个集合
                    Integer erid=typelist.get(k).getQuestionid();
                    String efdgsa  = typelist.get(k).getQuestionname();
                    if(oneid == erid){
                        pinnames += efdgsa+",";
                    }
                }
                String pindfdvs = pinnames.substring(0,pinnames.length()-1);
                //set到 属性
                list.get(i).setQuestiontypeid(pindfdvs);
            }
        }
        return list;
    }

    @Override
    public void addWenti( Courseproblem courseproblem) {
        List<ProblemType> typelist = userDao.queryWenType();
        String pinnames="";
        String sids=courseproblem.getQuestiontypeid();       //当前问题类型id
        String [] st=sids.split(" ");
        for(int j=0;j<st.length;j++){//id集合数组1 2 3
            String oneid=st[j];//   1  2   3
            for(int k=0;k<typelist.size();k++){  //第二个集合
                Integer erid=typelist.get(k).getQuestionid();
                String efdgsa  = typelist.get(k).getQuestionname();
                if(efdgsa.equals(oneid)){
                    pinnames += erid+",";
                }
            }
            String pindfdvs = pinnames.substring(0,pinnames.length()-1);
            //set到 属性
            courseproblem.setQuestiontypeid(pindfdvs);
        }
        userDao.addWenti(courseproblem);
    }

    @Override
    public List<ProblemType> queryWenType() {
        return userDao.queryWenType();
    }

    @Override
    public Courseproblem huixianwen(Integer wenid) {
        Courseproblem courseproblem = userDao.huixianwen(wenid);
        List<ProblemType> typelist =  userDao.queryWenType();
        String pinnames="";
        String sids=courseproblem.getQuestiontypeid();   //当前问题类型id
        String [] st=sids.split(",");
        for(int j=0;j<st.length;j++){//id集合数组1 2 3
            Integer oneid=Integer.parseInt(st[j]);//   1  2   3
            for(int k=0;k<typelist.size();k++){//第二个集合
                Integer erid=typelist.get(k).getQuestionid();
                String efdgsa  = typelist.get(k).getQuestionname();
                if(oneid == erid){
                    pinnames += efdgsa+",";
                }
            }
            String pindfdvs = pinnames.substring(0,pinnames.length()-1);
            //set到 属性
            courseproblem.setQuestiontypeid(pindfdvs);
        }

        return courseproblem;
    }

    @Override
    public void updatewen(Courseproblem courseproblem) {
        List<ProblemType> typelist =  userDao.queryWenType();
        String pinnames="";
        String sids=courseproblem.getQuestiontypeid();       //当前问题类型id
        String [] st=sids.split(" ");
        for(int j=0;j<st.length;j++){//id集合数组1 2 3
            String oneid=st[j];//   1  2   3
            for(int k=0;k<typelist.size();k++){  //第二个集合
                Integer erid=typelist.get(k).getQuestionid();
                String efdgsa  = typelist.get(k).getQuestionname();
                if(efdgsa.equals(oneid)){
                    pinnames += erid+",";
                }
            }
            String pindfdvs = pinnames.substring(0,pinnames.length()-1);
            //set到 属性
            courseproblem.setQuestiontypeid(pindfdvs);
        }
        userDao.updatewen(courseproblem);
    }

    @Override
    public void deletewen(Integer id) {
        userDao.deletewen(id);
    }

    @Override
    public List<Answer> querydaanList() {
        return userDao.querydaanList();
    }

    @Override
    public void addWentype(ProblemType problemType) {
        userDao.addWentype(problemType);
    }

    @Override
    public ProblemType huixianwentype(Integer id) {
        return userDao.huixianwentype(id);
    }

    @Override
    public void updatewentype(ProblemType problemType) {
        userDao.updatewentype(problemType);
    }

    @Override
    public void deletewentype(Integer id) {
        userDao.deletewentype(id);
    }

    @Override
    public void adddaan(Answer answer) {

        userDao.adddaan(answer);

        Zan zan = new Zan();
        zan.setPeopleid(answer.getUserid());
        zan.setResultid(answer.getResultid());
        zan.setZannum(0);
        userDao.addZan(zan);

    }

    @Override
    public void deletedaan(Integer id) {
        userDao.deletedaan(id);
    }

    @Override
    public Answer huixiandaan(Integer id) {
        return userDao.huixiandaan(id);
    }

    @Override
    public void updatedaan(Answer answer) {
        userDao.updatedaan(answer);
    }

    @Override
    public List<Courseproblem> querypagewen() {
        return userDao.querypagewen();
    }

    @Override
    public void updatenum(Integer questionid) {

        Integer num =userDao.querywenbyid(questionid);

        userDao.updatenum(questionid,num);
    }

    @Override
    public Courseproblem tohuifu(Integer questionid) {
        Courseproblem courseproblem = userDao.tohuifu(questionid);
        List<ProblemType> typelist =  userDao.queryWenType();
        String pinnames="";
        String sids=courseproblem.getQuestiontypeid();   //当前问题类型id
        String [] st=sids.split(",");
        for(int j=0;j<st.length;j++){//id集合数组1 2 3
            Integer oneid=Integer.parseInt(st[j]);//   1  2   3
            for(int k=0;k<typelist.size();k++){//第二个集合
                Integer erid=typelist.get(k).getQuestionid();
                String efdgsa  = typelist.get(k).getQuestionname();
                if(oneid == erid){
                    pinnames += efdgsa+",";
                }
            }
            String pindfdvs = pinnames.substring(0,pinnames.length()-1);
            //set到 属性
            courseproblem.setQuestiontypeid(pindfdvs);
        }

        return courseproblem;
    }

    @Override
    public List queryhuifu(Integer questionid) {
        return userDao.queryhuifu(questionid);
    }

    @Override
    public List<Courseproblem> querywenshow() {
        List<Courseproblem> list = userDao.querywenshow();
        List<ProblemType> typelist =  userDao.queryWenType();
        for (int i = 0;i < list.size();i++){
            String pinnames="";
            String sids=list.get(i).getQuestiontypeid();   //当前问题类型id
            String [] st=sids.split(",");
            for(int j=0;j<st.length;j++){//id集合数组1 2 3
                Integer oneid=Integer.parseInt(st[j]);//   1  2   3
                for(int k=0;k<typelist.size();k++){//第二个集合
                    Integer erid=typelist.get(k).getQuestionid();
                    String efdgsa  = typelist.get(k).getQuestionname();
                    if(oneid == erid){
                        pinnames += efdgsa+",";
                    }
                }
                String pindfdvs = pinnames.substring(0,pinnames.length()-1);
                //set到 属性
                list.get(i).setQuestiontypeid(pindfdvs);
            }
        }
        return list;
    }

    @Override
    public List<Courseproblem> querywenshow1(Integer typeid) {
        List<Courseproblem> list = userDao.querywenshow1(typeid);
        List<ProblemType> typelist =  userDao.queryWenType();
        for (int i = 0;i < list.size();i++){
            String pinnames="";
            String sids=list.get(i).getQuestiontypeid();   //当前问题类型id
            String [] st=sids.split(",");
            for(int j=0;j<st.length;j++){//id集合数组1 2 3
                Integer oneid=Integer.parseInt(st[j]);//   1  2   3
                for(int k=0;k<typelist.size();k++){//第二个集合
                    Integer erid=typelist.get(k).getQuestionid();
                    String efdgsa  = typelist.get(k).getQuestionname();
                    if(oneid == erid){
                        pinnames += efdgsa+",";
                    }
                }
                String pindfdvs = pinnames.substring(0,pinnames.length()-1);
                //set到 属性
                list.get(i).setQuestiontypeid(pindfdvs);
            }
        }
        return list;

    }

    @Override
    public String updatezan(Integer resultid, Integer peopleid) {
        String flag="";
        List<Zan> zans = userDao.ifclick(peopleid,resultid);
        //用户名是否真的点赞
        if(zans != null && zans.size() >0){
            if(zans.get(0).getZannum()==1){
                userDao.updatezan1(peopleid,resultid);
                flag="3";
            }
            //<!--用户再次点击判断点赞数-->
            if(zans.get(0).getZannum()==0){
                userDao.updatezan3(peopleid,resultid);
                flag="4";
            }
            /*userDao.updatezan1(peopleid);
            flag = "1";*/
        }else{
            Zan zan = new Zan();
            zan.setPeopleid(peopleid);
            zan.setResultid(resultid);
            zan.setZannum(1);
            userDao.updatezan2(zan);
            flag="2";
        }
        return flag;
    }


    @Override
    public List<Courseproblem> querybywenid(Integer questionid) {
        List<Courseproblem> list = userDao.querybywenid(questionid);
        List<ProblemType> typelist =  userDao.queryWenType();
        for (int i = 0;i < list.size();i++){
            String pinnames="";
            String sids=list.get(i).getQuestiontypeid();   //当前问题类型id
            String [] st=sids.split(",");
            for(int j=0;j<st.length;j++){//id集合数组1 2 3
                Integer oneid=Integer.parseInt(st[j]);//   1  2   3
                for(int k=0;k<typelist.size();k++){//第二个集合
                    Integer erid=typelist.get(k).getQuestionid();
                    String efdgsa  = typelist.get(k).getQuestionname();
                    if(oneid == erid){
                        pinnames += efdgsa+",";
                    }
                }
                String pindfdvs = pinnames.substring(0,pinnames.length()-1);
                //set到 属性
                list.get(i).setQuestiontypeid(pindfdvs);
            }
        }
        return list;
    }

    @Override
    public List<Courseproblem> querynew() {
        List<Courseproblem> list = userDao.querynew();
        List<ProblemType> typelist =  userDao.queryWenType();
        for (int i = 0;i < list.size();i++){
            String pinnames="";
            String sids=list.get(i).getQuestiontypeid();   //当前问题类型id
            String [] st=sids.split(",");
            for(int j=0;j<st.length;j++){//id集合数组1 2 3
                Integer oneid=Integer.parseInt(st[j]);//   1  2   3
                for(int k=0;k<typelist.size();k++){//第二个集合
                    Integer erid=typelist.get(k).getQuestionid();
                    String efdgsa  = typelist.get(k).getQuestionname();
                    if(oneid == erid){
                        pinnames += efdgsa+",";
                    }
                }
                String pindfdvs = pinnames.substring(0,pinnames.length()-1);
                //set到 属性
                list.get(i).setQuestiontypeid(pindfdvs);
            }
        }
        return list;
    }

    @Override
    public List<Courseproblem> queryhot() {
        List<Courseproblem> list = userDao.queryhot();
        List<ProblemType> typelist =  userDao.queryWenType();
        for (int i = 0;i < list.size();i++){
            String pinnames="";
            String sids=list.get(i).getQuestiontypeid();   //当前问题类型id
            String [] st=sids.split(",");
            for(int j=0;j<st.length;j++){//id集合数组1 2 3
                Integer oneid=Integer.parseInt(st[j]);//   1  2   3
                for(int k=0;k<typelist.size();k++){//第二个集合
                    Integer erid=typelist.get(k).getQuestionid();
                    String efdgsa  = typelist.get(k).getQuestionname();
                    if(oneid == erid){
                        pinnames += efdgsa+",";
                    }
                }
                String pindfdvs = pinnames.substring(0,pinnames.length()-1);
                //set到 属性
                list.get(i).setQuestiontypeid(pindfdvs);
            }
        }
        return list;
    }

    @Override
    public List<Courseproblem> querytiwen(Integer peopleid) {
        List<Courseproblem> list = userDao.querytiwen(peopleid);
        List<ProblemType> typelist =  userDao.queryWenType();
        for (int i = 0;i < list.size();i++){
            String pinnames="";
            String sids=list.get(i).getQuestiontypeid();   //当前问题类型id
            String [] st=sids.split(",");
            for(int j=0;j<st.length;j++){//id集合数组1 2 3
                Integer oneid=Integer.parseInt(st[j]);//   1  2   3
                for(int k=0;k<typelist.size();k++){//第二个集合
                    Integer erid=typelist.get(k).getQuestionid();
                    String efdgsa  = typelist.get(k).getQuestionname();
                    if(oneid == erid){
                        pinnames += efdgsa+",";
                    }
                }
                String pindfdvs = pinnames.substring(0,pinnames.length()-1);
                //set到 属性
                list.get(i).setQuestiontypeid(pindfdvs);
            }
        }
        return list;
    }

    @Override
    public List<Courseproblem> querymyhuida(Integer peopleid) {
        List<Courseproblem> list = userDao.querymyhuida(peopleid);
        List<ProblemType> typelist =  userDao.queryWenType();
        for (int i = 0;i < list.size();i++){
            String pinnames="";
            String sids=list.get(i).getQuestiontypeid();   //当前问题类型id
            String [] st=sids.split(",");
            for(int j=0;j<st.length;j++){//id集合数组1 2 3
                Integer oneid=Integer.parseInt(st[j]);//   1  2   3
                for(int k=0;k<typelist.size();k++){//第二个集合
                    Integer erid=typelist.get(k).getQuestionid();
                    String efdgsa  = typelist.get(k).getQuestionname();
                    if(oneid == erid){
                        pinnames += efdgsa+",";
                    }
                }
                String pindfdvs = pinnames.substring(0,pinnames.length()-1);
                //set到 属性
                list.get(i).setQuestiontypeid(pindfdvs);
            }
        }
        return list;
    }


    private List<Quan> recursionTree(String shu, Integer userid) {
        List<Quan> trees = userDao.queryTreeByPid(shu,userid);
        if(trees != null && trees.size()>0){
            for (int i = 0; i < trees.size(); i++) {
                List<Quan> trees2 = recursionTree(trees.get(i).getQuanid(), userid);
                trees.get(i).setNodes(trees2);
            }
        }
        return trees;
    }
}
