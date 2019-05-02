/* FileName: ColumnGeneratorService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.service;

import cn.eppdev.jee.cg.entity.ColumnTypeInfo;
import cn.eppdev.jee.cg.utils.GeneratorUtils;
import cn.eppdev.jee.conf.entity.EppdevColumn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinlong.hao
 */
@Service
public class ColumnGeneratorService {
    static Logger logger = LoggerFactory.getLogger(ColumnGeneratorService.class);

    public List<EppdevColumn> generateDefaultColumn(){
        List<EppdevColumn> list = new ArrayList<>();

        // ID
        EppdevColumn columnId = new EppdevColumn();
        columnId.setColumnName("id");
        columnId.setColumnType("char");
        columnId.setColumnLength(32);
        columnId.setSortIndex(1);
        columnId.setPrimaryKeyFlag(1);
        columnId.setLogicKeyFlag(0);
        columnId.setColumnComment("UUID，唯一标识");
        columnId.setPropertyName("id");
        columnId.setJavaType("String");
        columnId.setOriginColumnId(null);
        columnId.setCreateEqualFlag(1);
        columnId.setCreateLikeFlag(0);
        columnId.setCreateLeftLikeFlag(0);
        columnId.setCreateInFlag(1);
        columnId.setCreateCompareFlag(0);
        columnId.setRemarks(null);
        columnId.setCreateBy("eppdev");
        columnId.setUpdateBy("eppdev");
        columnId.setDelFlag(0);
        list.add(columnId);


        // createDate
        EppdevColumn columnCreateDate = new EppdevColumn();
        columnCreateDate.setColumnName("create_date");
        columnCreateDate.setColumnType("datetime");
        columnCreateDate.setColumnLength(null);
        columnCreateDate.setSortIndex(10001);
        columnCreateDate.setPrimaryKeyFlag(0);
        columnCreateDate.setLogicKeyFlag(0);
        columnCreateDate.setColumnComment("数据创建时间（技术字段）");
        columnCreateDate.setPropertyName("createDate");
        columnCreateDate.setJavaType("java.utils.Date");
        columnCreateDate.setOriginColumnId(null);
        columnCreateDate.setCreateEqualFlag(0);
        columnCreateDate.setCreateLikeFlag(0);
        columnCreateDate.setCreateLeftLikeFlag(0);
        columnCreateDate.setCreateInFlag(0);
        columnCreateDate.setCreateCompareFlag(0);
        columnCreateDate.setRemarks(null);
        columnCreateDate.setCreateBy("eppdev");
        columnCreateDate.setUpdateBy("eppdev");
        columnCreateDate.setDelFlag(0);
        list.add(columnCreateDate);



        // updateDate
        EppdevColumn columnUpdateDate = new EppdevColumn();
        columnUpdateDate.setColumnName("update_date");
        columnUpdateDate.setColumnType("datetime");
        columnUpdateDate.setColumnLength(null);
        columnUpdateDate.setSortIndex(10002);
        columnUpdateDate.setPrimaryKeyFlag(0);
        columnUpdateDate.setLogicKeyFlag(0);
        columnUpdateDate.setColumnComment("数据最后修改时间（技术字段）");
        columnUpdateDate.setPropertyName("updateDate");
        columnUpdateDate.setJavaType("java.utils.Date");
        columnUpdateDate.setOriginColumnId(null);
        columnUpdateDate.setCreateEqualFlag(0);
        columnUpdateDate.setCreateLikeFlag(0);
        columnUpdateDate.setCreateLeftLikeFlag(0);
        columnUpdateDate.setCreateInFlag(0);
        columnUpdateDate.setCreateCompareFlag(0);
        columnUpdateDate.setRemarks(null);
        columnUpdateDate.setCreateBy("eppdev");
        columnUpdateDate.setUpdateBy("eppdev");
        columnUpdateDate.setDelFlag(0);
        list.add(columnUpdateDate);


        // createBy
        EppdevColumn columnCreateBy = new EppdevColumn();
        columnCreateBy.setColumnName("create_by");
        columnCreateBy.setColumnType("char");
        columnCreateBy.setColumnLength(32);
        columnCreateBy.setSortIndex(10003);
        columnCreateBy.setPrimaryKeyFlag(0);
        columnCreateBy.setLogicKeyFlag(0);
        columnCreateBy.setColumnComment("数据创建人ID（技术字段）");
        columnCreateBy.setPropertyName("createBy");
        columnCreateBy.setJavaType("String");
        columnCreateBy.setOriginColumnId(null);
        columnCreateBy.setCreateEqualFlag(1);
        columnCreateBy.setCreateLikeFlag(0);
        columnCreateBy.setCreateLeftLikeFlag(0);
        columnCreateBy.setCreateInFlag(0);
        columnCreateBy.setCreateCompareFlag(0);
        columnCreateBy.setRemarks(null);
        columnCreateBy.setCreateBy("eppdev");
        columnCreateBy.setUpdateBy("eppdev");
        columnCreateBy.setDelFlag(0);
        list.add(columnCreateBy);


        // updateBy
        EppdevColumn columnUpdateBy = new EppdevColumn();
        columnUpdateBy.setColumnName("update_by");
        columnUpdateBy.setColumnType("char");
        columnUpdateBy.setColumnLength(32);
        columnUpdateBy.setSortIndex(10004);
        columnUpdateBy.setPrimaryKeyFlag(0);
        columnUpdateBy.setLogicKeyFlag(0);
        columnUpdateBy.setColumnComment("数据最后修改人ID（技术字段）");
        columnUpdateBy.setPropertyName("updateBy");
        columnUpdateBy.setJavaType("String");
        columnUpdateBy.setOriginColumnId(null);
        columnUpdateBy.setCreateEqualFlag(1);
        columnUpdateBy.setCreateLikeFlag(0);
        columnUpdateBy.setCreateLeftLikeFlag(0);
        columnUpdateBy.setCreateInFlag(0);
        columnUpdateBy.setCreateCompareFlag(0);
        columnUpdateBy.setRemarks(null);
        columnUpdateBy.setCreateBy("eppdev");
        columnUpdateBy.setUpdateBy("eppdev");
        columnUpdateBy.setDelFlag(0);
        list.add(columnUpdateBy);


        // remarks
        EppdevColumn columnRemarks = new EppdevColumn();
        columnRemarks.setColumnName("remarks");
        columnRemarks.setColumnType("varchar");
        columnRemarks.setColumnLength(1024);
        columnRemarks.setSortIndex(10005);
        columnRemarks.setPrimaryKeyFlag(0);
        columnRemarks.setLogicKeyFlag(0);
        columnRemarks.setColumnComment("备注（技术字段）");
        columnRemarks.setPropertyName("remarks");
        columnRemarks.setJavaType("String");
        columnRemarks.setOriginColumnId(null);
        columnRemarks.setCreateEqualFlag(0);
        columnRemarks.setCreateLikeFlag(0);
        columnRemarks.setCreateLeftLikeFlag(0);
        columnRemarks.setCreateInFlag(0);
        columnRemarks.setCreateCompareFlag(0);
        columnRemarks.setRemarks(null);
        columnRemarks.setCreateBy("eppdev");
        columnRemarks.setUpdateBy("eppdev");
        columnRemarks.setDelFlag(0);
        list.add(columnRemarks);

        // delFlag
        EppdevColumn columnDelFlag = new EppdevColumn();
        columnDelFlag.setColumnName("del_flag");
        columnDelFlag.setColumnType("int");
        columnDelFlag.setColumnLength(null);
        columnDelFlag.setSortIndex(10006);
        columnDelFlag.setPrimaryKeyFlag(0);
        columnDelFlag.setLogicKeyFlag(0);
        columnDelFlag.setColumnComment("删除标识（技术字段）");
        columnDelFlag.setPropertyName("delFlag");
        columnDelFlag.setJavaType("Integer");
        columnDelFlag.setOriginColumnId(null);
        columnDelFlag.setCreateEqualFlag(1);
        columnDelFlag.setCreateLikeFlag(0);
        columnDelFlag.setCreateLeftLikeFlag(0);
        columnDelFlag.setCreateInFlag(0);
        columnDelFlag.setCreateCompareFlag(0);
        columnDelFlag.setRemarks(null);
        columnDelFlag.setCreateBy("eppdev");
        columnDelFlag.setUpdateBy("eppdev");
        columnDelFlag.setDelFlag(0);
        list.add(columnDelFlag);

        return list;
    }

    public List<ColumnTypeInfo> listAllColumnType(String dbType){
        return GeneratorUtils.listAllColumnType(dbType);
    }
}
