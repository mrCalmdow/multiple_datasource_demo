package com.flchen.multiple_datasource_demo.entity.shop.account.entity;

import com.flchen.multiple_datasource_demo.entity.shop.account.entity.vo.UserTongLianProtocolSignVO;
import com.flchen.multiple_datasource_demo.commom.entity.BaseDO;
import com.google.common.collect.Maps;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author feilongchen
 * @since 2018-12-13 10:21 AM
 */
@Document(collection = "userTonglianPayment")
@Data
public class UserTongLianPaymentDO extends BaseDO {

    /*"银行卡类型：1借记卡，2准贷记卡，3贷记卡，4预付卡"*/
    public enum BankCardType {

        TYPE_DEBIT_CARD("借记卡", 1),
        TYPE_SIMILAR_CREDIT_CARD("准贷记卡", 2),
        TYPE_CREDIT_CARD("贷记卡", 3),
        TYPE_PRE_PAY_CARD("预付卡", 4);

        private static Map<Integer, String> map;

        private String alias;

        private Integer index;

        BankCardType(String alias, Integer index) {
            this.alias = alias;
            this.index = index;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(Integer index) {
            this.index = index;
        }

        public String getAlias() {
            return alias;
        }

        public static synchronized Map<Integer, String> getMap() {
            if (map == null) {
                map = Maps.newLinkedHashMap();
                for (BankCardType value : BankCardType.values()) {
                    map.put(value.getIndex(), value.getAlias());
                }
            }
            return map;
        }

        public static String getAliasByIndex(Integer index) {
            getMap();
            return map.get(index);
        }

        public static Integer getIndexByAlias(String alias) {
            getMap();
            for (Map.Entry entry : map.entrySet()) {
                if (alias.equals(entry.getValue())) {
                    return (Integer) entry.getKey();
                }
            }
            return null;
        }
        public static boolean contain(Integer fdType) {
            return fdType != null && getMap().get(fdType) != null;
        }
    }


    private String userId;

    private String mobile;

    private String userName;

    private String idCard;

    /**
     * 用户签约记录--成功与失败的记录都会保存
     */
    private List<UserTongLianProtocolSignVO> protocolSigns = new ArrayList<>();
}
