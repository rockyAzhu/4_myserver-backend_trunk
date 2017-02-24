package com.newsoftvalley.myserver.rest.resources;

import com.linkedin.restli.common.HttpStatus;
import com.linkedin.restli.server.CreateResponse;
import com.linkedin.restli.server.UpdateResponse;
import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;
import com.newsoftvalley.myserver.rest.services.AbcService;
import javax.inject.Inject;
import javax.inject.Named;
import nam.e.spa.ce.Abc;


@RestLiCollection(name = "abc", namespace = "nam.e.spa.ce")
public class AbcResource
    extends CollectionResourceTemplate<String, Abc> {

  @Inject @Named("abcService")
  private AbcService _abcService;
  //private AbcService _abcService = new AbcService();

  @Override
  public Abc get(String key) {
    return _abcService.get(key);
  }

  @Override
  public CreateResponse create(Abc abc) {
    return new CreateResponse(HttpStatus.S_201_CREATED);
  }

  @Override
  public UpdateResponse update(String key, Abc entity) {
    return new UpdateResponse(HttpStatus.S_200_OK);
  }

  @Override
  public UpdateResponse delete(String key) {
    return new UpdateResponse(HttpStatus.S_200_OK);
  }
}

