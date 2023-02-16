package com.fluxo.fxcx.restAPI.transaction;

public class Transaction {
    private Long id;
    private String category;
    private String subcategory;
    private String description;
    private String inorout;
    private String receiver;
    private Long value;

    public Transaction(Long id, String category, String subcategory, String description, String inorout, String receiver, Long value) {
        this.id = id;
        this.category = category;
        this.subcategory = subcategory;
        this.description = description;
        this.inorout = inorout;
        this.receiver = receiver;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInorout() {
        return inorout;
    }

    public void setInorout(String inorout) {
        this.inorout = inorout;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }
}