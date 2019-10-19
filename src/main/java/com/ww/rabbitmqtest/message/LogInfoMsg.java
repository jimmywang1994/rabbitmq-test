package com.ww.rabbitmqtest.message;

import java.io.Serializable;
import java.util.Objects;

public class LogInfoMsg implements Serializable {
    private Long id;
    private String name;
    private String info;

    public LogInfoMsg(Long id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogInfoMsg that = (LogInfoMsg) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(info, that.info);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, info);
    }
}
