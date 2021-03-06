package fi.csc.smear.db.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.smear.db.model.Sii2meta;
import fi.csc.smear.db.model.Sii2metaModel;
import fi.csc.smear.db.model.Sii2metaSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Sii2meta service. Represents a row in the &quot;SII2_META&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link fi.csc.smear.db.model.Sii2metaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Sii2metaImpl}.
 * </p>
 *
 * @author pj
 * @see Sii2metaImpl
 * @see fi.csc.smear.db.model.Sii2meta
 * @see fi.csc.smear.db.model.Sii2metaModel
 * @generated
 */
@JSON(strict = true)
public class Sii2metaModelImpl extends BaseModelImpl<Sii2meta>
    implements Sii2metaModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a sii2meta model instance should use the {@link fi.csc.smear.db.model.Sii2meta} interface instead.
     */
    public static final String TABLE_NAME = "SII2_META";
    public static final Object[][] TABLE_COLUMNS = {
            { "samptime", Types.TIMESTAMP },
            { "T_a", Types.FLOAT },
            { "T_a_EMEP", Types.INTEGER },
            { "RH", Types.FLOAT },
            { "RH_EMEP", Types.INTEGER },
            { "Net", Types.FLOAT },
            { "Net_EMEP", Types.INTEGER },
            { "T_p_5", Types.FLOAT },
            { "T_p_5_EMEP", Types.INTEGER },
            { "T_p_B20", Types.FLOAT },
            { "T_p_B20_EMEP", Types.INTEGER },
            { "T_p_B35", Types.FLOAT },
            { "T_p_B35_EMEP", Types.INTEGER },
            { "T_p_B50", Types.FLOAT },
            { "T_p_B50_EMEP", Types.INTEGER },
            { "WTD", Types.FLOAT },
            { "WTD_EMEP", Types.INTEGER },
            { "Precip", Types.FLOAT },
            { "Precip_EMEP", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table SII2_META (samptime DATE not null primary key,T_a DOUBLE,T_a_EMEP INTEGER,RH DOUBLE,RH_EMEP INTEGER,Net DOUBLE,Net_EMEP INTEGER,T_p_5 DOUBLE,T_p_5_EMEP INTEGER,T_p_B20 DOUBLE,T_p_B20_EMEP INTEGER,T_p_B35 DOUBLE,T_p_B35_EMEP INTEGER,T_p_B50 DOUBLE,T_p_B50_EMEP INTEGER,WTD DOUBLE,WTD_EMEP INTEGER,Precip DOUBLE,Precip_EMEP INTEGER)";
    public static final String TABLE_SQL_DROP = "drop table SII2_META";
    public static final String ORDER_BY_JPQL = " ORDER BY sii2meta.samptime ASC";
    public static final String ORDER_BY_SQL = " ORDER BY SII2_META.samptime ASC";
    public static final String DATA_SOURCE = "smear";
    public static final String SESSION_FACTORY = "smearSessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.fi.csc.smear.db.model.Sii2meta"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.fi.csc.smear.db.model.Sii2meta"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.fi.csc.smear.db.model.Sii2meta"));
    private static ClassLoader _classLoader = Sii2meta.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Sii2meta.class
        };
    private Date _samptime;
    private float _T_a;
    private int _T_a_EMEP;
    private float _RH;
    private int _RH_EMEP;
    private float _Net;
    private int _Net_EMEP;
    private float _T_p_5;
    private int _T_p_5_EMEP;
    private float _T_p_B20;
    private int _T_p_B20_EMEP;
    private float _T_p_B35;
    private int _T_p_B35_EMEP;
    private float _T_p_B50;
    private int _T_p_B50_EMEP;
    private float _WTD;
    private int _WTD_EMEP;
    private float _Precip;
    private int _Precip_EMEP;
    private Sii2meta _escapedModel;

    public Sii2metaModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Sii2meta toModel(Sii2metaSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Sii2meta model = new Sii2metaImpl();

        model.setSamptime(soapModel.getSamptime());
        model.setT_a(soapModel.getT_a());
        model.setT_a_EMEP(soapModel.getT_a_EMEP());
        model.setRH(soapModel.getRH());
        model.setRH_EMEP(soapModel.getRH_EMEP());
        model.setNet(soapModel.getNet());
        model.setNet_EMEP(soapModel.getNet_EMEP());
        model.setT_p_5(soapModel.getT_p_5());
        model.setT_p_5_EMEP(soapModel.getT_p_5_EMEP());
        model.setT_p_B20(soapModel.getT_p_B20());
        model.setT_p_B20_EMEP(soapModel.getT_p_B20_EMEP());
        model.setT_p_B35(soapModel.getT_p_B35());
        model.setT_p_B35_EMEP(soapModel.getT_p_B35_EMEP());
        model.setT_p_B50(soapModel.getT_p_B50());
        model.setT_p_B50_EMEP(soapModel.getT_p_B50_EMEP());
        model.setWTD(soapModel.getWTD());
        model.setWTD_EMEP(soapModel.getWTD_EMEP());
        model.setPrecip(soapModel.getPrecip());
        model.setPrecip_EMEP(soapModel.getPrecip_EMEP());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Sii2meta> toModels(Sii2metaSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Sii2meta> models = new ArrayList<Sii2meta>(soapModels.length);

        for (Sii2metaSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public java.util.Date getPrimaryKey() {
        return _samptime;
    }

    @Override
    public void setPrimaryKey(java.util.Date primaryKey) {
        setSamptime(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _samptime;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((java.util.Date) primaryKeyObj);
    }

    @Override
    public Class<?> getModelClass() {
        return Sii2meta.class;
    }

    @Override
    public String getModelClassName() {
        return Sii2meta.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("samptime", getSamptime());
        attributes.put("T_a", getT_a());
        attributes.put("T_a_EMEP", getT_a_EMEP());
        attributes.put("RH", getRH());
        attributes.put("RH_EMEP", getRH_EMEP());
        attributes.put("Net", getNet());
        attributes.put("Net_EMEP", getNet_EMEP());
        attributes.put("T_p_5", getT_p_5());
        attributes.put("T_p_5_EMEP", getT_p_5_EMEP());
        attributes.put("T_p_B20", getT_p_B20());
        attributes.put("T_p_B20_EMEP", getT_p_B20_EMEP());
        attributes.put("T_p_B35", getT_p_B35());
        attributes.put("T_p_B35_EMEP", getT_p_B35_EMEP());
        attributes.put("T_p_B50", getT_p_B50());
        attributes.put("T_p_B50_EMEP", getT_p_B50_EMEP());
        attributes.put("WTD", getWTD());
        attributes.put("WTD_EMEP", getWTD_EMEP());
        attributes.put("Precip", getPrecip());
        attributes.put("Precip_EMEP", getPrecip_EMEP());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Date samptime = (Date) attributes.get("samptime");

        if (samptime != null) {
            setSamptime(samptime);
        }

        Float T_a = (Float) attributes.get("T_a");

        if (T_a != null) {
            setT_a(T_a);
        }

        Integer T_a_EMEP = (Integer) attributes.get("T_a_EMEP");

        if (T_a_EMEP != null) {
            setT_a_EMEP(T_a_EMEP);
        }

        Float RH = (Float) attributes.get("RH");

        if (RH != null) {
            setRH(RH);
        }

        Integer RH_EMEP = (Integer) attributes.get("RH_EMEP");

        if (RH_EMEP != null) {
            setRH_EMEP(RH_EMEP);
        }

        Float Net = (Float) attributes.get("Net");

        if (Net != null) {
            setNet(Net);
        }

        Integer Net_EMEP = (Integer) attributes.get("Net_EMEP");

        if (Net_EMEP != null) {
            setNet_EMEP(Net_EMEP);
        }

        Float T_p_5 = (Float) attributes.get("T_p_5");

        if (T_p_5 != null) {
            setT_p_5(T_p_5);
        }

        Integer T_p_5_EMEP = (Integer) attributes.get("T_p_5_EMEP");

        if (T_p_5_EMEP != null) {
            setT_p_5_EMEP(T_p_5_EMEP);
        }

        Float T_p_B20 = (Float) attributes.get("T_p_B20");

        if (T_p_B20 != null) {
            setT_p_B20(T_p_B20);
        }

        Integer T_p_B20_EMEP = (Integer) attributes.get("T_p_B20_EMEP");

        if (T_p_B20_EMEP != null) {
            setT_p_B20_EMEP(T_p_B20_EMEP);
        }

        Float T_p_B35 = (Float) attributes.get("T_p_B35");

        if (T_p_B35 != null) {
            setT_p_B35(T_p_B35);
        }

        Integer T_p_B35_EMEP = (Integer) attributes.get("T_p_B35_EMEP");

        if (T_p_B35_EMEP != null) {
            setT_p_B35_EMEP(T_p_B35_EMEP);
        }

        Float T_p_B50 = (Float) attributes.get("T_p_B50");

        if (T_p_B50 != null) {
            setT_p_B50(T_p_B50);
        }

        Integer T_p_B50_EMEP = (Integer) attributes.get("T_p_B50_EMEP");

        if (T_p_B50_EMEP != null) {
            setT_p_B50_EMEP(T_p_B50_EMEP);
        }

        Float WTD = (Float) attributes.get("WTD");

        if (WTD != null) {
            setWTD(WTD);
        }

        Integer WTD_EMEP = (Integer) attributes.get("WTD_EMEP");

        if (WTD_EMEP != null) {
            setWTD_EMEP(WTD_EMEP);
        }

        Float Precip = (Float) attributes.get("Precip");

        if (Precip != null) {
            setPrecip(Precip);
        }

        Integer Precip_EMEP = (Integer) attributes.get("Precip_EMEP");

        if (Precip_EMEP != null) {
            setPrecip_EMEP(Precip_EMEP);
        }
    }

    @JSON
    @Override
    public Date getSamptime() {
        return _samptime;
    }

    @Override
    public void setSamptime(Date samptime) {
        _samptime = samptime;
    }

    @JSON
    @Override
    public float getT_a() {
        return _T_a;
    }

    @Override
    public void setT_a(float T_a) {
        _T_a = T_a;
    }

    @JSON
    @Override
    public int getT_a_EMEP() {
        return _T_a_EMEP;
    }

    @Override
    public void setT_a_EMEP(int T_a_EMEP) {
        _T_a_EMEP = T_a_EMEP;
    }

    @JSON
    @Override
    public float getRH() {
        return _RH;
    }

    @Override
    public void setRH(float RH) {
        _RH = RH;
    }

    @JSON
    @Override
    public int getRH_EMEP() {
        return _RH_EMEP;
    }

    @Override
    public void setRH_EMEP(int RH_EMEP) {
        _RH_EMEP = RH_EMEP;
    }

    @JSON
    @Override
    public float getNet() {
        return _Net;
    }

    @Override
    public void setNet(float Net) {
        _Net = Net;
    }

    @JSON
    @Override
    public int getNet_EMEP() {
        return _Net_EMEP;
    }

    @Override
    public void setNet_EMEP(int Net_EMEP) {
        _Net_EMEP = Net_EMEP;
    }

    @JSON
    @Override
    public float getT_p_5() {
        return _T_p_5;
    }

    @Override
    public void setT_p_5(float T_p_5) {
        _T_p_5 = T_p_5;
    }

    @JSON
    @Override
    public int getT_p_5_EMEP() {
        return _T_p_5_EMEP;
    }

    @Override
    public void setT_p_5_EMEP(int T_p_5_EMEP) {
        _T_p_5_EMEP = T_p_5_EMEP;
    }

    @JSON
    @Override
    public float getT_p_B20() {
        return _T_p_B20;
    }

    @Override
    public void setT_p_B20(float T_p_B20) {
        _T_p_B20 = T_p_B20;
    }

    @JSON
    @Override
    public int getT_p_B20_EMEP() {
        return _T_p_B20_EMEP;
    }

    @Override
    public void setT_p_B20_EMEP(int T_p_B20_EMEP) {
        _T_p_B20_EMEP = T_p_B20_EMEP;
    }

    @JSON
    @Override
    public float getT_p_B35() {
        return _T_p_B35;
    }

    @Override
    public void setT_p_B35(float T_p_B35) {
        _T_p_B35 = T_p_B35;
    }

    @JSON
    @Override
    public int getT_p_B35_EMEP() {
        return _T_p_B35_EMEP;
    }

    @Override
    public void setT_p_B35_EMEP(int T_p_B35_EMEP) {
        _T_p_B35_EMEP = T_p_B35_EMEP;
    }

    @JSON
    @Override
    public float getT_p_B50() {
        return _T_p_B50;
    }

    @Override
    public void setT_p_B50(float T_p_B50) {
        _T_p_B50 = T_p_B50;
    }

    @JSON
    @Override
    public int getT_p_B50_EMEP() {
        return _T_p_B50_EMEP;
    }

    @Override
    public void setT_p_B50_EMEP(int T_p_B50_EMEP) {
        _T_p_B50_EMEP = T_p_B50_EMEP;
    }

    @JSON
    @Override
    public float getWTD() {
        return _WTD;
    }

    @Override
    public void setWTD(float WTD) {
        _WTD = WTD;
    }

    @JSON
    @Override
    public int getWTD_EMEP() {
        return _WTD_EMEP;
    }

    @Override
    public void setWTD_EMEP(int WTD_EMEP) {
        _WTD_EMEP = WTD_EMEP;
    }

    @JSON
    @Override
    public float getPrecip() {
        return _Precip;
    }

    @Override
    public void setPrecip(float Precip) {
        _Precip = Precip;
    }

    @JSON
    @Override
    public int getPrecip_EMEP() {
        return _Precip_EMEP;
    }

    @Override
    public void setPrecip_EMEP(int Precip_EMEP) {
        _Precip_EMEP = Precip_EMEP;
    }

    @Override
    public Sii2meta toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Sii2meta) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        Sii2metaImpl sii2metaImpl = new Sii2metaImpl();

        sii2metaImpl.setSamptime(getSamptime());
        sii2metaImpl.setT_a(getT_a());
        sii2metaImpl.setT_a_EMEP(getT_a_EMEP());
        sii2metaImpl.setRH(getRH());
        sii2metaImpl.setRH_EMEP(getRH_EMEP());
        sii2metaImpl.setNet(getNet());
        sii2metaImpl.setNet_EMEP(getNet_EMEP());
        sii2metaImpl.setT_p_5(getT_p_5());
        sii2metaImpl.setT_p_5_EMEP(getT_p_5_EMEP());
        sii2metaImpl.setT_p_B20(getT_p_B20());
        sii2metaImpl.setT_p_B20_EMEP(getT_p_B20_EMEP());
        sii2metaImpl.setT_p_B35(getT_p_B35());
        sii2metaImpl.setT_p_B35_EMEP(getT_p_B35_EMEP());
        sii2metaImpl.setT_p_B50(getT_p_B50());
        sii2metaImpl.setT_p_B50_EMEP(getT_p_B50_EMEP());
        sii2metaImpl.setWTD(getWTD());
        sii2metaImpl.setWTD_EMEP(getWTD_EMEP());
        sii2metaImpl.setPrecip(getPrecip());
        sii2metaImpl.setPrecip_EMEP(getPrecip_EMEP());

        sii2metaImpl.resetOriginalValues();

        return sii2metaImpl;
    }

    @Override
    public int compareTo(Sii2meta sii2meta) {
        java.util.Date primaryKey = sii2meta.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Sii2meta)) {
            return false;
        }

        Sii2meta sii2meta = (Sii2meta) obj;

        java.util.Date primaryKey = sii2meta.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<Sii2meta> toCacheModel() {
        Sii2metaCacheModel sii2metaCacheModel = new Sii2metaCacheModel();

        Date samptime = getSamptime();

        if (samptime != null) {
            sii2metaCacheModel.samptime = samptime.getTime();
        } else {
            sii2metaCacheModel.samptime = Long.MIN_VALUE;
        }

        sii2metaCacheModel.T_a = getT_a();

        sii2metaCacheModel.T_a_EMEP = getT_a_EMEP();

        sii2metaCacheModel.RH = getRH();

        sii2metaCacheModel.RH_EMEP = getRH_EMEP();

        sii2metaCacheModel.Net = getNet();

        sii2metaCacheModel.Net_EMEP = getNet_EMEP();

        sii2metaCacheModel.T_p_5 = getT_p_5();

        sii2metaCacheModel.T_p_5_EMEP = getT_p_5_EMEP();

        sii2metaCacheModel.T_p_B20 = getT_p_B20();

        sii2metaCacheModel.T_p_B20_EMEP = getT_p_B20_EMEP();

        sii2metaCacheModel.T_p_B35 = getT_p_B35();

        sii2metaCacheModel.T_p_B35_EMEP = getT_p_B35_EMEP();

        sii2metaCacheModel.T_p_B50 = getT_p_B50();

        sii2metaCacheModel.T_p_B50_EMEP = getT_p_B50_EMEP();

        sii2metaCacheModel.WTD = getWTD();

        sii2metaCacheModel.WTD_EMEP = getWTD_EMEP();

        sii2metaCacheModel.Precip = getPrecip();

        sii2metaCacheModel.Precip_EMEP = getPrecip_EMEP();

        return sii2metaCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(39);

        sb.append("{samptime=");
        sb.append(getSamptime());
        sb.append(", T_a=");
        sb.append(getT_a());
        sb.append(", T_a_EMEP=");
        sb.append(getT_a_EMEP());
        sb.append(", RH=");
        sb.append(getRH());
        sb.append(", RH_EMEP=");
        sb.append(getRH_EMEP());
        sb.append(", Net=");
        sb.append(getNet());
        sb.append(", Net_EMEP=");
        sb.append(getNet_EMEP());
        sb.append(", T_p_5=");
        sb.append(getT_p_5());
        sb.append(", T_p_5_EMEP=");
        sb.append(getT_p_5_EMEP());
        sb.append(", T_p_B20=");
        sb.append(getT_p_B20());
        sb.append(", T_p_B20_EMEP=");
        sb.append(getT_p_B20_EMEP());
        sb.append(", T_p_B35=");
        sb.append(getT_p_B35());
        sb.append(", T_p_B35_EMEP=");
        sb.append(getT_p_B35_EMEP());
        sb.append(", T_p_B50=");
        sb.append(getT_p_B50());
        sb.append(", T_p_B50_EMEP=");
        sb.append(getT_p_B50_EMEP());
        sb.append(", WTD=");
        sb.append(getWTD());
        sb.append(", WTD_EMEP=");
        sb.append(getWTD_EMEP());
        sb.append(", Precip=");
        sb.append(getPrecip());
        sb.append(", Precip_EMEP=");
        sb.append(getPrecip_EMEP());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(61);

        sb.append("<model><model-name>");
        sb.append("fi.csc.smear.db.model.Sii2meta");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>samptime</column-name><column-value><![CDATA[");
        sb.append(getSamptime());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_a</column-name><column-value><![CDATA[");
        sb.append(getT_a());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_a_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_a_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RH</column-name><column-value><![CDATA[");
        sb.append(getRH());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>RH_EMEP</column-name><column-value><![CDATA[");
        sb.append(getRH_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Net</column-name><column-value><![CDATA[");
        sb.append(getNet());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Net_EMEP</column-name><column-value><![CDATA[");
        sb.append(getNet_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_5</column-name><column-value><![CDATA[");
        sb.append(getT_p_5());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_5_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_p_5_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_B20</column-name><column-value><![CDATA[");
        sb.append(getT_p_B20());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_B20_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_p_B20_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_B35</column-name><column-value><![CDATA[");
        sb.append(getT_p_B35());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_B35_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_p_B35_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_B50</column-name><column-value><![CDATA[");
        sb.append(getT_p_B50());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>T_p_B50_EMEP</column-name><column-value><![CDATA[");
        sb.append(getT_p_B50_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WTD</column-name><column-value><![CDATA[");
        sb.append(getWTD());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>WTD_EMEP</column-name><column-value><![CDATA[");
        sb.append(getWTD_EMEP());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Precip</column-name><column-value><![CDATA[");
        sb.append(getPrecip());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>Precip_EMEP</column-name><column-value><![CDATA[");
        sb.append(getPrecip_EMEP());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
