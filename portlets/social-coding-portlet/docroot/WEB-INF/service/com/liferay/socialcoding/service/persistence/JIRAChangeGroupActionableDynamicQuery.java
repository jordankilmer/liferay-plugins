/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.socialcoding.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;

import com.liferay.socialcoding.model.JIRAChangeGroup;
import com.liferay.socialcoding.service.JIRAChangeGroupLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @deprecated As of 7.0.0, replaced by {@link JIRAChangeGroupLocalServiceUtil#getExportActionableDynamicQuery()}
 * @generated
 */
@Deprecated
public abstract class JIRAChangeGroupActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public JIRAChangeGroupActionableDynamicQuery() {
		setBaseLocalService(JIRAChangeGroupLocalServiceUtil.getService());
		setClass(JIRAChangeGroup.class);

		setClassLoader(com.liferay.socialcoding.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("jiraChangeGroupId");
	}
}