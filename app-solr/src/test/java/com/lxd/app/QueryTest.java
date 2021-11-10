package com.lxd.app;

import com.lxd.app.dao.solr.Query;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class QueryTest extends BaseTest{

    @Autowired
    private Query query;

    @Test
    public void test01(){
        query.queryString("");
    }
}
