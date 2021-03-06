package com.qbt.data.migration.pgsql.entity;

public class TablePrivileges {
    private Object grantor;

    private Object grantee;

    private Object table_catalog;

    private Object table_schema;

    private Object table_name;

    private Object privilege_type;

    private Object is_grantable;

    private Object with_hierarchy;

    public Object getGrantor() {
        return grantor;
    }

    public void setGrantor(Object grantor) {
        this.grantor = grantor;
    }

    public Object getGrantee() {
        return grantee;
    }

    public void setGrantee(Object grantee) {
        this.grantee = grantee;
    }

    public Object getTable_catalog() {
        return table_catalog;
    }

    public void setTable_catalog(Object table_catalog) {
        this.table_catalog = table_catalog;
    }

    public Object getTable_schema() {
        return table_schema;
    }

    public void setTable_schema(Object table_schema) {
        this.table_schema = table_schema;
    }

    public Object getTable_name() {
        return table_name;
    }

    public void setTable_name(Object table_name) {
        this.table_name = table_name;
    }

    public Object getPrivilege_type() {
        return privilege_type;
    }

    public void setPrivilege_type(Object privilege_type) {
        this.privilege_type = privilege_type;
    }

    public Object getIs_grantable() {
        return is_grantable;
    }

    public void setIs_grantable(Object is_grantable) {
        this.is_grantable = is_grantable;
    }

    public Object getWith_hierarchy() {
        return with_hierarchy;
    }

    public void setWith_hierarchy(Object with_hierarchy) {
        this.with_hierarchy = with_hierarchy;
    }
}