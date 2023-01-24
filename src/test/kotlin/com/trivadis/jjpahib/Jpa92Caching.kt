package com.trivadis.jjpahib

import com.trivadis.jjpahib.entity.*
import com.trivadis.jjpahib.service.UserService
import jakarta.persistence.EntityManager
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.cache.annotation.EnableCaching
import org.springframework.test.annotation.Commit
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDateTime
import java.util.*
import javax.cache.CacheManager
import javax.cache.configuration.Configuration
import javax.cache.configuration.MutableConfiguration

@SpringBootTest(properties = arrayOf(
    "spring.jpa.properties.javax.persistence.sharedCache.mode=ENABLE_SELECTIVE",
    "spring.jpa.properties.hibernate.cache.use_second_level_cache=true",
    "spring.jpa.properties.hibernate.cache.use_query_cache=true",
    "spring.jpa.properties.hibernate.cache.region.factory_class=org.hibernate.cache.jcache.internal.JCacheRegionFactory"
))
@EnableCaching
//@Transactional
//@Commit
class Jpa92Caching {

    @Autowired
    lateinit var service: UserService;

    @Autowired
    lateinit var cm: CacheManager;


    @Test
    fun doCaching() {

        val user = service.find(552L);
        val user2 = service.find(552L);

        println("sameInstance? "+(user == user2))

        val query1:List<User> = service.querySmaller(10000);
        val query2:List<User> = service.querySmaller(10000);
/*
        val query = em.createQuery("SELECT u from User u WHERE id<:id")
        query.setParameter("id", 10000L);
        println("size = ${query.resultList.size}");

        val query2 = em.createQuery("SELECT u from User u WHERE id<:id")
        query2.setParameter("id", 10000L);
        println("size = ${query2.resultList.size}");
*/
        println(cm.cacheNames)
    }

}
