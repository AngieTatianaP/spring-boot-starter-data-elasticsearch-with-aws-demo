package com.rnd.aws.elasticache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.Cache;
import org.springframework.cache.interceptor.CacheErrorHandler;

public class CustomCacheErrorHandler implements CacheErrorHandler {

  private static final Logger LOG = LoggerFactory.getLogger(CustomCacheErrorHandler.class);

  @Override
  public void handleCacheGetError(RuntimeException e, Cache cache, Object o) {
    LOG.error("getting cache from redis");
  }

  @Override
  public void handleCachePutError(RuntimeException e, Cache cache, Object o, Object o1) {
    LOG.error("putting cache from redis");
  }

  @Override
  public void handleCacheEvictError(RuntimeException e, Cache cache, Object o) {
    LOG.error("evict cache from redis");
  }

  @Override
  public void handleCacheClearError(RuntimeException e, Cache cache) {
    LOG.error("clearing cache from redis");
  }
}
