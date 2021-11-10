package com.lxd.app.po;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection = "std_nbsj_zrzyhghj_ldsp")
public class Ldsp {

    @Id
    @Field
    private String id;
    @Field
    private String xmbh;
    @Field
    private String xmmc;
    @Field
    private String lxdh;
    @Field
    private String ydxz;
    @Field
    private String lxr;
    @Field
    private String jswz;
    @Field
    private String jsdw;
    @Field
    private String zh;
    @Field
    private String mtime;
}
