package com.okta.kotlin

import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "coffeshops", path = "coffeshops")
interface CoffeeShopRepository : CrudRepository<CoffeeShopModel, Long> {

}