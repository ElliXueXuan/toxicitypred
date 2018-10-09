package cn.edu.nwafu.cie.toxicitypred.dao;

import java.util.List;

/**
 * @author: SungLee
 * @date: 2018-10-09 08:27
 * @description: 公共Dao类
 */
public interface BaseDao<T> {

    /**
     * @param: []
     * @return: java.util.List<T>
     * 返回所有记录
     */
    public List<T> getAll();

    /**
     * @param: []
     * @return: T
     * 通过casNo获取相应的记录
     */
    public T getByCasNo(String casNo);

    /**
     * @param: []
     * @return: T
     * 通过Id获取相应的记录
     */
    public T getById(int id);

    /**
     * @param: []
     * @return: int
     * 插入一条记录
     */
    public int insertRecord(T t);

    /**
     * @param: []
     * @return: String
     * 插入一条记录
     */
    public String updateRecourd(T t);

    /**
     * @param: [casNo]
     * @return: String
     * 根据casNo号删除一条记录
     */
    public String deleteRecord(String casNo);
}
