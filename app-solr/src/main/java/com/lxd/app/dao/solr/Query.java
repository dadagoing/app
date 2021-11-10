package com.lxd.app.dao.solr;


import com.lxd.app.po.Ldsp;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Query {

    @Autowired
    private SolrClient solrClient;

    public void queryString(String word){
        SolrQuery query = new SolrQuery();
        query.add("lxr","罗汉白");
        try {
            QueryResponse response = solrClient.query(query);

            for (Ldsp ldsp : response.getBeans(Ldsp.class)) {
                System.out.println(ldsp);
            }

        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
