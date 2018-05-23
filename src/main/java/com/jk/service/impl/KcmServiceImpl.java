package com.jk.service.impl;


import com.jk.dao.KcmDao;
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
    private KcmDao kcmDao;

    @Override
    public List listuser() {
        return kcmDao.listuser();

    }

    @Override
    public Map<String, Object> loginUser(User user) {
        Map<String, Object> map = new HashMap<>();
        String flag = "0"; //0 : 用户名不存在   1： 密码错误  2： 登录成功
        List<User> user2 = kcmDao.loginUser(user.getUsername());
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

        List<Courseproblem> list = kcmDao.queryWenList();

        List<ProblemType> typelist =  kcmDao.queryWenType();
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
        List<ProblemType> typelist =  kcmDao.queryWenType();
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
        kcmDao.addWenti(courseproblem);
    }

    @Override
    public List<ProblemType> queryWenType() {
        return kcmDao.queryWenType();
    }

    @Override
    public Courseproblem huixianwen(Integer wenid) {
        Courseproblem courseproblem = kcmDao.huixianwen(wenid);
        List<ProblemType> typelist =  kcmDao.queryWenType();
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
        List<ProblemType> typelist =  kcmDao.queryWenType();
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
        kcmDao.updatewen(courseproblem);
    }

    @Override
    public void deletewen(Integer id) {
        kcmDao.deletewen(id);
    }

    @Override
    public List<Answer> querydaanList() {
        return kcmDao.querydaanList();
    }

    @Override
    public void addWentype(ProblemType problemType) {
        kcmDao.addWentype(problemType);
    }

    @Override
    public ProblemType huixianwentype(Integer id) {
        return kcmDao.huixianwentype(id);
    }

    @Override
    public void updatewentype(ProblemType problemType) {
        kcmDao.updatewentype(problemType);
    }

    @Override
    public void deletewentype(Integer id) {
        kcmDao.deletewentype(id);
    }

    @Override
    public void adddaan(Answer answer) {
        kcmDao.adddaan(answer);
    }

    @Override
    public void deletedaan(Integer id) {
        kcmDao.deletedaan(id);
    }

    @Override
    public Answer huixiandaan(Integer id) {
        return kcmDao.huixiandaan(id);
    }

    @Override
    public void updatedaan(Answer answer) {
        kcmDao.updatedaan(answer);
    }

    @Override
    public List<Courseproblem> querypagewen() {
        return kcmDao.querypagewen();
    }

    @Override
    public void updatenum(Integer questionid) {

        Integer num =kcmDao.querywenbyid(questionid);

        kcmDao.updatenum(questionid,num);
    }

    @Override
    public Courseproblem tohuifu(Integer questionid) {

        return kcmDao.tohuifu(questionid);
    }


    private List<Quan> recursionTree(String shu, Integer userid) {
        List<Quan> trees = kcmDao.queryTreeByPid(shu,userid);
        if(trees != null && trees.size()>0){
            for (int i = 0; i < trees.size(); i++) {
                List<Quan> trees2 = recursionTree(trees.get(i).getQuanid(), userid);
                trees.get(i).setNodes(trees2);
            }
        }

        return trees;
    }
}
