package com.newsoftvalley.myserver.rest.resources;

import com.linkedin.restli.common.ComplexResourceKey;
import com.linkedin.restli.common.EmptyRecord;
import com.linkedin.restli.common.HttpStatus;
import com.linkedin.restli.server.CreateResponse;
import com.linkedin.restli.server.UpdateResponse;
import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.resources.ComplexKeyResourceTemplate;
import com.newsoftvalley.myserver.rest.services.XyzService;
import javax.inject.Inject;
import javax.inject.Named;
import nam.e.spa.ce.Xyz;
import nam.e.spa.ce.XyzKey;

@RestLiCollection(name = "xyz", namespace = "nam.e.spa.ce")
public class XyzResource extends ComplexKeyResourceTemplate<XyzKey, EmptyRecord, Xyz> {

  //private final XyzService _xyzService = new XyzService();
  @Inject @Named("xyzService")
  private XyzService _xyzService;


  @Override
  public Xyz get(ComplexResourceKey<XyzKey, EmptyRecord> complexResourceKey) {
    XyzKey xyzKey = complexResourceKey.getKey();
    return _xyzService.get(xyzKey);
  }

  @Override
  public CreateResponse create(Xyz xyz) {
    return new CreateResponse(HttpStatus.S_200_OK);
  }

  @Override
  public UpdateResponse update(ComplexResourceKey<XyzKey, EmptyRecord> complexResourceKey, Xyz xyz) {
    return new UpdateResponse(HttpStatus.S_200_OK);
  }

  @Override
  public UpdateResponse delete(ComplexResourceKey<XyzKey, EmptyRecord> complexResourceKey) {
    return new UpdateResponse(HttpStatus.S_200_OK);
  }
}
