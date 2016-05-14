package foo.bar.kaptissue

import dagger.Component

/**
 * Created by Adrian Pascu on 04.07.2016.
 * mail@adipascu.ro
 */
@Component(modules = arrayOf(KotlinModule::class))
interface KotlinComponent {
    fun string(): String
}