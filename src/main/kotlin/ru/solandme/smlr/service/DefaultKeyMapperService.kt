package ru.solandme.smlr.service

import org.springframework.stereotype.Component
import java.util.concurrent.ConcurrentHashMap


@Component
class DefaultKeyMapperService : KeyMapperService {

    private val map: MutableMap<String, String> = ConcurrentHashMap()

    override fun add(key: String, link: String): KeyMapperService.Add {

        if (map.containsKey(key)) {
            return KeyMapperService.Add.AlreadyExist(key)
        } else {
            map.put(key, link)
            return KeyMapperService.Add.Success(key, link)
        }

    }

    override fun getLink(key: String) = if (map.containsKey(key)) {
        KeyMapperService.Get.Link(map.get(key)!!)
    } else {
        KeyMapperService.Get.NotFound(key)
    }
}