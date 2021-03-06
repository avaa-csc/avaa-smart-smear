package fi.csc.smear.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Sii1metaLocalService}.
 *
 * @author pj
 * @see Sii1metaLocalService
 * @generated
 */
public class Sii1metaLocalServiceWrapper implements Sii1metaLocalService,
    ServiceWrapper<Sii1metaLocalService> {
    private Sii1metaLocalService _sii1metaLocalService;

    public Sii1metaLocalServiceWrapper(
        Sii1metaLocalService sii1metaLocalService) {
        _sii1metaLocalService = sii1metaLocalService;
    }

    /**
    * Adds the sii1meta to the database. Also notifies the appropriate model listeners.
    *
    * @param sii1meta the sii1meta
    * @return the sii1meta that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Sii1meta addSii1meta(
        fi.csc.smear.db.model.Sii1meta sii1meta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sii1metaLocalService.addSii1meta(sii1meta);
    }

    /**
    * Creates a new sii1meta with the primary key. Does not add the sii1meta to the database.
    *
    * @param samptime the primary key for the new sii1meta
    * @return the new sii1meta
    */
    @Override
    public fi.csc.smear.db.model.Sii1meta createSii1meta(
        java.util.Date samptime) {
        return _sii1metaLocalService.createSii1meta(samptime);
    }

    /**
    * Deletes the sii1meta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param samptime the primary key of the sii1meta
    * @return the sii1meta that was removed
    * @throws PortalException if a sii1meta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Sii1meta deleteSii1meta(
        java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _sii1metaLocalService.deleteSii1meta(samptime);
    }

    /**
    * Deletes the sii1meta from the database. Also notifies the appropriate model listeners.
    *
    * @param sii1meta the sii1meta
    * @return the sii1meta that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Sii1meta deleteSii1meta(
        fi.csc.smear.db.model.Sii1meta sii1meta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sii1metaLocalService.deleteSii1meta(sii1meta);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _sii1metaLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sii1metaLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii1metaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _sii1metaLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii1metaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sii1metaLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sii1metaLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sii1metaLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public fi.csc.smear.db.model.Sii1meta fetchSii1meta(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sii1metaLocalService.fetchSii1meta(samptime);
    }

    /**
    * Returns the sii1meta with the primary key.
    *
    * @param samptime the primary key of the sii1meta
    * @return the sii1meta
    * @throws PortalException if a sii1meta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Sii1meta getSii1meta(java.util.Date samptime)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _sii1metaLocalService.getSii1meta(samptime);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _sii1metaLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the sii1metas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.smear.db.model.impl.Sii1metaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of sii1metas
    * @param end the upper bound of the range of sii1metas (not inclusive)
    * @return the range of sii1metas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.smear.db.model.Sii1meta> getSii1metas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sii1metaLocalService.getSii1metas(start, end);
    }

    /**
    * Returns the number of sii1metas.
    *
    * @return the number of sii1metas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getSii1metasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sii1metaLocalService.getSii1metasCount();
    }

    /**
    * Updates the sii1meta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param sii1meta the sii1meta
    * @return the sii1meta that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.smear.db.model.Sii1meta updateSii1meta(
        fi.csc.smear.db.model.Sii1meta sii1meta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _sii1metaLocalService.updateSii1meta(sii1meta);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _sii1metaLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _sii1metaLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _sii1metaLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public Sii1metaLocalService getWrappedSii1metaLocalService() {
        return _sii1metaLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSii1metaLocalService(
        Sii1metaLocalService sii1metaLocalService) {
        _sii1metaLocalService = sii1metaLocalService;
    }

    @Override
    public Sii1metaLocalService getWrappedService() {
        return _sii1metaLocalService;
    }

    @Override
    public void setWrappedService(Sii1metaLocalService sii1metaLocalService) {
        _sii1metaLocalService = sii1metaLocalService;
    }
}
