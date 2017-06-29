package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.smear.db.model.kvjMeta;

import java.util.List;

/**
 * The persistence utility for the kvj meta service. This utility wraps {@link kvjMetaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see kvjMetaPersistence
 * @see kvjMetaPersistenceImpl
 * @generated
 */
public class kvjMetaUtil {
    private static kvjMetaPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(kvjMeta kvjMeta) {
        getPersistence().clearCache(kvjMeta);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<kvjMeta> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<kvjMeta> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<kvjMeta> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static kvjMeta update(kvjMeta kvjMeta) throws SystemException {
        return getPersistence().update(kvjMeta);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static kvjMeta update(kvjMeta kvjMeta, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(kvjMeta, serviceContext);
    }

    /**
    * Caches the kvj meta in the entity cache if it is enabled.
    *
    * @param kvjMeta the kvj meta
    */
    public static void cacheResult(fi.csc.smear.db.model.kvjMeta kvjMeta) {
        getPersistence().cacheResult(kvjMeta);
    }

    /**
    * Caches the kvj metas in the entity cache if it is enabled.
    *
    * @param kvjMetas the kvj metas
    */
    public static void cacheResult(
        java.util.List<fi.csc.smear.db.model.kvjMeta> kvjMetas) {
        getPersistence().cacheResult(kvjMetas);
    }

    /**
    * Creates a new kvj meta with the primary key. Does not add the kvj meta to the database.
    *
    * @param samptime the primary key for the new kvj meta
    * @return the new kvj meta
    */
    public static fi.csc.smear.db.model.kvjMeta create(java.util.Date samptime) {
        return getPersistence().create(samptime);
    }

    /**
    * Removes the kvj meta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the kvj meta
    * @return the kvj meta that was removed
    * @throws fi.csc.smear.db.NoSuchkvjMetaException if a kvj meta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.kvjMeta remove(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchkvjMetaException {
        return getPersistence().remove(samptime);
    }

    public static fi.csc.smear.db.model.kvjMeta updateImpl(
        fi.csc.smear.db.model.kvjMeta kvjMeta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(kvjMeta);
    }

    /**
    * Returns the kvj meta with the primary key or throws a {@link fi.csc.smear.db.NoSuchkvjMetaException} if it could not be found.
    *
    * @param samptime the primary key of the kvj meta
    * @return the kvj meta
    * @throws fi.csc.smear.db.NoSuchkvjMetaException if a kvj meta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.kvjMeta findByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchkvjMetaException {
        return getPersistence().findByPrimaryKey(samptime);
    }

    /**
    * Returns the kvj meta with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param samptime the primary key of the kvj meta
    * @return the kvj meta, or <code>null</code> if a kvj meta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.kvjMeta fetchByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(samptime);
    }

    /**
    * Returns all the kvj metas.
    *
    * @return the kvj metas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.kvjMeta> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the kvj metas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.kvjMetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of kvj metas
    * @param end the upper bound of the range of kvj metas (not inclusive)
    * @return the range of kvj metas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.kvjMeta> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the kvj metas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.kvjMetaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of kvj metas
    * @param end the upper bound of the range of kvj metas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of kvj metas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.kvjMeta> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the kvj metas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of kvj metas.
    *
    * @return the number of kvj metas
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static kvjMetaPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (kvjMetaPersistence) PortletBeanLocatorUtil.locate(fi.csc.smear.db.service.ClpSerializer.getServletContextName(),
                    kvjMetaPersistence.class.getName());

            ReferenceRegistry.registerReference(kvjMetaUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(kvjMetaPersistence persistence) {
    }
}
