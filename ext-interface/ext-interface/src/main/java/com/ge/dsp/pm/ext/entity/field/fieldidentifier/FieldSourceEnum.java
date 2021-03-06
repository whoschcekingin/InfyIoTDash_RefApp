
package com.ge.dsp.pm.ext.entity.field.fieldidentifier;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fieldSourceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fieldSourceEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PREDIX_ASSET"/>
 *     &lt;enumeration value="PREDIX_TIMESERIES"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fieldSourceEnum")
@XmlEnum
public enum FieldSourceEnum {

    PREDIX_ASSET,
    PREDIX_TIMESERIES,
    OTHER;

    public String value() {
        return name();
    }

    public static FieldSourceEnum fromValue(String v) {
        return valueOf(v);
    }

}
