package com.lebo.stringtester.model;

public  class SubClass extends BaseClass {


    private String results;
    //getter

    public String getResults() {
        return results;
    }

    public void setResults(String results) {

        this.results = results;
    }

    @Override
    public String RouterKeyOne() {
        if (getEntryPoint() == null || getEntryPoint().length() < 2) {
            return "Nothing";
        }
        return getEntryPoint().substring(0, 2);
    }

    @Override
    public String RouterKeyTwo() {
        if (getEntryPoint() == null || getEntryPoint().length() < 2) {
            return "Nothing";

        }
        return getEntryPoint().substring(getEntryPoint().length() - 2);
    }
}

