package fi.csc.smear.db.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the SmearEvents service. Represents a row in the &quot;Events&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link fi.csc.smear.db.model.impl.SmearEventsModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link fi.csc.smear.db.model.impl.SmearEventsImpl}.
 * </p>
 *
 * @author pj
 * @see SmearEvents
 * @see fi.csc.smear.db.model.impl.SmearEventsImpl
 * @see fi.csc.smear.db.model.impl.SmearEventsModelImpl
 * @generated
 */
public interface SmearEventsModel extends BaseModel<SmearEvents> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a smear events model instance should use the {@link SmearEvents} interface instead.
     */

    /**
     * Returns the primary key of this smear events.
     *
     * @return the primary key of this smear events
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this smear events.
     *
     * @param primaryKey the primary key of this smear events
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the event i d of this smear events.
     *
     * @return the event i d of this smear events
     */
    public long getEventID();

    /**
     * Sets the event i d of this smear events.
     *
     * @param eventID the event i d of this smear events
     */
    public void setEventID(long eventID);

    /**
     * Returns the event_type of this smear events.
     *
     * @return the event_type of this smear events
     */
    @AutoEscape
    public String getEvent_type();

    /**
     * Sets the event_type of this smear events.
     *
     * @param event_type the event_type of this smear events
     */
    public void setEvent_type(String event_type);

    /**
     * Returns the event of this smear events.
     *
     * @return the event of this smear events
     */
    @AutoEscape
    public String getEvent();

    /**
     * Sets the event of this smear events.
     *
     * @param event the event of this smear events
     */
    public void setEvent(String event);

    /**
     * Returns the who of this smear events.
     *
     * @return the who of this smear events
     */
    @AutoEscape
    public String getWho();

    /**
     * Sets the who of this smear events.
     *
     * @param who the who of this smear events
     */
    public void setWho(String who);

    /**
     * Returns the period_start of this smear events.
     *
     * @return the period_start of this smear events
     */
    public Date getPeriod_start();

    /**
     * Sets the period_start of this smear events.
     *
     * @param period_start the period_start of this smear events
     */
    public void setPeriod_start(Date period_start);

    /**
     * Returns the period_end of this smear events.
     *
     * @return the period_end of this smear events
     */
    public Date getPeriod_end();

    /**
     * Sets the period_end of this smear events.
     *
     * @param period_end the period_end of this smear events
     */
    public void setPeriod_end(Date period_end);

    /**
     * Returns the etimestamp of this smear events.
     *
     * @return the etimestamp of this smear events
     */
    public Date getEtimestamp();

    /**
     * Sets the etimestamp of this smear events.
     *
     * @param etimestamp the etimestamp of this smear events
     */
    public void setEtimestamp(Date etimestamp);

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
    public int compareTo(SmearEvents smearEvents);

    @Override
    public int hashCode();

    @Override
    public CacheModel<SmearEvents> toCacheModel();

    @Override
    public SmearEvents toEscapedModel();

    @Override
    public SmearEvents toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
