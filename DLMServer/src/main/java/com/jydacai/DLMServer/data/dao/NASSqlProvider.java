package com.jydacai.DLMServer.data.dao;

import com.jydacai.DLMServer.data.model.NAS;
import com.jydacai.DLMServer.data.model.NASExample.Criteria;
import com.jydacai.DLMServer.data.model.NASExample.Criterion;
import com.jydacai.DLMServer.data.model.NASExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class NASSqlProvider {

    public String countByExample(NASExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("NAS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(NASExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("NAS");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(NAS record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("NAS");
        
        if (record.getTimeIndex() != null) {
            sql.VALUES("time_index", "#{timeIndex,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMilliMul() != null) {
            sql.VALUES("milli_mul", "#{milliMul,jdbcType=INTEGER}");
        }
        
        if (record.getMilliIndex() != null) {
            sql.VALUES("milli_index", "#{milliIndex,jdbcType=INTEGER}");
        }
        
        if (record.getAvgAmp() != null) {
            sql.VALUES("avg_amp", "#{avgAmp,jdbcType=DOUBLE}");
        }
        
        if (record.getMaxAmp() != null) {
            sql.VALUES("max_amp", "#{maxAmp,jdbcType=DOUBLE}");
        }
        
        if (record.getMinAmp() != null) {
            sql.VALUES("min_amp", "#{minAmp,jdbcType=DOUBLE}");
        }
        
        return sql.toString();
    }

    public String selectByExample(NASExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("time_index");
        } else {
            sql.SELECT("time_index");
        }
        sql.SELECT("milli_mul");
        sql.SELECT("milli_index");
        sql.SELECT("avg_amp");
        sql.SELECT("max_amp");
        sql.SELECT("min_amp");
        sql.FROM("NAS");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        NAS record = (NAS) parameter.get("record");
        NASExample example = (NASExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("NAS");
        
        if (record.getTimeIndex() != null) {
            sql.SET("time_index = #{record.timeIndex,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMilliMul() != null) {
            sql.SET("milli_mul = #{record.milliMul,jdbcType=INTEGER}");
        }
        
        if (record.getMilliIndex() != null) {
            sql.SET("milli_index = #{record.milliIndex,jdbcType=INTEGER}");
        }
        
        if (record.getAvgAmp() != null) {
            sql.SET("avg_amp = #{record.avgAmp,jdbcType=DOUBLE}");
        }
        
        if (record.getMaxAmp() != null) {
            sql.SET("max_amp = #{record.maxAmp,jdbcType=DOUBLE}");
        }
        
        if (record.getMinAmp() != null) {
            sql.SET("min_amp = #{record.minAmp,jdbcType=DOUBLE}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("NAS");
        
        sql.SET("time_index = #{record.timeIndex,jdbcType=TIMESTAMP}");
        sql.SET("milli_mul = #{record.milliMul,jdbcType=INTEGER}");
        sql.SET("milli_index = #{record.milliIndex,jdbcType=INTEGER}");
        sql.SET("avg_amp = #{record.avgAmp,jdbcType=DOUBLE}");
        sql.SET("max_amp = #{record.maxAmp,jdbcType=DOUBLE}");
        sql.SET("min_amp = #{record.minAmp,jdbcType=DOUBLE}");
        
        NASExample example = (NASExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, NASExample example, boolean includeExamplePhrase) {
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