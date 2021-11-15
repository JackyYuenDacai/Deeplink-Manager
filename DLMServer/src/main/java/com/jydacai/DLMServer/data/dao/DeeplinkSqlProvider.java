package com.jydacai.DLMServer.data.dao;

import com.jydacai.DLMServer.data.model.Deeplink;
import com.jydacai.DLMServer.data.model.DeeplinkExample.Criteria;
import com.jydacai.DLMServer.data.model.DeeplinkExample.Criterion;
import com.jydacai.DLMServer.data.model.DeeplinkExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class DeeplinkSqlProvider {

    public String countByExample(DeeplinkExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("Deeplink");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(DeeplinkExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("Deeplink");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Deeplink record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("Deeplink");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=VARCHAR}");
        }
        
        if (record.getCode() != null) {
            sql.VALUES("code", "#{code,jdbcType=VARCHAR}");
        }
        
        if (record.getTarget() != null) {
            sql.VALUES("target", "#{target,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelid() != null) {
            sql.VALUES("channelId", "#{channelid,jdbcType=VARCHAR}");
        }
        
        if (record.getEmbbedinfo() != null) {
            sql.VALUES("embbedInfo", "#{embbedinfo,jdbcType=VARCHAR}");
        }
        
        if (record.getDeniedtarget() != null) {
            sql.VALUES("deniedTarget", "#{deniedtarget,jdbcType=VARCHAR}");
        }
        
        if (record.getFiltertype() != null) {
            sql.VALUES("filterType", "#{filtertype,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(DeeplinkExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("code");
        sql.SELECT("target");
        sql.SELECT("channelId");
        sql.SELECT("embbedInfo");
        sql.SELECT("deniedTarget");
        sql.SELECT("filterType");
        sql.FROM("Deeplink");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Deeplink record = (Deeplink) parameter.get("record");
        DeeplinkExample example = (DeeplinkExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("Deeplink");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        }
        
        if (record.getCode() != null) {
            sql.SET("code = #{record.code,jdbcType=VARCHAR}");
        }
        
        if (record.getTarget() != null) {
            sql.SET("target = #{record.target,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelid() != null) {
            sql.SET("channelId = #{record.channelid,jdbcType=VARCHAR}");
        }
        
        if (record.getEmbbedinfo() != null) {
            sql.SET("embbedInfo = #{record.embbedinfo,jdbcType=VARCHAR}");
        }
        
        if (record.getDeniedtarget() != null) {
            sql.SET("deniedTarget = #{record.deniedtarget,jdbcType=VARCHAR}");
        }
        
        if (record.getFiltertype() != null) {
            sql.SET("filterType = #{record.filtertype,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("Deeplink");
        
        sql.SET("id = #{record.id,jdbcType=VARCHAR}");
        sql.SET("code = #{record.code,jdbcType=VARCHAR}");
        sql.SET("target = #{record.target,jdbcType=VARCHAR}");
        sql.SET("channelId = #{record.channelid,jdbcType=VARCHAR}");
        sql.SET("embbedInfo = #{record.embbedinfo,jdbcType=VARCHAR}");
        sql.SET("deniedTarget = #{record.deniedtarget,jdbcType=VARCHAR}");
        sql.SET("filterType = #{record.filtertype,jdbcType=INTEGER}");
        
        DeeplinkExample example = (DeeplinkExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Deeplink record) {
        SQL sql = new SQL();
        sql.UPDATE("Deeplink");
        
        if (record.getCode() != null) {
            sql.SET("code = #{code,jdbcType=VARCHAR}");
        }
        
        if (record.getTarget() != null) {
            sql.SET("target = #{target,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelid() != null) {
            sql.SET("channelId = #{channelid,jdbcType=VARCHAR}");
        }
        
        if (record.getEmbbedinfo() != null) {
            sql.SET("embbedInfo = #{embbedinfo,jdbcType=VARCHAR}");
        }
        
        if (record.getDeniedtarget() != null) {
            sql.SET("deniedTarget = #{deniedtarget,jdbcType=VARCHAR}");
        }
        
        if (record.getFiltertype() != null) {
            sql.SET("filterType = #{filtertype,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, DeeplinkExample example, boolean includeExamplePhrase) {
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