package fi.csc.smear.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.smear.db.model.Hyde_eddy233;

import java.util.List;

/**
 * The persistence utility for the hyde_eddy233 service. This utility wraps {@link Hyde_eddy233PersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author pj
 * @see Hyde_eddy233Persistence
 * @see Hyde_eddy233PersistenceImpl
 * @generated
 */
public class Hyde_eddy233Util {
    private static Hyde_eddy233Persistence _persistence;

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
    public static void clearCache(Hyde_eddy233 hyde_eddy233) {
        getPersistence().clearCache(hyde_eddy233);
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
    public static List<Hyde_eddy233> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Hyde_eddy233> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Hyde_eddy233> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Hyde_eddy233 update(Hyde_eddy233 hyde_eddy233)
        throws SystemException {
        return getPersistence().update(hyde_eddy233);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Hyde_eddy233 update(Hyde_eddy233 hyde_eddy233,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(hyde_eddy233, serviceContext);
    }

    /**
    * Caches the hyde_eddy233 in the entity cache if it is enabled.
    *
    * @param hyde_eddy233 the hyde_eddy233
    */
    public static void cacheResult(
        fi.csc.smear.db.model.Hyde_eddy233 hyde_eddy233) {
        getPersistence().cacheResult(hyde_eddy233);
    }

    /**
    * Caches the hyde_eddy233s in the entity cache if it is enabled.
    *
    * @param hyde_eddy233s the hyde_eddy233s
    */
    public static void cacheResult(
        java.util.List<fi.csc.smear.db.model.Hyde_eddy233> hyde_eddy233s) {
        getPersistence().cacheResult(hyde_eddy233s);
    }

    /**
    * Creates a new hyde_eddy233 with the primary key. Does not add the hyde_eddy233 to the database.
    *
    * @param samptime the primary key for the new hyde_eddy233
    * @return the new hyde_eddy233
    */
    public static fi.csc.smear.db.model.Hyde_eddy233 create(
        java.util.Date samptime) {
        return getPersistence().create(samptime);
    }

    /**
    * Removes the hyde_eddy233 with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the hyde_eddy233
    * @return the hyde_eddy233 that was removed
    * @throws fi.csc.smear.db.NoSuchHyde_eddy233Exception if a hyde_eddy233 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Hyde_eddy233 remove(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchHyde_eddy233Exception {
        return getPersistence().remove(samptime);
    }

    public static fi.csc.smear.db.model.Hyde_eddy233 updateImpl(
        fi.csc.smear.db.model.Hyde_eddy233 hyde_eddy233)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(hyde_eddy233);
    }

    /**
    * Returns the hyde_eddy233 with the primary key or throws a {@link fi.csc.smear.db.NoSuchHyde_eddy233Exception} if it could not be found.
    *
    * @param samptime the primary key of the hyde_eddy233
    * @return the hyde_eddy233
    * @throws fi.csc.smear.db.NoSuchHyde_eddy233Exception if a hyde_eddy233 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Hyde_eddy233 findByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.smear.db.NoSuchHyde_eddy233Exception {
        return getPersistence().findByPrimaryKey(samptime);
    }

    /**
    * Returns the hyde_eddy233 with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param samptime the primary key of the hyde_eddy233
    * @return the hyde_eddy233, or <code>null</code> if a hyde_eddy233 with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.smear.db.model.Hyde_eddy233 fetchByPrimaryKey(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(samptime);
    }

    /**
    * Returns all the hyde_eddy233s.
    *
    * @return the hyde_eddy233s
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Hyde_eddy233> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the hyde_eddy233s.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyde_eddy233ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyde_eddy233s
    * @param end the upper bound of the range of hyde_eddy233s (not inclusive)
    * @return the range of hyde_eddy233s
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Hyde_eddy233> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the hyde_eddy233s.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Hyde_eddy233ModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of hyde_eddy233s
    * @param end the upper bound of the range of hyde_eddy233s (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of hyde_eddy233s
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.smear.db.model.Hyde_eddy233> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the hyde_eddy233s from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of hyde_eddy233s.
    *
    * @return the number of hyde_eddy233s
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static Hyde_eddy233Persistence getPersistence() {
        if (_persistence == null) {
            _persistence = (Hyde_eddy233Persistence) PortletBeanLocatorUtil.locate(fi.csc.smear.db.service.ClpSerializer.getServletContextName(),
                    Hyde_eddy233Persistence.class.getName());

            ReferenceRegistry.registerReference(Hyde_eddy233Util.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(Hyde_eddy233Persistence persistence) {
    }
}
