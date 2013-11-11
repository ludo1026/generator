package org.ludo.umlgenerator.xml.core.bean.impl;

import org.ludo.umlgenerator.xml.core.bean.IXMIMultiplicity;
import org.ludo.utils.AssertHelper;

public class XMIMultiplicityBean implements IXMIMultiplicity {
		
	private final String minimum;
	private final String maximum;
	
	public XMIMultiplicityBean(String minimum, String maximum) {
		AssertHelper.assertDefined(minimum, "minimum");
		this.minimum = minimum;
		AssertHelper.assertDefined(maximum, "maximum");
		this.maximum = maximum;
	}

	public String getMinimum() {
		return minimum;
	}

	public String getMaximum() {
		return maximum;
	}
	
}
