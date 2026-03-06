package com.lebo.stringtester.adapterService;


import com.lebo.stringtester.model.SubClass;

//why i used this..because of related methods ie APX,WPX,WX's methods..basically to group related methods
public interface DestionationAapter {
    String process(SubClass request);
}
