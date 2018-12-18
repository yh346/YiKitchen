package com.qfedu.yikitchen.pojo;

import java.util.List;

public class Product {
    private Integer id;

    private String pname;

    private Integer typeid;

    private Integer price;

    private String productdesc;

    private String typeName;

    private String url;

    private List<Pitcure> pitcures;

    public List<Pitcure> getPitcures() {
        return pitcures;
    }

    public void setPitcures(List<Pitcure> pitcures) {
        this.pitcures = pitcures;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                ", typeid=" + typeid +
                ", price=" + price +
                ", productdesc='" + productdesc + '\'' +
                ", typeName='" + typeName + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getProductdesc() {
        return productdesc;
    }

    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc == null ? null : productdesc.trim();
    }
}