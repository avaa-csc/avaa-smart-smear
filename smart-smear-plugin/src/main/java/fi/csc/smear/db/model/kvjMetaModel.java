package fi.csc.smear.db.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the kvjMeta service. Represents a row in the &quot;KVJ_META&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link fi.csc.smear.db.model.impl.kvjMetaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link fi.csc.smear.db.model.impl.kvjMetaImpl}.
 * </p>
 *
 * @author pj
 * @see kvjMeta
 * @see fi.csc.smear.db.model.impl.kvjMetaImpl
 * @see fi.csc.smear.db.model.impl.kvjMetaModelImpl
 * @generated
 */
public interface kvjMetaModel extends BaseModel<kvjMeta> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a kvj meta model instance should use the {@link kvjMeta} interface instead.
     */

    /**
     * Returns the primary key of this kvj meta.
     *
     * @return the primary key of this kvj meta
     */
    public java.util.Date getPrimaryKey();

    /**
     * Sets the primary key of this kvj meta.
     *
     * @param primaryKey the primary key of this kvj meta
     */
    public void setPrimaryKey(java.util.Date primaryKey);

    /**
     * Returns the samptime of this kvj meta.
     *
     * @return the samptime of this kvj meta
     */
    public Date getSamptime();

    /**
     * Sets the samptime of this kvj meta.
     *
     * @param samptime the samptime of this kvj meta
     */
    public void setSamptime(Date samptime);

    /**
     * Returns the tw2 of this kvj meta.
     *
     * @return the tw2 of this kvj meta
     */
    public float getTw2();

    /**
     * Sets the tw2 of this kvj meta.
     *
     * @param Tw2 the tw2 of this kvj meta
     */
    public void setTw2(float Tw2);

    /**
     * Returns the tw5 of this kvj meta.
     *
     * @return the tw5 of this kvj meta
     */
    public float getTw5();

    /**
     * Sets the tw5 of this kvj meta.
     *
     * @param Tw5 the tw5 of this kvj meta
     */
    public void setTw5(float Tw5);

    /**
     * Returns the tw10 of this kvj meta.
     *
     * @return the tw10 of this kvj meta
     */
    public float getTw10();

    /**
     * Sets the tw10 of this kvj meta.
     *
     * @param Tw10 the tw10 of this kvj meta
     */
    public void setTw10(float Tw10);

    /**
     * Returns the tw15 of this kvj meta.
     *
     * @return the tw15 of this kvj meta
     */
    public float getTw15();

    /**
     * Sets the tw15 of this kvj meta.
     *
     * @param Tw15 the tw15 of this kvj meta
     */
    public void setTw15(float Tw15);

    /**
     * Returns the tw20 of this kvj meta.
     *
     * @return the tw20 of this kvj meta
     */
    public float getTw20();

    /**
     * Sets the tw20 of this kvj meta.
     *
     * @param Tw20 the tw20 of this kvj meta
     */
    public void setTw20(float Tw20);

    /**
     * Returns the tw25 of this kvj meta.
     *
     * @return the tw25 of this kvj meta
     */
    public float getTw25();

    /**
     * Sets the tw25 of this kvj meta.
     *
     * @param Tw25 the tw25 of this kvj meta
     */
    public void setTw25(float Tw25);

    /**
     * Returns the tw30 of this kvj meta.
     *
     * @return the tw30 of this kvj meta
     */
    public float getTw30();

    /**
     * Sets the tw30 of this kvj meta.
     *
     * @param Tw30 the tw30 of this kvj meta
     */
    public void setTw30(float Tw30);

    /**
     * Returns the tw35 of this kvj meta.
     *
     * @return the tw35 of this kvj meta
     */
    public float getTw35();

    /**
     * Sets the tw35 of this kvj meta.
     *
     * @param Tw35 the tw35 of this kvj meta
     */
    public void setTw35(float Tw35);

    /**
     * Returns the tw40 of this kvj meta.
     *
     * @return the tw40 of this kvj meta
     */
    public float getTw40();

    /**
     * Sets the tw40 of this kvj meta.
     *
     * @param Tw40 the tw40 of this kvj meta
     */
    public void setTw40(float Tw40);

    /**
     * Returns the tw45 of this kvj meta.
     *
     * @return the tw45 of this kvj meta
     */
    public float getTw45();

    /**
     * Sets the tw45 of this kvj meta.
     *
     * @param Tw45 the tw45 of this kvj meta
     */
    public void setTw45(float Tw45);

    /**
     * Returns the tw50 of this kvj meta.
     *
     * @return the tw50 of this kvj meta
     */
    public float getTw50();

    /**
     * Sets the tw50 of this kvj meta.
     *
     * @param Tw50 the tw50 of this kvj meta
     */
    public void setTw50(float Tw50);

    /**
     * Returns the tw60 of this kvj meta.
     *
     * @return the tw60 of this kvj meta
     */
    public float getTw60();

    /**
     * Sets the tw60 of this kvj meta.
     *
     * @param Tw60 the tw60 of this kvj meta
     */
    public void setTw60(float Tw60);

    /**
     * Returns the tw70 of this kvj meta.
     *
     * @return the tw70 of this kvj meta
     */
    public float getTw70();

    /**
     * Sets the tw70 of this kvj meta.
     *
     * @param Tw70 the tw70 of this kvj meta
     */
    public void setTw70(float Tw70);

    /**
     * Returns the tw80 of this kvj meta.
     *
     * @return the tw80 of this kvj meta
     */
    public float getTw80();

    /**
     * Sets the tw80 of this kvj meta.
     *
     * @param Tw80 the tw80 of this kvj meta
     */
    public void setTw80(float Tw80);

    /**
     * Returns the tw100 of this kvj meta.
     *
     * @return the tw100 of this kvj meta
     */
    public float getTw100();

    /**
     * Sets the tw100 of this kvj meta.
     *
     * @param Tw100 the tw100 of this kvj meta
     */
    public void setTw100(float Tw100);

    /**
     * Returns the tw120 of this kvj meta.
     *
     * @return the tw120 of this kvj meta
     */
    public float getTw120();

    /**
     * Sets the tw120 of this kvj meta.
     *
     * @param Tw120 the tw120 of this kvj meta
     */
    public void setTw120(float Tw120);

    /**
     * Returns the c o2w02 of this kvj meta.
     *
     * @return the c o2w02 of this kvj meta
     */
    public float getCO2w02();

    /**
     * Sets the c o2w02 of this kvj meta.
     *
     * @param CO2w02 the c o2w02 of this kvj meta
     */
    public void setCO2w02(float CO2w02);

    /**
     * Returns the c o2w15 of this kvj meta.
     *
     * @return the c o2w15 of this kvj meta
     */
    public float getCO2w15();

    /**
     * Sets the c o2w15 of this kvj meta.
     *
     * @param CO2w15 the c o2w15 of this kvj meta
     */
    public void setCO2w15(float CO2w15);

    /**
     * Returns the c o2w25 of this kvj meta.
     *
     * @return the c o2w25 of this kvj meta
     */
    public float getCO2w25();

    /**
     * Sets the c o2w25 of this kvj meta.
     *
     * @param CO2w25 the c o2w25 of this kvj meta
     */
    public void setCO2w25(float CO2w25);

    /**
     * Returns the c o2w70 of this kvj meta.
     *
     * @return the c o2w70 of this kvj meta
     */
    public float getCO2w70();

    /**
     * Sets the c o2w70 of this kvj meta.
     *
     * @param CO2w70 the c o2w70 of this kvj meta
     */
    public void setCO2w70(float CO2w70);

    /**
     * Returns the glob of this kvj meta.
     *
     * @return the glob of this kvj meta
     */
    public float getGlob();

    /**
     * Sets the glob of this kvj meta.
     *
     * @param Glob the glob of this kvj meta
     */
    public void setGlob(float Glob);

    /**
     * Returns the r glob of this kvj meta.
     *
     * @return the r glob of this kvj meta
     */
    public float getRGlob();

    /**
     * Sets the r glob of this kvj meta.
     *
     * @param RGlob the r glob of this kvj meta
     */
    public void setRGlob(float RGlob);

    /**
     * Returns the l win of this kvj meta.
     *
     * @return the l win of this kvj meta
     */
    public float getLWin();

    /**
     * Sets the l win of this kvj meta.
     *
     * @param LWin the l win of this kvj meta
     */
    public void setLWin(float LWin);

    /**
     * Returns the l wout of this kvj meta.
     *
     * @return the l wout of this kvj meta
     */
    public float getLWout();

    /**
     * Sets the l wout of this kvj meta.
     *
     * @param LWout the l wout of this kvj meta
     */
    public void setLWout(float LWout);

    /**
     * Returns the p a rw02 of this kvj meta.
     *
     * @return the p a rw02 of this kvj meta
     */
    public float getPARw02();

    /**
     * Sets the p a rw02 of this kvj meta.
     *
     * @param PARw02 the p a rw02 of this kvj meta
     */
    public void setPARw02(float PARw02);

    /**
     * Returns the p a rw07 of this kvj meta.
     *
     * @return the p a rw07 of this kvj meta
     */
    public float getPARw07();

    /**
     * Sets the p a rw07 of this kvj meta.
     *
     * @param PARw07 the p a rw07 of this kvj meta
     */
    public void setPARw07(float PARw07);

    /**
     * Returns the p a rw10 of this kvj meta.
     *
     * @return the p a rw10 of this kvj meta
     */
    public float getPARw10();

    /**
     * Sets the p a rw10 of this kvj meta.
     *
     * @param PARw10 the p a rw10 of this kvj meta
     */
    public void setPARw10(float PARw10);

    /**
     * Returns the ta of this kvj meta.
     *
     * @return the ta of this kvj meta
     */
    public float getTa();

    /**
     * Sets the ta of this kvj meta.
     *
     * @param Ta the ta of this kvj meta
     */
    public void setTa(float Ta);

    /**
     * Returns the r h of this kvj meta.
     *
     * @return the r h of this kvj meta
     */
    public float getRH();

    /**
     * Sets the r h of this kvj meta.
     *
     * @param RH the r h of this kvj meta
     */
    public void setRH(float RH);

    /**
     * Returns the tw2_ e m e p of this kvj meta.
     *
     * @return the tw2_ e m e p of this kvj meta
     */
    public int getTw2_EMEP();

    /**
     * Sets the tw2_ e m e p of this kvj meta.
     *
     * @param Tw2_EMEP the tw2_ e m e p of this kvj meta
     */
    public void setTw2_EMEP(int Tw2_EMEP);

    /**
     * Returns the tw5_ e m e p of this kvj meta.
     *
     * @return the tw5_ e m e p of this kvj meta
     */
    public int getTw5_EMEP();

    /**
     * Sets the tw5_ e m e p of this kvj meta.
     *
     * @param Tw5_EMEP the tw5_ e m e p of this kvj meta
     */
    public void setTw5_EMEP(int Tw5_EMEP);

    /**
     * Returns the tw10_ e m e p of this kvj meta.
     *
     * @return the tw10_ e m e p of this kvj meta
     */
    public int getTw10_EMEP();

    /**
     * Sets the tw10_ e m e p of this kvj meta.
     *
     * @param Tw10_EMEP the tw10_ e m e p of this kvj meta
     */
    public void setTw10_EMEP(int Tw10_EMEP);

    /**
     * Returns the tw15_ e m e p of this kvj meta.
     *
     * @return the tw15_ e m e p of this kvj meta
     */
    public int getTw15_EMEP();

    /**
     * Sets the tw15_ e m e p of this kvj meta.
     *
     * @param Tw15_EMEP the tw15_ e m e p of this kvj meta
     */
    public void setTw15_EMEP(int Tw15_EMEP);

    /**
     * Returns the tw20_ e m e p of this kvj meta.
     *
     * @return the tw20_ e m e p of this kvj meta
     */
    public int getTw20_EMEP();

    /**
     * Sets the tw20_ e m e p of this kvj meta.
     *
     * @param Tw20_EMEP the tw20_ e m e p of this kvj meta
     */
    public void setTw20_EMEP(int Tw20_EMEP);

    /**
     * Returns the tw25_ e m e p of this kvj meta.
     *
     * @return the tw25_ e m e p of this kvj meta
     */
    public int getTw25_EMEP();

    /**
     * Sets the tw25_ e m e p of this kvj meta.
     *
     * @param Tw25_EMEP the tw25_ e m e p of this kvj meta
     */
    public void setTw25_EMEP(int Tw25_EMEP);

    /**
     * Returns the tw30_ e m e p of this kvj meta.
     *
     * @return the tw30_ e m e p of this kvj meta
     */
    public int getTw30_EMEP();

    /**
     * Sets the tw30_ e m e p of this kvj meta.
     *
     * @param Tw30_EMEP the tw30_ e m e p of this kvj meta
     */
    public void setTw30_EMEP(int Tw30_EMEP);

    /**
     * Returns the tw35_ e m e p of this kvj meta.
     *
     * @return the tw35_ e m e p of this kvj meta
     */
    public int getTw35_EMEP();

    /**
     * Sets the tw35_ e m e p of this kvj meta.
     *
     * @param Tw35_EMEP the tw35_ e m e p of this kvj meta
     */
    public void setTw35_EMEP(int Tw35_EMEP);

    /**
     * Returns the tw40_ e m e p of this kvj meta.
     *
     * @return the tw40_ e m e p of this kvj meta
     */
    public int getTw40_EMEP();

    /**
     * Sets the tw40_ e m e p of this kvj meta.
     *
     * @param Tw40_EMEP the tw40_ e m e p of this kvj meta
     */
    public void setTw40_EMEP(int Tw40_EMEP);

    /**
     * Returns the tw45_ e m e p of this kvj meta.
     *
     * @return the tw45_ e m e p of this kvj meta
     */
    public int getTw45_EMEP();

    /**
     * Sets the tw45_ e m e p of this kvj meta.
     *
     * @param Tw45_EMEP the tw45_ e m e p of this kvj meta
     */
    public void setTw45_EMEP(int Tw45_EMEP);

    /**
     * Returns the tw50_ e m e p of this kvj meta.
     *
     * @return the tw50_ e m e p of this kvj meta
     */
    public int getTw50_EMEP();

    /**
     * Sets the tw50_ e m e p of this kvj meta.
     *
     * @param Tw50_EMEP the tw50_ e m e p of this kvj meta
     */
    public void setTw50_EMEP(int Tw50_EMEP);

    /**
     * Returns the tw60_ e m e p of this kvj meta.
     *
     * @return the tw60_ e m e p of this kvj meta
     */
    public int getTw60_EMEP();

    /**
     * Sets the tw60_ e m e p of this kvj meta.
     *
     * @param Tw60_EMEP the tw60_ e m e p of this kvj meta
     */
    public void setTw60_EMEP(int Tw60_EMEP);

    /**
     * Returns the tw70_ e m e p of this kvj meta.
     *
     * @return the tw70_ e m e p of this kvj meta
     */
    public int getTw70_EMEP();

    /**
     * Sets the tw70_ e m e p of this kvj meta.
     *
     * @param Tw70_EMEP the tw70_ e m e p of this kvj meta
     */
    public void setTw70_EMEP(int Tw70_EMEP);

    /**
     * Returns the tw80_ e m e p of this kvj meta.
     *
     * @return the tw80_ e m e p of this kvj meta
     */
    public int getTw80_EMEP();

    /**
     * Sets the tw80_ e m e p of this kvj meta.
     *
     * @param Tw80_EMEP the tw80_ e m e p of this kvj meta
     */
    public void setTw80_EMEP(int Tw80_EMEP);

    /**
     * Returns the tw100_ e m e p of this kvj meta.
     *
     * @return the tw100_ e m e p of this kvj meta
     */
    public int getTw100_EMEP();

    /**
     * Sets the tw100_ e m e p of this kvj meta.
     *
     * @param Tw100_EMEP the tw100_ e m e p of this kvj meta
     */
    public void setTw100_EMEP(int Tw100_EMEP);

    /**
     * Returns the tw120_ e m e p of this kvj meta.
     *
     * @return the tw120_ e m e p of this kvj meta
     */
    public int getTw120_EMEP();

    /**
     * Sets the tw120_ e m e p of this kvj meta.
     *
     * @param Tw120_EMEP the tw120_ e m e p of this kvj meta
     */
    public void setTw120_EMEP(int Tw120_EMEP);

    /**
     * Returns the c o2w02_ e m e p of this kvj meta.
     *
     * @return the c o2w02_ e m e p of this kvj meta
     */
    public int getCO2w02_EMEP();

    /**
     * Sets the c o2w02_ e m e p of this kvj meta.
     *
     * @param CO2w02_EMEP the c o2w02_ e m e p of this kvj meta
     */
    public void setCO2w02_EMEP(int CO2w02_EMEP);

    /**
     * Returns the c o2w15_ e m e p of this kvj meta.
     *
     * @return the c o2w15_ e m e p of this kvj meta
     */
    public int getCO2w15_EMEP();

    /**
     * Sets the c o2w15_ e m e p of this kvj meta.
     *
     * @param CO2w15_EMEP the c o2w15_ e m e p of this kvj meta
     */
    public void setCO2w15_EMEP(int CO2w15_EMEP);

    /**
     * Returns the c o2w25_ e m e p of this kvj meta.
     *
     * @return the c o2w25_ e m e p of this kvj meta
     */
    public int getCO2w25_EMEP();

    /**
     * Sets the c o2w25_ e m e p of this kvj meta.
     *
     * @param CO2w25_EMEP the c o2w25_ e m e p of this kvj meta
     */
    public void setCO2w25_EMEP(int CO2w25_EMEP);

    /**
     * Returns the c o2w70_ e m e p of this kvj meta.
     *
     * @return the c o2w70_ e m e p of this kvj meta
     */
    public int getCO2w70_EMEP();

    /**
     * Sets the c o2w70_ e m e p of this kvj meta.
     *
     * @param CO2w70_EMEP the c o2w70_ e m e p of this kvj meta
     */
    public void setCO2w70_EMEP(int CO2w70_EMEP);

    /**
     * Returns the glob_ e m e p of this kvj meta.
     *
     * @return the glob_ e m e p of this kvj meta
     */
    public int getGlob_EMEP();

    /**
     * Sets the glob_ e m e p of this kvj meta.
     *
     * @param Glob_EMEP the glob_ e m e p of this kvj meta
     */
    public void setGlob_EMEP(int Glob_EMEP);

    /**
     * Returns the r glob_ e m e p of this kvj meta.
     *
     * @return the r glob_ e m e p of this kvj meta
     */
    public int getRGlob_EMEP();

    /**
     * Sets the r glob_ e m e p of this kvj meta.
     *
     * @param RGlob_EMEP the r glob_ e m e p of this kvj meta
     */
    public void setRGlob_EMEP(int RGlob_EMEP);

    /**
     * Returns the l win_ e m e p of this kvj meta.
     *
     * @return the l win_ e m e p of this kvj meta
     */
    public int getLWin_EMEP();

    /**
     * Sets the l win_ e m e p of this kvj meta.
     *
     * @param LWin_EMEP the l win_ e m e p of this kvj meta
     */
    public void setLWin_EMEP(int LWin_EMEP);

    /**
     * Returns the l wout_ e m e p of this kvj meta.
     *
     * @return the l wout_ e m e p of this kvj meta
     */
    public int getLWout_EMEP();

    /**
     * Sets the l wout_ e m e p of this kvj meta.
     *
     * @param LWout_EMEP the l wout_ e m e p of this kvj meta
     */
    public void setLWout_EMEP(int LWout_EMEP);

    /**
     * Returns the p a rw02_ e m e p of this kvj meta.
     *
     * @return the p a rw02_ e m e p of this kvj meta
     */
    public int getPARw02_EMEP();

    /**
     * Sets the p a rw02_ e m e p of this kvj meta.
     *
     * @param PARw02_EMEP the p a rw02_ e m e p of this kvj meta
     */
    public void setPARw02_EMEP(int PARw02_EMEP);

    /**
     * Returns the p a rw07_ e m e p of this kvj meta.
     *
     * @return the p a rw07_ e m e p of this kvj meta
     */
    public int getPARw07_EMEP();

    /**
     * Sets the p a rw07_ e m e p of this kvj meta.
     *
     * @param PARw07_EMEP the p a rw07_ e m e p of this kvj meta
     */
    public void setPARw07_EMEP(int PARw07_EMEP);

    /**
     * Returns the p a rw10_ e m e p of this kvj meta.
     *
     * @return the p a rw10_ e m e p of this kvj meta
     */
    public int getPARw10_EMEP();

    /**
     * Sets the p a rw10_ e m e p of this kvj meta.
     *
     * @param PARw10_EMEP the p a rw10_ e m e p of this kvj meta
     */
    public void setPARw10_EMEP(int PARw10_EMEP);

    /**
     * Returns the ta_ e m e p of this kvj meta.
     *
     * @return the ta_ e m e p of this kvj meta
     */
    public int getTa_EMEP();

    /**
     * Sets the ta_ e m e p of this kvj meta.
     *
     * @param Ta_EMEP the ta_ e m e p of this kvj meta
     */
    public void setTa_EMEP(int Ta_EMEP);

    /**
     * Returns the r h_ e m e p of this kvj meta.
     *
     * @return the r h_ e m e p of this kvj meta
     */
    public int getRH_EMEP();

    /**
     * Sets the r h_ e m e p of this kvj meta.
     *
     * @param RH_EMEP the r h_ e m e p of this kvj meta
     */
    public void setRH_EMEP(int RH_EMEP);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(fi.csc.smear.db.model.kvjMeta kvjMeta);

    @Override
    public int hashCode();

    @Override
    public CacheModel<fi.csc.smear.db.model.kvjMeta> toCacheModel();

    @Override
    public fi.csc.smear.db.model.kvjMeta toEscapedModel();

    @Override
    public fi.csc.smear.db.model.kvjMeta toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}