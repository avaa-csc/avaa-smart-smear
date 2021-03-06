package fi.csc.smear.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Hyde_eddy233. This utility wraps
 * {@link fi.csc.smear.db.service.impl.Hyde_eddy233ServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author pj
 * @see Hyde_eddy233Service
 * @see fi.csc.smear.db.service.base.Hyde_eddy233ServiceBaseImpl
 * @see fi.csc.smear.db.service.impl.Hyde_eddy233ServiceImpl
 * @generated
 */
public class Hyde_eddy233ServiceUtil {
    private static Hyde_eddy233Service _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.smear.db.service.impl.Hyde_eddy233ServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static Hyde_eddy233Service getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    Hyde_eddy233Service.class.getName());

            if (invokableService instanceof Hyde_eddy233Service) {
                _service = (Hyde_eddy233Service) invokableService;
            } else {
                _service = new Hyde_eddy233ServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(Hyde_eddy233ServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(Hyde_eddy233Service service) {
    }
}
