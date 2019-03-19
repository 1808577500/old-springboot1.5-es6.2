package com.test.es.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 读取client配置信息
 * @author 
 *
 */
@Configuration
public class ClientConfig {
    
    /** 
     * elk集群地址 
     */  
    @Value("${elasticsearch.ip}")
    private String esHostName;  
    /** 
     * 端口 
     */  
    @Value("${elasticsearch.port}")
    private Integer esPort;  
    /** 
     * 集群名称 
     */  
    @Value("${elasticsearch.cluster.name}")
    private String esClusterName;  
  
    /** 
     * 连接池 
     */  
    @Value("${elasticsearch.pool}")
    private Integer esPoolSize;  
  
    
    /** 
     * 是否服务启动时重新创建索引
     */  
    @Value("${elasticsearch.regenerateIndexEnabled}")
    private Boolean esRegenerateIndexFlag; 
    
    
    /** 
     * 是否服务启动时索引数据同步
     */  
    @Value("${elasticsearch.syncDataEnabled}")
    private Boolean esSyncDataEnabled;


	public String getEsHostName() {
		return esHostName;
	}


	public void setEsHostName(String esHostName) {
		this.esHostName = esHostName;
	}


	public Integer getEsPort() {
		return esPort;
	}


	public void setEsPort(Integer esPort) {
		this.esPort = esPort;
	}


	public String getEsClusterName() {
		return esClusterName;
	}


	public void setEsClusterName(String esClusterName) {
		this.esClusterName = esClusterName;
	}


	public Integer getEsPoolSize() {
		return esPoolSize;
	}


	public void setEsPoolSize(Integer esPoolSize) {
		this.esPoolSize = esPoolSize;
	}


	public Boolean getEsRegenerateIndexFlag() {
		return esRegenerateIndexFlag;
	}


	public void setEsRegenerateIndexFlag(Boolean esRegenerateIndexFlag) {
		this.esRegenerateIndexFlag = esRegenerateIndexFlag;
	}


	public Boolean getEsSyncDataEnabled() {
		return esSyncDataEnabled;
	}


	public void setEsSyncDataEnabled(Boolean esSyncDataEnabled) {
		this.esSyncDataEnabled = esSyncDataEnabled;
	} 
    
}
