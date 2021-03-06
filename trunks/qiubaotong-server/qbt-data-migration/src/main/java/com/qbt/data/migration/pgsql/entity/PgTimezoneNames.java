package com.qbt.data.migration.pgsql.entity;

public class PgTimezoneNames {
    private String name;

    private String abbrev;

    private Object utc_offset;

    private Boolean is_dst;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev == null ? null : abbrev.trim();
    }

    public Object getUtc_offset() {
        return utc_offset;
    }

    public void setUtc_offset(Object utc_offset) {
        this.utc_offset = utc_offset;
    }

    public Boolean getIs_dst() {
        return is_dst;
    }

    public void setIs_dst(Boolean is_dst) {
        this.is_dst = is_dst;
    }
}