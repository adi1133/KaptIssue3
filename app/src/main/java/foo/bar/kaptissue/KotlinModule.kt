package foo.bar.kaptissue

import dagger.Module
import dagger.Provides

/**
 * Created by Adrian Pascu on 04.07.2016.
 * mail@adipascu.ro
 */
@Module
class KotlinModule {
    @Provides
    fun provideString() = "someString"
}