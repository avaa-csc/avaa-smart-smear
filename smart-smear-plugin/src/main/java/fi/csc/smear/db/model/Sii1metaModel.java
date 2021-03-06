package fi.csc.smear.db.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Sii1meta service. Represents a row in the &quot;SII1_META&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link fi.csc.smear.db.model.impl.Sii1metaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link fi.csc.smear.db.model.impl.Sii1metaImpl}.
 * </p>
 *
 * @author pj
 * @see Sii1meta
 * @see fi.csc.smear.db.model.impl.Sii1metaImpl
 * @see fi.csc.smear.db.model.impl.Sii1metaModelImpl
 * @generated
 */
public interface Sii1metaModel extends BaseModel<Sii1meta> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a sii1meta model instance should use the {@link Sii1meta} interface instead.
     */

    /**
     * Returns the primary key of this sii1meta.
     *
     * @return the primary key of this sii1meta
     */
    public java.util.Date getPrimaryKey();

    /**
     * Sets the primary key of this sii1meta.
     *
     * @param primaryKey the primary key of this sii1meta
     */
    public void setPrimaryKey(java.util.Date primaryKey);

    /**
     * Returns the samptime of this sii1meta.
     *
     * @return the samptime of this sii1meta
     */
    public Date getSamptime();

    /**
     * Sets the samptime of this sii1meta.
     *
     * @param samptime the samptime of this sii1meta
     */
    public void setSamptime(Date samptime);

    /**
     * Returns the t_a of this sii1meta.
     *
     * @return the t_a of this sii1meta
     */
    public float getT_a();

    /**
     * Sets the t_a of this sii1meta.
     *
     * @param T_a the t_a of this sii1meta
     */
    public void setT_a(float T_a);

    /**
     * Returns the t_a_ e m e p of this sii1meta.
     *
     * @return the t_a_ e m e p of this sii1meta
     */
    public int getT_a_EMEP();

    /**
     * Sets the t_a_ e m e p of this sii1meta.
     *
     * @param T_a_EMEP the t_a_ e m e p of this sii1meta
     */
    public void setT_a_EMEP(int T_a_EMEP);

    /**
     * Returns the r h of this sii1meta.
     *
     * @return the r h of this sii1meta
     */
    public float getRH();

    /**
     * Sets the r h of this sii1meta.
     *
     * @param RH the r h of this sii1meta
     */
    public void setRH(float RH);

    /**
     * Returns the r h_ e m e p of this sii1meta.
     *
     * @return the r h_ e m e p of this sii1meta
     */
    public int getRH_EMEP();

    /**
     * Sets the r h_ e m e p of this sii1meta.
     *
     * @param RH_EMEP the r h_ e m e p of this sii1meta
     */
    public void setRH_EMEP(int RH_EMEP);

    /**
     * Returns the p a r of this sii1meta.
     *
     * @return the p a r of this sii1meta
     */
    public float getPAR();

    /**
     * Sets the p a r of this sii1meta.
     *
     * @param PAR the p a r of this sii1meta
     */
    public void setPAR(float PAR);

    /**
     * Returns the p a r_ e m e p of this sii1meta.
     *
     * @return the p a r_ e m e p of this sii1meta
     */
    public int getPAR_EMEP();

    /**
     * Sets the p a r_ e m e p of this sii1meta.
     *
     * @param PAR_EMEP the p a r_ e m e p of this sii1meta
     */
    public void setPAR_EMEP(int PAR_EMEP);

    /**
     * Returns the r_ p a r of this sii1meta.
     *
     * @return the r_ p a r of this sii1meta
     */
    public float getR_PAR();

    /**
     * Sets the r_ p a r of this sii1meta.
     *
     * @param R_PAR the r_ p a r of this sii1meta
     */
    public void setR_PAR(float R_PAR);

    /**
     * Returns the r_ p a r_ e m e p of this sii1meta.
     *
     * @return the r_ p a r_ e m e p of this sii1meta
     */
    public int getR_PAR_EMEP();

    /**
     * Sets the r_ p a r_ e m e p of this sii1meta.
     *
     * @param R_PAR_EMEP the r_ p a r_ e m e p of this sii1meta
     */
    public void setR_PAR_EMEP(int R_PAR_EMEP);

    /**
     * Returns the net_ c n r4 of this sii1meta.
     *
     * @return the net_ c n r4 of this sii1meta
     */
    public float getNet_CNR4();

    /**
     * Sets the net_ c n r4 of this sii1meta.
     *
     * @param Net_CNR4 the net_ c n r4 of this sii1meta
     */
    public void setNet_CNR4(float Net_CNR4);

    /**
     * Returns the net_ c n r4_ e m e p of this sii1meta.
     *
     * @return the net_ c n r4_ e m e p of this sii1meta
     */
    public int getNet_CNR4_EMEP();

    /**
     * Sets the net_ c n r4_ e m e p of this sii1meta.
     *
     * @param Net_CNR4_EMEP the net_ c n r4_ e m e p of this sii1meta
     */
    public void setNet_CNR4_EMEP(int Net_CNR4_EMEP);

    /**
     * Returns the net_ n r lite of this sii1meta.
     *
     * @return the net_ n r lite of this sii1meta
     */
    public float getNet_NRLite();

    /**
     * Sets the net_ n r lite of this sii1meta.
     *
     * @param Net_NRLite the net_ n r lite of this sii1meta
     */
    public void setNet_NRLite(float Net_NRLite);

    /**
     * Returns the net_ n r lite_ e m e p of this sii1meta.
     *
     * @return the net_ n r lite_ e m e p of this sii1meta
     */
    public int getNet_NRLite_EMEP();

    /**
     * Sets the net_ n r lite_ e m e p of this sii1meta.
     *
     * @param Net_NRLite_EMEP the net_ n r lite_ e m e p of this sii1meta
     */
    public void setNet_NRLite_EMEP(int Net_NRLite_EMEP);

    /**
     * Returns the wsoil_1 of this sii1meta.
     *
     * @return the wsoil_1 of this sii1meta
     */
    public float getWsoil_1();

    /**
     * Sets the wsoil_1 of this sii1meta.
     *
     * @param Wsoil_1 the wsoil_1 of this sii1meta
     */
    public void setWsoil_1(float Wsoil_1);

    /**
     * Returns the wsoil_1_ e m e p of this sii1meta.
     *
     * @return the wsoil_1_ e m e p of this sii1meta
     */
    public int getWsoil_1_EMEP();

    /**
     * Sets the wsoil_1_ e m e p of this sii1meta.
     *
     * @param Wsoil_1_EMEP the wsoil_1_ e m e p of this sii1meta
     */
    public void setWsoil_1_EMEP(int Wsoil_1_EMEP);

    /**
     * Returns the wsoil_2 of this sii1meta.
     *
     * @return the wsoil_2 of this sii1meta
     */
    public float getWsoil_2();

    /**
     * Sets the wsoil_2 of this sii1meta.
     *
     * @param Wsoil_2 the wsoil_2 of this sii1meta
     */
    public void setWsoil_2(float Wsoil_2);

    /**
     * Returns the wsoil_2_ e m e p of this sii1meta.
     *
     * @return the wsoil_2_ e m e p of this sii1meta
     */
    public int getWsoil_2_EMEP();

    /**
     * Sets the wsoil_2_ e m e p of this sii1meta.
     *
     * @param Wsoil_2_EMEP the wsoil_2_ e m e p of this sii1meta
     */
    public void setWsoil_2_EMEP(int Wsoil_2_EMEP);

    /**
     * Returns the t_p_ b5 of this sii1meta.
     *
     * @return the t_p_ b5 of this sii1meta
     */
    public float getT_p_B5();

    /**
     * Sets the t_p_ b5 of this sii1meta.
     *
     * @param T_p_B5 the t_p_ b5 of this sii1meta
     */
    public void setT_p_B5(float T_p_B5);

    /**
     * Returns the t_p_ b5_ e m e p of this sii1meta.
     *
     * @return the t_p_ b5_ e m e p of this sii1meta
     */
    public int getT_p_B5_EMEP();

    /**
     * Sets the t_p_ b5_ e m e p of this sii1meta.
     *
     * @param T_p_B5_EMEP the t_p_ b5_ e m e p of this sii1meta
     */
    public void setT_p_B5_EMEP(int T_p_B5_EMEP);

    /**
     * Returns the t_p_ b20 of this sii1meta.
     *
     * @return the t_p_ b20 of this sii1meta
     */
    public float getT_p_B20();

    /**
     * Sets the t_p_ b20 of this sii1meta.
     *
     * @param T_p_B20 the t_p_ b20 of this sii1meta
     */
    public void setT_p_B20(float T_p_B20);

    /**
     * Returns the t_p_ b20_ e m e p of this sii1meta.
     *
     * @return the t_p_ b20_ e m e p of this sii1meta
     */
    public int getT_p_B20_EMEP();

    /**
     * Sets the t_p_ b20_ e m e p of this sii1meta.
     *
     * @param T_p_B20_EMEP the t_p_ b20_ e m e p of this sii1meta
     */
    public void setT_p_B20_EMEP(int T_p_B20_EMEP);

    /**
     * Returns the t_p_ b35 of this sii1meta.
     *
     * @return the t_p_ b35 of this sii1meta
     */
    public float getT_p_B35();

    /**
     * Sets the t_p_ b35 of this sii1meta.
     *
     * @param T_p_B35 the t_p_ b35 of this sii1meta
     */
    public void setT_p_B35(float T_p_B35);

    /**
     * Returns the t_p_ b35_ e m e p of this sii1meta.
     *
     * @return the t_p_ b35_ e m e p of this sii1meta
     */
    public int getT_p_B35_EMEP();

    /**
     * Sets the t_p_ b35_ e m e p of this sii1meta.
     *
     * @param T_p_B35_EMEP the t_p_ b35_ e m e p of this sii1meta
     */
    public void setT_p_B35_EMEP(int T_p_B35_EMEP);

    /**
     * Returns the t_p_ b50 of this sii1meta.
     *
     * @return the t_p_ b50 of this sii1meta
     */
    public float getT_p_B50();

    /**
     * Sets the t_p_ b50 of this sii1meta.
     *
     * @param T_p_B50 the t_p_ b50 of this sii1meta
     */
    public void setT_p_B50(float T_p_B50);

    /**
     * Returns the t_p_ b50_ e m e p of this sii1meta.
     *
     * @return the t_p_ b50_ e m e p of this sii1meta
     */
    public int getT_p_B50_EMEP();

    /**
     * Sets the t_p_ b50_ e m e p of this sii1meta.
     *
     * @param T_p_B50_EMEP the t_p_ b50_ e m e p of this sii1meta
     */
    public void setT_p_B50_EMEP(int T_p_B50_EMEP);

    /**
     * Returns the t_p_ c1 of this sii1meta.
     *
     * @return the t_p_ c1 of this sii1meta
     */
    public float getT_p_C1();

    /**
     * Sets the t_p_ c1 of this sii1meta.
     *
     * @param T_p_C1 the t_p_ c1 of this sii1meta
     */
    public void setT_p_C1(float T_p_C1);

    /**
     * Returns the t_p_ c1_ e m e p of this sii1meta.
     *
     * @return the t_p_ c1_ e m e p of this sii1meta
     */
    public int getT_p_C1_EMEP();

    /**
     * Sets the t_p_ c1_ e m e p of this sii1meta.
     *
     * @param T_p_C1_EMEP the t_p_ c1_ e m e p of this sii1meta
     */
    public void setT_p_C1_EMEP(int T_p_C1_EMEP);

    /**
     * Returns the t_p_ c2 of this sii1meta.
     *
     * @return the t_p_ c2 of this sii1meta
     */
    public float getT_p_C2();

    /**
     * Sets the t_p_ c2 of this sii1meta.
     *
     * @param T_p_C2 the t_p_ c2 of this sii1meta
     */
    public void setT_p_C2(float T_p_C2);

    /**
     * Returns the t_p_ c2_ e m e p of this sii1meta.
     *
     * @return the t_p_ c2_ e m e p of this sii1meta
     */
    public int getT_p_C2_EMEP();

    /**
     * Sets the t_p_ c2_ e m e p of this sii1meta.
     *
     * @param T_p_C2_EMEP the t_p_ c2_ e m e p of this sii1meta
     */
    public void setT_p_C2_EMEP(int T_p_C2_EMEP);

    /**
     * Returns the t_p_ c5 of this sii1meta.
     *
     * @return the t_p_ c5 of this sii1meta
     */
    public float getT_p_C5();

    /**
     * Sets the t_p_ c5 of this sii1meta.
     *
     * @param T_p_C5 the t_p_ c5 of this sii1meta
     */
    public void setT_p_C5(float T_p_C5);

    /**
     * Returns the t_p_ c5_ e m e p of this sii1meta.
     *
     * @return the t_p_ c5_ e m e p of this sii1meta
     */
    public int getT_p_C5_EMEP();

    /**
     * Sets the t_p_ c5_ e m e p of this sii1meta.
     *
     * @param T_p_C5_EMEP the t_p_ c5_ e m e p of this sii1meta
     */
    public void setT_p_C5_EMEP(int T_p_C5_EMEP);

    /**
     * Returns the t_p_ c10 of this sii1meta.
     *
     * @return the t_p_ c10 of this sii1meta
     */
    public float getT_p_C10();

    /**
     * Sets the t_p_ c10 of this sii1meta.
     *
     * @param T_p_C10 the t_p_ c10 of this sii1meta
     */
    public void setT_p_C10(float T_p_C10);

    /**
     * Returns the t_p_ c10_ e m e p of this sii1meta.
     *
     * @return the t_p_ c10_ e m e p of this sii1meta
     */
    public int getT_p_C10_EMEP();

    /**
     * Sets the t_p_ c10_ e m e p of this sii1meta.
     *
     * @param T_p_C10_EMEP the t_p_ c10_ e m e p of this sii1meta
     */
    public void setT_p_C10_EMEP(int T_p_C10_EMEP);

    /**
     * Returns the t_p_ c15 of this sii1meta.
     *
     * @return the t_p_ c15 of this sii1meta
     */
    public float getT_p_C15();

    /**
     * Sets the t_p_ c15 of this sii1meta.
     *
     * @param T_p_C15 the t_p_ c15 of this sii1meta
     */
    public void setT_p_C15(float T_p_C15);

    /**
     * Returns the t_p_ c15_ e m e p of this sii1meta.
     *
     * @return the t_p_ c15_ e m e p of this sii1meta
     */
    public int getT_p_C15_EMEP();

    /**
     * Sets the t_p_ c15_ e m e p of this sii1meta.
     *
     * @param T_p_C15_EMEP the t_p_ c15_ e m e p of this sii1meta
     */
    public void setT_p_C15_EMEP(int T_p_C15_EMEP);

    /**
     * Returns the t_p_ c20 of this sii1meta.
     *
     * @return the t_p_ c20 of this sii1meta
     */
    public float getT_p_C20();

    /**
     * Sets the t_p_ c20 of this sii1meta.
     *
     * @param T_p_C20 the t_p_ c20 of this sii1meta
     */
    public void setT_p_C20(float T_p_C20);

    /**
     * Returns the t_p_ c20_ e m e p of this sii1meta.
     *
     * @return the t_p_ c20_ e m e p of this sii1meta
     */
    public int getT_p_C20_EMEP();

    /**
     * Sets the t_p_ c20_ e m e p of this sii1meta.
     *
     * @param T_p_C20_EMEP the t_p_ c20_ e m e p of this sii1meta
     */
    public void setT_p_C20_EMEP(int T_p_C20_EMEP);

    /**
     * Returns the t_p_ c30 of this sii1meta.
     *
     * @return the t_p_ c30 of this sii1meta
     */
    public float getT_p_C30();

    /**
     * Sets the t_p_ c30 of this sii1meta.
     *
     * @param T_p_C30 the t_p_ c30 of this sii1meta
     */
    public void setT_p_C30(float T_p_C30);

    /**
     * Returns the t_p_ c30_ e m e p of this sii1meta.
     *
     * @return the t_p_ c30_ e m e p of this sii1meta
     */
    public int getT_p_C30_EMEP();

    /**
     * Sets the t_p_ c30_ e m e p of this sii1meta.
     *
     * @param T_p_C30_EMEP the t_p_ c30_ e m e p of this sii1meta
     */
    public void setT_p_C30_EMEP(int T_p_C30_EMEP);

    /**
     * Returns the t_p_ c50 of this sii1meta.
     *
     * @return the t_p_ c50 of this sii1meta
     */
    public float getT_p_C50();

    /**
     * Sets the t_p_ c50 of this sii1meta.
     *
     * @param T_p_C50 the t_p_ c50 of this sii1meta
     */
    public void setT_p_C50(float T_p_C50);

    /**
     * Returns the t_p_ c50_ e m e p of this sii1meta.
     *
     * @return the t_p_ c50_ e m e p of this sii1meta
     */
    public int getT_p_C50_EMEP();

    /**
     * Sets the t_p_ c50_ e m e p of this sii1meta.
     *
     * @param T_p_C50_EMEP the t_p_ c50_ e m e p of this sii1meta
     */
    public void setT_p_C50_EMEP(int T_p_C50_EMEP);

    /**
     * Returns the t_p_ c70 of this sii1meta.
     *
     * @return the t_p_ c70 of this sii1meta
     */
    public float getT_p_C70();

    /**
     * Sets the t_p_ c70 of this sii1meta.
     *
     * @param T_p_C70 the t_p_ c70 of this sii1meta
     */
    public void setT_p_C70(float T_p_C70);

    /**
     * Returns the t_p_ c70_ e m e p of this sii1meta.
     *
     * @return the t_p_ c70_ e m e p of this sii1meta
     */
    public int getT_p_C70_EMEP();

    /**
     * Sets the t_p_ c70_ e m e p of this sii1meta.
     *
     * @param T_p_C70_EMEP the t_p_ c70_ e m e p of this sii1meta
     */
    public void setT_p_C70_EMEP(int T_p_C70_EMEP);

    /**
     * Returns the t_p_ c100 of this sii1meta.
     *
     * @return the t_p_ c100 of this sii1meta
     */
    public float getT_p_C100();

    /**
     * Sets the t_p_ c100 of this sii1meta.
     *
     * @param T_p_C100 the t_p_ c100 of this sii1meta
     */
    public void setT_p_C100(float T_p_C100);

    /**
     * Returns the t_p_ c100_ e m e p of this sii1meta.
     *
     * @return the t_p_ c100_ e m e p of this sii1meta
     */
    public int getT_p_C100_EMEP();

    /**
     * Sets the t_p_ c100_ e m e p of this sii1meta.
     *
     * @param T_p_C100_EMEP the t_p_ c100_ e m e p of this sii1meta
     */
    public void setT_p_C100_EMEP(int T_p_C100_EMEP);

    /**
     * Returns the w t d of this sii1meta.
     *
     * @return the w t d of this sii1meta
     */
    public float getWTD();

    /**
     * Sets the w t d of this sii1meta.
     *
     * @param WTD the w t d of this sii1meta
     */
    public void setWTD(float WTD);

    /**
     * Returns the w t d_ e m e p of this sii1meta.
     *
     * @return the w t d_ e m e p of this sii1meta
     */
    public int getWTD_EMEP();

    /**
     * Sets the w t d_ e m e p of this sii1meta.
     *
     * @param WTD_EMEP the w t d_ e m e p of this sii1meta
     */
    public void setWTD_EMEP(int WTD_EMEP);

    /**
     * Returns the precip of this sii1meta.
     *
     * @return the precip of this sii1meta
     */
    public float getPrecip();

    /**
     * Sets the precip of this sii1meta.
     *
     * @param Precip the precip of this sii1meta
     */
    public void setPrecip(float Precip);

    /**
     * Returns the precip_ e m e p of this sii1meta.
     *
     * @return the precip_ e m e p of this sii1meta
     */
    public int getPrecip_EMEP();

    /**
     * Sets the precip_ e m e p of this sii1meta.
     *
     * @param Precip_EMEP the precip_ e m e p of this sii1meta
     */
    public void setPrecip_EMEP(int Precip_EMEP);

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
    public int compareTo(Sii1meta sii1meta);

    @Override
    public int hashCode();

    @Override
    public CacheModel<Sii1meta> toCacheModel();

    @Override
    public Sii1meta toEscapedModel();

    @Override
    public Sii1meta toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
