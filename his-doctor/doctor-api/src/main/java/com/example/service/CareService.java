package com.example.service;

import com.example.domain.CareHistory;
import com.example.domain.CareOrder;
import com.example.domain.CareOrderItem;
import com.example.dto.CareHistoryDto;
import com.example.dto.CareOrderFormDto;

import java.util.List;

/**
 * Author jianghao
 */
public interface CareService {
    /**
     * 根据患者ID查询病历列表
     */
    List<CareHistory> queryCareHistoryByPatientId(String patientId);

    /**
     * 保存或更新病例信息
     */
    CareHistory saveOrUpdateCareHistory(CareHistoryDto careHistoryDto);

    /**
     * 根据挂号单位ID查询对应的病历信息
     */
    CareHistory queryCareHistoryByRegId(String regId);

    /**
     * 根据病历信息查询处方信息
     */
    List<CareOrder> queryCareOrdersByChId(String chId);

    /**
     * 根据处方ID查询处方详情信息
     */
    List<CareOrderItem> queryCareOrderItemsByCoId(String coId, String status);

    /**
     * 根据病例ID查询病历信息
     */
    CareHistory queryCareHistoryByChId(String chId);

    /**
     * 保存处方及详情信息
     */
    int saveCareOrderItem(CareOrderFormDto careOrderFormDto);

    /**
     * 根据处方详情ID查询处方详情数据
     */
    CareOrderItem queryCareOrderItemByItemId(String itemId);

    /**
     * 根据详情ID删除详情信息
     */
    int deleteCareOrderItemByItemId(String itemId);

    /**
     * 完成就诊
     */
    int visitComplete(String regId);

    /**
     * 发药
     */
    String doMedicine(List<String> itemIds);

    /**
     * 根据条件查询所有项目
     */
    List<CareOrderItem> queryCareOrderItemsByStatus(String coType, String status);

    /**
     * 根据处方ID查询一个处方信息
     */
    CareOrder queryCareOrdersByCoId(String coId);

}
