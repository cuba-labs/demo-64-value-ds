package com.company.demo.web.valueds;

import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.data.Datasource;
import com.haulmont.cuba.gui.data.impl.DatasourceImplementation;

public class ValueDsDemo extends AbstractWindow {

    public void refresh() {
        getDsContext().getNN("salesDs").refresh();
    }
}