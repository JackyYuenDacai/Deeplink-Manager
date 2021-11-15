package com.jydacai.DLMServer.data.dao;

import com.jydacai.DLMServer.data.model.Access;
import com.jydacai.DLMServer.data.model.AccessExample.Criteria;
import com.jydacai.DLMServer.data.model.AccessExample.Criterion;
import com.jydacai.DLMServer.data.model.AccessExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class AccessSqlProvider {

    public String countByExample(AccessExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("Access");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(AccessExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("Access");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Access record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("Access");
        
        if (record.getDeeplinkid() != null) {
            sql.VALUES("deeplinkId", "#{deeplinkid,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelid() != null) {
            sql.VALUES("channelId", "#{channelid,jdbcType=VARCHAR}");
        }
        
        if (record.getIpaddr() != null) {
            sql.VALUES("ipAddr", "#{ipaddr,jdbcType=VARCHAR}");
        }
        
        if (record.getAccessdate() != null) {
            sql.VALUES("accessDate", "#{accessdate,jdbcType=DATE}");
        }
        
        if (record.getAccesstime() != null) {
            sql.VALUES("accessTime", "#{accesstime,jdbcType=TIME}");
        }
        
        if (record.getAccesstimezone() != null) {
            sql.VALUES("accessTimezone", "#{accesstimezone,jdbcType=INTEGER}");
        }
        
        if (record.getExtrainfo() != null) {
            sql.VALUES("extraInfo", "#{extrainfo,jdbcType=VARCHAR}");
        }
        
        if (record.getDenied() != null) {
            sql.VALUES("denied", "#{denied,jdbcType=BIT}");
        }
        
        if (record.getIp() != null) {
            sql.VALUES("ip", "#{ip,jdbcType=VARBINARY}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(AccessExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("deeplinkId");
        } else {
            sql.SELECT("deeplinkId");
        }
        sql.SELECT("channelId");
        sql.SELECT("ipAddr");
        sql.SELECT("accessDate");
        sql.SELECT("accessTime");
        sql.SELECT("accessTimezone");
        sql.SELECT("extraInfo");
        sql.SELECT("denied");
        sql.SELECT("ip");
        sql.FROM("Access");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(AccessExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("deeplinkId");
        } else {
            sql.SELECT("deeplinkId");
        }
        sql.SELECT("channelId");
        sql.SELECT("ipAddr");
        sql.SELECT("accessDate");
        sql.SELECT("accessTime");
        sql.SELECT("accessTimezone");
        sql.SELECT("extraInfo");
        sql.SELECT("denied");
        sql.FROM("Access");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Access record = (Access) parameter.get("record");
        AccessExample example = (AccessExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("Access");
        
        if (record.getDeeplinkid() != null) {
            sql.SET("deeplinkId = #{record.deeplinkid,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelid() != null) {
            sql.SET("channelId = #{record.channelid,jdbcType=VARCHAR}");
        }
        
        if (record.getIpaddr() != null) {
            sql.SET("ipAddr = #{record.ipaddr,jdbcType=VARCHAR}");
        }
        
        if (record.getAccessdate() != null) {
            sql.SET("accessDate = #{record.accessdate,jdbcType=DATE}");
        }
        
        if (record.getAccesstime() != null) {
            sql.SET("accessTime = #{record.accesstime,jdbcType=TIME}");
        }
        
        if (record.getAccesstimezone() != null) {
            sql.SET("accessTimezone = #{record.accesstimezone,jdbcType=INTEGER}");
        }
        
        if (record.getExtrainfo() != null) {
            sql.SET("extraInfo = #{record.extrainfo,jdbcType=VARCHAR}");
        }
        
        if (record.getDenied() != null) {
            sql.SET("denied = #{record.denied,jdbcType=BIT}");
        }
        
        if (record.getIp() != null) {
            sql.SET("ip = #{record.ip,jdbcType=VARBINARY}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("Access");
        
        sql.SET("deeplinkId = #{record.deeplinkid,jdbcType=VARCHAR}");
        sql.SET("channelId = #{record.channelid,jdbcType=VARCHAR}");
        sql.SET("ipAddr = #{record.ipaddr,jdbcType=VARCHAR}");
        sql.SET("accessDate = #{record.accessdate,jdbcType=DATE}");
        sql.SET("accessTime = #{record.accesstime,jdbcType=TIME}");
        sql.SET("accessTimezone = #{record.accesstimezone,jdbcType=INTEGER}");
        sql.SET("extraInfo = #{record.extrainfo,jdbcType=VARCHAR}");
        sql.SET("denied = #{record.denied,jdbcType=BIT}");
        sql.SET("ip = #{record.ip,jdbcType=VARBINARY}");
        
        AccessExample example = (AccessExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("Access");
        
        sql.SET("deeplinkId = #{record.deeplinkid,jdbcType=VARCHAR}");
        sql.SET("channelId = #{record.channelid,jdbcType=VARCHAR}");
        sql.SET("ipAddr = #{record.ipaddr,jdbcType=VARCHAR}");
        sql.SET("accessDate = #{record.accessdate,jdbcType=DATE}");
        sql.SET("accessTime = #{record.accesstime,jdbcType=TIME}");
        sql.SET("accessTimezone = #{record.accesstimezone,jdbcType=INTEGER}");
        sql.SET("extraInfo = #{record.extrainfo,jdbcType=VARCHAR}");
        sql.SET("denied = #{record.denied,jdbcType=BIT}");
        
        AccessExample example = (AccessExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, AccessExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}