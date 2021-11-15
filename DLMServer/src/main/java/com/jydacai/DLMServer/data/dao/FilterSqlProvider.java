package com.jydacai.DLMServer.data.dao;

import com.jydacai.DLMServer.data.model.Filter;
import com.jydacai.DLMServer.data.model.FilterExample.Criteria;
import com.jydacai.DLMServer.data.model.FilterExample.Criterion;
import com.jydacai.DLMServer.data.model.FilterExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FilterSqlProvider {

    public String countByExample(FilterExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("Filter");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(FilterExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("Filter");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Filter record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("Filter");
        
        if (record.getDeeplinkid() != null) {
            sql.VALUES("deeplinkId", "#{deeplinkid,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelid() != null) {
            sql.VALUES("channelId", "#{channelid,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getFilterfield() != null) {
            sql.VALUES("filterField", "#{filterfield,jdbcType=VARCHAR}");
        }
        
        if (record.getFiltertype() != null) {
            sql.VALUES("filterType", "#{filtertype,jdbcType=INTEGER}");
        }
        
        if (record.getFilterinverse() != null) {
            sql.VALUES("filterInverse", "#{filterinverse,jdbcType=BIT}");
        }
        
        if (record.getFiltermusthave() != null) {
            sql.VALUES("filterMustHave", "#{filtermusthave,jdbcType=BIT}");
        }
        
        if (record.getValuetype() != null) {
            sql.VALUES("valueType", "#{valuetype,jdbcType=INTEGER}");
        }
        
        if (record.getValue() != null) {
            sql.VALUES("value", "#{value,jdbcType=VARCHAR}");
        }
        
        if (record.getExtvalue() != null) {
            sql.VALUES("extValue", "#{extvalue,jdbcType=VARCHAR}");
        }
        
        if (record.getDvalue() != null) {
            sql.VALUES("dvalue", "#{dvalue,jdbcType=DOUBLE}");
        }
        
        if (record.getExtdvalue() != null) {
            sql.VALUES("extDValue", "#{extdvalue,jdbcType=DOUBLE}");
        }
        
        if (record.getIvalue() != null) {
            sql.VALUES("ivalue", "#{ivalue,jdbcType=INTEGER}");
        }
        
        if (record.getExtivalue() != null) {
            sql.VALUES("extIValue", "#{extivalue,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(FilterExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("deeplinkId");
        } else {
            sql.SELECT("deeplinkId");
        }
        sql.SELECT("channelId");
        sql.SELECT("name");
        sql.SELECT("filterField");
        sql.SELECT("filterType");
        sql.SELECT("filterInverse");
        sql.SELECT("filterMustHave");
        sql.SELECT("valueType");
        sql.SELECT("value");
        sql.SELECT("extValue");
        sql.SELECT("dvalue");
        sql.SELECT("extDValue");
        sql.SELECT("ivalue");
        sql.SELECT("extIValue");
        sql.FROM("Filter");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Filter record = (Filter) parameter.get("record");
        FilterExample example = (FilterExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("Filter");
        
        if (record.getDeeplinkid() != null) {
            sql.SET("deeplinkId = #{record.deeplinkid,jdbcType=VARCHAR}");
        }
        
        if (record.getChannelid() != null) {
            sql.SET("channelId = #{record.channelid,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getFilterfield() != null) {
            sql.SET("filterField = #{record.filterfield,jdbcType=VARCHAR}");
        }
        
        if (record.getFiltertype() != null) {
            sql.SET("filterType = #{record.filtertype,jdbcType=INTEGER}");
        }
        
        if (record.getFilterinverse() != null) {
            sql.SET("filterInverse = #{record.filterinverse,jdbcType=BIT}");
        }
        
        if (record.getFiltermusthave() != null) {
            sql.SET("filterMustHave = #{record.filtermusthave,jdbcType=BIT}");
        }
        
        if (record.getValuetype() != null) {
            sql.SET("valueType = #{record.valuetype,jdbcType=INTEGER}");
        }
        
        if (record.getValue() != null) {
            sql.SET("value = #{record.value,jdbcType=VARCHAR}");
        }
        
        if (record.getExtvalue() != null) {
            sql.SET("extValue = #{record.extvalue,jdbcType=VARCHAR}");
        }
        
        if (record.getDvalue() != null) {
            sql.SET("dvalue = #{record.dvalue,jdbcType=DOUBLE}");
        }
        
        if (record.getExtdvalue() != null) {
            sql.SET("extDValue = #{record.extdvalue,jdbcType=DOUBLE}");
        }
        
        if (record.getIvalue() != null) {
            sql.SET("ivalue = #{record.ivalue,jdbcType=INTEGER}");
        }
        
        if (record.getExtivalue() != null) {
            sql.SET("extIValue = #{record.extivalue,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("Filter");
        
        sql.SET("deeplinkId = #{record.deeplinkid,jdbcType=VARCHAR}");
        sql.SET("channelId = #{record.channelid,jdbcType=VARCHAR}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("filterField = #{record.filterfield,jdbcType=VARCHAR}");
        sql.SET("filterType = #{record.filtertype,jdbcType=INTEGER}");
        sql.SET("filterInverse = #{record.filterinverse,jdbcType=BIT}");
        sql.SET("filterMustHave = #{record.filtermusthave,jdbcType=BIT}");
        sql.SET("valueType = #{record.valuetype,jdbcType=INTEGER}");
        sql.SET("value = #{record.value,jdbcType=VARCHAR}");
        sql.SET("extValue = #{record.extvalue,jdbcType=VARCHAR}");
        sql.SET("dvalue = #{record.dvalue,jdbcType=DOUBLE}");
        sql.SET("extDValue = #{record.extdvalue,jdbcType=DOUBLE}");
        sql.SET("ivalue = #{record.ivalue,jdbcType=INTEGER}");
        sql.SET("extIValue = #{record.extivalue,jdbcType=INTEGER}");
        
        FilterExample example = (FilterExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, FilterExample example, boolean includeExamplePhrase) {
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