/**
 * 
 */
package com.webmethods.caf.cxportal;

/**
 * @author ZSAIB
 *
 */

import javax.portlet.PortletPreferences;

public class Cxportal  extends   com.webmethods.caf.faces.bean.BaseFacesPreferencesBean {

	public static final String[] PREFERENCES_NAMES = new String[] {};
	private com.webmethods.caf.Tdportletsuppliercxportal tdportletsuppliercxportal = null;
	
	/**
	 * Create new preferences bean with list of preference names
	 */
	public Cxportal() {
		super(PREFERENCES_NAMES);
	}
	
	/**
	 * Call this method in order to persist
	 * Portlet preferences
	 */
	public void storePreferences() throws Exception {
		updatePreferences();
		PortletPreferences preferences = getPreferences();
		preferences.store();
	}

	public com.webmethods.caf.Tdportletsuppliercxportal getTdportletsuppliercxportal()  {
		if (tdportletsuppliercxportal == null) {
		    tdportletsuppliercxportal = (com.webmethods.caf.Tdportletsuppliercxportal)resolveExpression("#{Tdportletsuppliercxportal}");
		}
		return tdportletsuppliercxportal;
	}
}