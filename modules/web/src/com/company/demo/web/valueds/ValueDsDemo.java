package com.company.demo.web.valueds;

import com.haulmont.cuba.core.entity.KeyValueEntity;
import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.data.CollectionDatasource;

import javax.inject.Inject;

public class ValueDsDemo extends AbstractWindow {

    @Inject
    private CollectionDatasource<KeyValueEntity, Object> salesDs;

    public void refresh() {
        salesDs.refresh();
    }
}