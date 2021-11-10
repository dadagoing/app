package com.lxd.app;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SolrDemo {
    private static final String SOLR_URL = "http://192.168.64.129:8983/solr/new_core/";

    public static void main(String[] args) throws SolrServerException, IOException {
        //创建solr客户端连接
        HttpSolrClient hsc = new HttpSolrClient.Builder(SOLR_URL).build();
        //创建查询对象
        SolrQuery query = new SolrQuery();
        //query.setQuery("*:*");//设置查询全部数据的条件
        query.setQuery("lxr:罗汉白"); //列名:值

        List<Map<String, Object>> list = getSolrQuery(hsc, query);
        if (list == null) {
            System.out.println("未查询到任何结果");
            return;
        }
        for (Map<String, Object> map : list) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                String key = it.next();
                Object value = map.get(key);
                System.out.println(key + "----" + value);
            }
            System.out.println("=======================================");
        }
    }

    public static List<Map<String, Object>> getSolrQuery(HttpSolrClient client, SolrQuery query) throws SolrServerException, IOException {
        List<Map<String, Object>> list = null;
        //执行查询并返回结果
        QueryResponse resp = client.query(query);
        SolrDocumentList results = resp.getResults();
        //获取查询到的数据总量
        long numFound = results.getNumFound();
        //判断总量是否大于0，
        if (numFound <= 0) {
            //如果小于0，表示未查询到任何数据，返回null
            return null;
        } else {
            //如果大于0，表示有数据
            //创建list存储每条数据
            list = new ArrayList<>();
            //遍历结果集
            for (SolrDocument doc : results) {
                //得到每条数据的map集合
                Map<String, Object> map = doc.getFieldValueMap();
                //添加到list
                list.add(map);
            }
            //返回list集合
            return list;
        }
    }
}